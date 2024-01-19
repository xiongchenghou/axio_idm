package jp.co.axio.masterMentsetSystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.MOrganizationEntity;
import jp.co.axio.masterMentsetSystem.model.MOrganizationEntityExample;
import jp.co.axio.masterMentsetSystem.model.MgpCodeMst;
import jp.co.axio.masterMentsetSystem.model.MgpCodeMstExample;
import jp.co.axio.masterMentsetSystem.model.OOpeLog;
import jp.co.axio.masterMentsetSystem.model.VGpCodeMst;
import jp.co.axio.masterMentsetSystem.model.VGpCodeMstExample;
import jp.co.axio.masterMentsetSystem.repository.MOrganizationEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.MSystemCriterionDtMapper;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;
import jp.co.axio.masterMentsetSystem.repository.OOpeLogMapper;
import jp.co.axio.masterMentsetSystem.repository.VGpCodeMstMapper;

/**
 * 共通
 */

@Service
public class CommonService {

	@Autowired
	VGpCodeMstMapper vGpCodeMstMapper;
	
	@Autowired
	MOrganizationEntityMapper mOrganizationEntityMapper;
	
	@Autowired
	OOpeLogMapper oOpeLogMapper;
	
	@Autowired
	MSystemCriterionDtMapper mSystemCriterionDtMapper;

	@Autowired
	MgpCodeMstMapper mgpCodeMstMapper;

    private final DatabaseService databaseService;
    
    @Autowired
    public CommonService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	
	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;
    /**
     * システム基準日を取得
     * @param vo
     * @return
     */
    public Date getSysCriterionDt() {

		
    	String dbCriDt = databaseService.getString("select gettoday()");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Date date = new Date();
        try {
            // 文字列をDateに変換
            date = sdf.parse(dbCriDt);
        } catch (ParseException e) {
        	LogService.info("", this.getClass().getSimpleName(), "システム基準日取得処理", "失敗しました。" + e.getMessage() );
        }
        return date;
    }
    
    /**
     * DBのシステム時刻を取得
     * @return
     */
    public Date getDbSysDt() {
    	
        String dateString = databaseService.getString("SELECT TO_CHAR(NOW(), 'YYYY/MM/DD HH24:MI:SS.MS') AS formatted_datetime");;
        String formatPattern = "yyyy/MM/dd HH:mm:ss.SSS";
        Date date = new Date();
        try {
            // SimpleDateFormatを使用して文字列をDateに変換
            SimpleDateFormat sdf = new SimpleDateFormat(formatPattern);
            date = sdf.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /**
     * 汎用マスタ取得（PullDown）
     * @param vo
     * @return
     */
    public List<PulldownItemDto> getGpCodeMstList(String categoryCode) {
    	
    	
    	VGpCodeMstExample condi = new VGpCodeMstExample();
    	
    	condi.createCriteria().andCategoryCdEqualTo(categoryCode);
    	
    	List<VGpCodeMst> vList = vGpCodeMstMapper.selectByExample(condi);
    	
    	// 戻り値
    	List<PulldownItemDto> result = vList.stream()
    			.map(vo -> new PulldownItemDto(vo.getValue1(), vo.getValue2())) 
    			.collect(Collectors.toList());
    	
    	PulldownItemDto newItem = new PulldownItemDto(MmsConstants.UNSELECT_PULLDOWN_ITEM_CODE, MmsConstants.UNSELECT_PULLDOWN_ITEM_VAL);
    	result.add(0, newItem);
    	
    	return result;
    }
    
    /**
     * 組織マスタ取得（PullDown）
     * @param vo
     * @return
     */
    public List<PulldownItemDto> getOrgList(String companyCode) {
    	
    	
    	MOrganizationEntityExample condi = new MOrganizationEntityExample();
    	
    	condi.createCriteria().andCompanyCodeEqualTo(companyCode);
    	
    	List<MOrganizationEntity> vList = mOrganizationEntityMapper.selectByExample(condi);
    	
    	// 戻り値
    	List<PulldownItemDto> result = vList.stream()
    			.map(vo -> new PulldownItemDto(vo.getCompanyCode() + "-" + vo.getOrganizationCode(), vo.getOrganizationNameJp())) 
    			.collect(Collectors.toList());
    	
    	PulldownItemDto newItem = new PulldownItemDto(MmsConstants.UNSELECT_PULLDOWN_ITEM_CODE, MmsConstants.UNSELECT_PULLDOWN_ITEM_VAL);
    	result.add(0, newItem);

    	return result;
    }
    
    
    //パスワード関連■　START

	/**
	 * A：大文字；a: 小文字 0:数字；$:記号
	 */
//	private static final String patPattern = "Aa0$";

	/**
	 * 半角記号の文字
	 * \p{Punct} 公式ドキュメントより引用
	 * https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/regex/Pattern.html
	 */
	/**
	 * 半角記号の文字
	 * \p{Punct} より、禁止文字(「ダブルクォート(")」、「シングルクォート(')」、「バックチック(`)」、「カンマ(,)」)を除く。
	 */
	private static final String PWD_K_CHAR = "#$%&()*+-./:;<=>?@[\\]^_{|}~";
	private static final String PWD_B_CHAR = "ABCDEFGHJKLMNPQRSTUVWXYZ";
	private static final String PWD_S_CHAR = "abcdefghjkmnpqrstuvwxyz";
	private static final String PWD_N_CHAR = "23456789";

	/**
	 * パターンに沿って文字列を生成する。
	 * @param pattern  「A」、「a」、「0」、「$」の4文字の組合せを指定する。
	 * 　　　　　　　　　　　　　　「A」：　半角英大文字を1文字生成する。
	 * 　　　　　　　　　　　　　　「a」：　半角英小文字を1文字生成する。
	 * 　　　　　　　　　　　　　　「0」：　半角数字字を1文字生成する。
	 * 　　　　　　　　　　　　　　「$」：　半角記号を1文字生成する。記号の範囲は、固定。
	 * 　　　　　　　　　　　　　実行例：　
	 *                   RandomStringUtil.generate("Aa0$Aa0$")
	 * @return
	 */
	public String generatePwd(String pattern) {

		String ret = "";

		char[] charsPattern = pattern.toCharArray();
		for( char chPat: charsPattern) {
			switch( chPat ){
				case 'A':
					ret += getRandomCharacter(PWD_B_CHAR);
					break;
				case 'a':
					ret += getRandomCharacter(PWD_S_CHAR);
					break;
				case '0':
					ret += getRandomCharacter(PWD_N_CHAR);
					break;
				case '$':
					ret += getRandomCharacter(PWD_K_CHAR);
					break;
				default:
					// ここには来ません。
					break;
			}
		}
		return ret;
	}

//    /**
//     * パスワードパターンの有効性をチェックする
//     * @param pattern
//     * @return
//     */
//    private boolean chkPatternValidate(String pattern) {
//
//    	if(pattern.contains(String.valueOf("A"))
//    			&& pattern.contains(String.valueOf("a"))
//    			&& pattern.contains(String.valueOf("0"))
//    			&& pattern.contains(String.valueOf("$"))) {
//    		return true;
//    	}else {
//    		return false;
//    	}
//	}
//	/**
//	 * パスワードパターンを作成する
//	 * @return
//	 */
//	private String crtPwdPattern() {
//    	String result ="";
//    	for(int i = 0; i< MmsConstants.PWD_LENGTH; i++) {
//
//    		result += getRandomCharacter(patPattern);
//    	}
//		return result;
//	}
	
	/**
	 * 文字列からランダムの文字を一個返す
	 * @param inputString
	 * @return
	 */
	private char getRandomCharacter(String inputString) {
        Random random = new Random();
        int randomIndex = random.nextInt(inputString.length());

        return inputString.charAt(randomIndex);
    }
    //パスワード関連■　END

	/**
	 * 文字列の比較を行う。指定数(以上)の共通する文字列を含むことを確認する。
	 * @param srcA
	 * @param srcB
	 * @param commonCount  1以上を指定する。
	 * @return 共通する文字列を含む場合、true を返する
	 * @see
	 * https://commons.apache.org/proper/commons-text/apidocs/org/apache/commons/text/similarity/package-summary.html
	 * https://commons.apache.org/proper/commons-lang/apidocs/index.html?org/apache/commons/lang3/StringUtils.html
	 *	// https://commons.apache.org/proper/commons-lang/apidocs/index.html?org/apache/commons/lang3/StringUtils.html
	 *	// public static String substring(String str, int start, int end)
	 *	// StringUtils.substring("abc", 0, 2)   = "ab"
	 *	//
	 *	// public static int indexOf(CharSequence seq, CharSequence searchSeq)
	 *	// StringUtils.indexOf("aabaabaa", "ab") = 1
	 *	//
	 *	// public static int indexOfAny(CharSequence str, CharSequence... searchStrs)
	 *	// StringUtils.indexOfAny("zzabyycdxx", ["ab", "cd"])   = 2
	 *
	 */
	public boolean checkLike(String srcA, String srcB, int commonCount) {
		if (StringUtils.isEmpty(srcA) ) return false;
		if (StringUtils.isEmpty(srcB) ) return false;
		if (commonCount < 1 ) return false;

		if( srcA.length() < commonCount ) return false;
		if( srcB.length() < commonCount ) return false;

		String strAA = srcA;
		String strBB = srcB;
		if( srcB.length() < srcA.length() ) {
			strAA = srcB;
			strBB = srcA;
		}

		int last = strAA.length() - commonCount + 1;
		for(int i = 0; i < last; i++ ) {
			String subA = StringUtils.substring(strAA, i, i + commonCount);
			int pos = StringUtils.indexOf(strBB, subA);
			if( pos >= 0 ) {
				// 見つかった。
				return true;
			}
		}

		return false;
	}
    
	
	/**
	 * 操作ログ登録
	 * @param funcId
	 * @param funcName
	 * @param targetUserId
	 * @param detail
	 */
	public void insOpelog(String funcId, String funcName, String targetUserId, String detail) {

		Date tmpDate = getDbSysDt();
		OOpeLog opeLog = new OOpeLog();
		
		opeLog.setFuncId(funcId);
		opeLog.setFuncName(funcName);
		opeLog.setOperationUserId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		opeLog.setTargetUserId(targetUserId);
		opeLog.setOperationTs(tmpDate);
		opeLog.setOperationDetail(detail);
		opeLog.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		opeLog.setRegistTs(tmpDate);
		opeLog.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		opeLog.setUpdateTs(tmpDate);
		oOpeLogMapper.insert(opeLog);
	}
    
	
	/**
	 * 汎用コードマスタ
	 * @param classCode
	 * @return
	 */
	public List<MgpCodeMst> getMgpCodeMstList(String classCode){
		MgpCodeMstExample condi = new MgpCodeMstExample();
		condi.createCriteria().andClassCodeEqualTo(classCode);
		condi.setOrderByClause(" value_5, code_value ");
		return mgpCodeMstMapper.selectByExample(condi);
		
	}

}
