package jp.co.axio.masterMentsetSystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.controller.UserRegistForm;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class AddOnService {

	
	@Autowired
	CommonService commonService;
	

	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;
	

    private final DatabaseService databaseService;
    
    @Autowired
    public AddOnService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	/**
	 * ユーザ予約データ作成
	 * @param form
	 * @return
	 * @throws ParseException 
	 */
	public TUserSubEntity crtTUserSubEntity(UserRegistForm form) throws ParseException {

        // 現在の日時を取得
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
		TUserSubEntity result = new TUserSubEntity();
		
		// 反映日 = 画面項目.反映日
		result.setReflectionDate(dateFormat.parse(form.getHanEiDt()));

		// ユーザーID = 画面項目.ユーザーID
		result.setUserId(form.getRiYouShaId());

		// 雇用者ID = 画面項目.学籍番号・教職員番号
		result.setEmployeeId(form.getGakuSekiBn());

		// LM内部ID = 画面項目.学籍番号・教職員番号
		result.setLmId(form.getGakuSekiBn());

		// 開始日 = 画面項目.開始日 必須項目　要確認
		if(!"".equals(form.getValidateStartDt())) {
			result.setStartDate(dateFormat.parse(form.getValidateStartDt()));
		}else {
			result.setStartDate(dateFormat.parse(form.getHanEiDt()));
			
		}

		// 終了日 = 画面項目.終了日
		if(!"".equals(form.getValidateEndDt())) {
			result.setEndDate(dateFormat.parse(form.getValidateEndDt()));
		}

		// 初期パスワード = -
		result.setInitPassword("");

		// 削除フラグ = -　0
		result.setDeleteFlag("0");

		// 無効フラグ = - 0
		result.setInvalidFlag("0");

		// 言語コード = - ja固定
		result.setLangCode(MmsConstants.LANG_CODE_JP);

		// 在籍区分 = - 9固定
		result.setEnrollmentKbn("9");

		// 雇用区分 = 画面項目.雇用区分
		result.setEmploymentKbn(form.getRiYouShaDiv());

		// プライマリメールアドレス = 画面項目.プライマリメールアドレス
		result.setMailaddr(form.getMailAddr());

		// セカンダリメールアドレス = -
		result.setMailaddrSecound("");

		// 通知先メールアドレス = -
		result.setMailaddrNotification("");

		// 外線番号 = -
		result.setTel("");

		// 内線番号 = -
		result.setTelEx("");

		// 姓（英語） = 画面項目.姓（英語）
		result.setSurnameEn(form.getSeiEn());

		// 姓（日本語） = 画面項目.姓（日本語）
		result.setSurnameJp(form.getSeiJp());

		// 姓（カタカナ） = -
		result.setSurnameKana("");

		// ミドルネーム（英語） = -
		result.setMiddlenameEn("");

		// ミドルネーム（日本語） = -
		result.setMiddlenameJp("");

		// ミドルネーム（カタカナ） = -
		result.setMiddlenameKana("");

		// 名（英語） = 画面項目.名（英語）
		result.setGivennameEn(form.getMeiEn());

		// 名 (日本語) = 画面項目.名 (日本語)
		result.setGivennameJp(form.getMeiJp());

		// 名 (カタカナ) = -
		result.setGivennameKana("");

		// 通称 姓（英語） = -
		result.setSurnameNickEn("");

		// 通称 姓（日本語） = -
		result.setSurnameNickJp("");

		// 通称 姓（カタカナ） = -
		result.setSurnameNickKana("");

		// 通称 ミドルネーム（英語） = -
		result.setMiddlenameNickEn("");

		// 通称 ミドルネーム（日本語） = -
		result.setMiddlenameNickJp("");

		// 通称 ミドルネーム（カタカナ） = -
		result.setMiddlenameNickKana("");

		// 通称 名（英語） = -
		result.setGivennameNuckEn("");

		// 通称 名 (日本語) = -
		result.setGivennameNuckJp("");

		// 通称 名 (カタカナ) = -
		result.setGivennameNuckKana("");

		//会社マスタ（大学）
		List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00001);
		
		// 所属会社コード = -
		result.setCompanyCode((String)codeList.get(1).getValue());

		// 所属会社名称 = -
		result.setCompanyName((String)codeList.get(1).getLabel());

		// 役職コード = -
		result.setPositionCode("");

		// 役職名称 = -
		result.setPositionName("");

		// 等級コード = -
		result.setGradeCode("");

		// 等級名称 = -
		result.setGradeName("");

		// 所属組織コード = 画面項目.所属
		result.setOrganizationCode("");
		String org_code = form.getShoZoku();
		if (org_code != null && !org_code.isEmpty()) {
			String[] parts = org_code.split("-");
			if (parts.length >= 2) {
				result.setOrganizationCode(parts[1]);
			}
		}

		// 勤務地コード = 画面項目.キャンパス
		result.setLocationCode(form.getCampus());

		// 兼務情報 = -
		result.setKenmuInfo("");

		// 登録者ID = -
		result.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());

		// 登録日時 = CURRENT_TIMESTAMP
		result.setRegistTs(currentDate);

		// 更新者ID = -
		result.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());

		// 更新日時 = CURRENT_TIMESTAMP
		result.setUpdateTs(currentDate);

		// 拡張属性１ = 画面項目.その他１
		result.setExpansionAttr1(form.getOtherItem01());
		
		//		以下の項目について、SQL「SQL-xx-S-05　uidNumber取得」にて連番を発番し、同じ値を登録する	
		//		・	拡張属性２・・・uidNumber(IST)
		//		・	拡張属性３・・・uidNumber(CIS)

		List<Map<String, Object>> resList = databaseService.executeSqlQuery("SELECT nextval('seq_uid_number') uid_number");
		
		
		// 拡張属性２ = 画面項目.その他２
		result.setExpansionAttr2(resList.get(0).get("uid_number").toString());

		// 拡張属性３ = 画面項目.その他３
		result.setExpansionAttr3(resList.get(0).get("uid_number").toString());

		// 拡張属性４ = 画面項目.その他４
		result.setExpansionAttr4(form.getOtherItem04());

		// 拡張属性５ = 画面項目.その他５
		result.setExpansionAttr5(form.getOtherItem05());

		// 拡張属性６ = 画面項目.その他６
		result.setExpansionAttr6(form.getOtherItem06());

		// 拡張属性７ = 画面項目.その他７
		result.setExpansionAttr7(form.getOtherItem07());

		// 拡張属性８ = 画面項目.その他８
		result.setExpansionAttr8(form.getOtherItem08());

		// 拡張属性９ = 画面項目.その他９
		result.setExpansionAttr9(form.getOtherItem09());

		// 拡張属性１０ = 画面項目.その他１０
		result.setExpansionAttr10(form.getOtherItem10());

		// 拡張属性１１ = 画面項目.その他１１
		result.setExpansionAttr11(form.getOtherItem11());

		// 拡張属性１２ = 画面項目.その他１２
		result.setExpansionAttr12(form.getOtherItem12());

		// 拡張属性１３ = 画面項目.その他１３
		result.setExpansionAttr13(form.getOtherItem13());

		// 拡張属性１４ = 画面項目.その他１４
		result.setExpansionAttr14(form.getOtherItem14());

		// 拡張属性１５ = 画面項目.その他１５
		result.setExpansionAttr15(form.getOtherItem15());

		// 拡張属性１６ = 画面項目.その他１６
		result.setExpansionAttr16(form.getOtherItem16());

		// 拡張属性１７ = 画面項目.その他１７
		result.setExpansionAttr17(form.getOtherItem17());

		// 拡張属性１８ = 画面項目.その他１８
		result.setExpansionAttr18(form.getOtherItem18());

		// 拡張属性１９ = 画面項目.その他１９
		result.setExpansionAttr19(form.getOtherItem19());

		// 拡張属性２０ = 画面項目.その他２０
		result.setExpansionAttr20(form.getOtherItem20());

		// 拡張属性２１ = 画面項目.その他２１
		result.setExpansionAttr21(form.getOtherItem21());

		// 拡張属性２２ = 画面項目.その他２２
		result.setExpansionAttr22(form.getOtherItem22());

		// 拡張属性２３ = 画面項目.その他２３
		result.setExpansionAttr23(form.getOtherItem23());

		// 拡張属性２４ = 画面項目.その他２４
		result.setExpansionAttr24(form.getOtherItem24());

		// 拡張属性２５ = 画面項目.その他２５
		result.setExpansionAttr25(form.getOtherItem25());

		// 拡張属性２６ = 画面項目.その他２６
		result.setExpansionAttr26(form.getOtherItem26());

		// 拡張属性２７ = 画面項目.その他２７
		result.setExpansionAttr27(form.getOtherItem27());

		// 拡張属性２８ = 画面項目.その他２８
		result.setExpansionAttr28(form.getOtherItem28());

		// 拡張属性２９ = 画面項目.その他２９ 姓（日本語） + "　" + 名（日本語） 全角スペース区切り
		result.setExpansionAttr29(form.getSeiJp() + "　"+ form.getMeiJp());

		// 拡張属性３０ = 画面項目.その他３０ 名（英語） + " " + 姓（英語） 氏名(英字) 半角スペース区切り
		result.setExpansionAttr30(form.getMeiEn() + " " + form.getSeiEn());

		// 拡張属性３１ = 画面項目.その他３１ 66080 ADアカウント状態　有効
		result.setExpansionAttr31("66080");

		// 拡張属性３２ = 画面項目.その他３２ グループ情報 AD/LDAPグループ(全体) イベント定義 2.3参照
		String grpStr = "";
		// アプリケーション利用フラグ04: システム有効フラグ02	研究用Active Directory
		// アプリケーション利用フラグ05: システム有効フラグ04	教育用Active Directory
		// アプリケーション利用フラグ06: システム有効フラグ05	演習室１Active Directory
		if(form.useApp04) {
			if(MmsConstants.MST_CODE_RIYOUSHADIV_3.equals(form.riYouShaDiv)
					|| MmsConstants.MST_CODE_RIYOUSHADIV_4.equals(form.riYouShaDiv)) {
				grpStr = grpStr + ",ist_res";
			}else {
				grpStr = grpStr + ",ist_ist";
				
			}
		}else if(form.useApp05) {
			if(MmsConstants.MST_CODE_RIYOUSHADIV_3.equals(form.riYouShaDiv)
					|| MmsConstants.MST_CODE_RIYOUSHADIV_4.equals(form.riYouShaDiv)) {
				grpStr = grpStr + ",cis_home";
			}else {
				grpStr = grpStr + ",cis_sensei";
				
			}
		}else if(form.useApp06) {
			if(MmsConstants.MST_CODE_RIYOUSHADIV_3.equals(form.riYouShaDiv)
					|| MmsConstants.MST_CODE_RIYOUSHADIV_4.equals(form.riYouShaDiv)) {
			}else {
				grpStr = grpStr + ",cis1_sensei";
				
			}
			
		}
		if(grpStr.length() > 0) {
			grpStr= grpStr.substring(1);
		}
		
		result.setExpansionAttr32(grpStr);

		// 拡張属性３３ = 画面項目.その他３３ 入学年度
		result.setExpansionAttr33(form.getNyuGakuNendo());

		// 拡張属性３４ = 画面項目.その他３４
		result.setExpansionAttr34(form.getOtherItem34());

		// 拡張属性３５ = 画面項目.その他３５
		result.setExpansionAttr35(form.getOtherItem35());

		// 拡張属性３６ = 画面項目.その他３６
		result.setExpansionAttr36(form.getOtherItem36());

		// 拡張属性３７ = 画面項目.その他３７
		result.setExpansionAttr37(form.getOtherItem37());

		// 拡張属性３８ = 画面項目.その他３８
		result.setExpansionAttr38(form.getOtherItem38());

		// 拡張属性３９ = 画面項目.その他３９
		result.setExpansionAttr39(form.getOtherItem39());

		// 拡張属性４０ = 画面項目.その他４０
		result.setExpansionAttr40(form.getOtherItem40());


		return result;
	}


	/**
	 * ユーザシステム利用予約　データ作成
	 * @param form
	 * @return
	 * @throws ParseException 
	 */
	public TUserSystemSubEntity crtTUserSystemSubEntity(UserRegistForm form) throws ParseException {

        // 現在の日時を取得
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
		TUserSystemSubEntity result = new TUserSystemSubEntity();

        
		// 反映日 = 画面項目.反映日
		result.setReflectionDate(dateFormat.parse(form.getHanEiDt()));

		// 反映フラグ = - 1　または　0											"0：ユーザマスタ反映済みの場合
		//1:：ユーザマスタ未反映の場合"									
		//反映日＝システム更新日の場合、後の処理で1に更新する
		result.setReflectionFlag("1");

		// ユーザーID = 画面項目.利用者ID
		result.setUserId(form.getRiYouShaId());

		// アプリケーション利用フラグ01 = 画面項目.アプリケーション利用フラグ01
		result.setApplicationUseFlag01(form.useApp01?"1":"0");

		// アプリケーション利用フラグ02 = 画面項目.アプリケーション利用フラグ02
		result.setApplicationUseFlag02(form.useApp02?"1":"0");

		// アプリケーション利用フラグ03 = 画面項目.アプリケーション利用フラグ03
		result.setApplicationUseFlag03(form.useApp03?"1":"0");

		// アプリケーション利用フラグ04 = 画面項目.アプリケーション利用フラグ04
		result.setApplicationUseFlag04(form.useApp04?"1":"0");

		// アプリケーション利用フラグ05 = 画面項目.アプリケーション利用フラグ05
		result.setApplicationUseFlag05(form.useApp05?"1":"0");

		// アプリケーション利用フラグ06 = 画面項目.アプリケーション利用フラグ06
		result.setApplicationUseFlag06(form.useApp06?"1":"0");

		// アプリケーション利用フラグ07 = 画面項目.アプリケーション利用フラグ07
		result.setApplicationUseFlag07(form.useApp07?"1":"0");

		// アプリケーション利用フラグ08 = 画面項目.アプリケーション利用フラグ08
		result.setApplicationUseFlag08(form.useApp08?"1":"0");

		// アプリケーション利用フラグ09 = 画面項目.アプリケーション利用フラグ09
		result.setApplicationUseFlag09(form.useApp09?"1":"0");

		// アプリケーション利用フラグ10 = 画面項目.アプリケーション利用フラグ10
		result.setApplicationUseFlag10(form.useApp10?"1":"0");

		// アプリケーション利用フラグ11 = 画面項目.アプリケーション利用フラグ11
		result.setApplicationUseFlag11(form.useApp11?"1":"0");

		// アプリケーション利用フラグ12 = 画面項目.アプリケーション利用フラグ12
		result.setApplicationUseFlag12(form.useApp12?"1":"0");

		// アプリケーション利用フラグ13 = 画面項目.アプリケーション利用フラグ13
		result.setApplicationUseFlag13(form.useApp13?"1":"0");

		// アプリケーション利用フラグ14 = 画面項目.アプリケーション利用フラグ14
		result.setApplicationUseFlag14(form.useApp14?"1":"0");

		// アプリケーション利用フラグ15 = 画面項目.アプリケーション利用フラグ15
		result.setApplicationUseFlag15(form.useApp15?"1":"0");

		// アプリケーション利用フラグ16 = 画面項目.アプリケーション利用フラグ16
		result.setApplicationUseFlag16(form.useApp16?"1":"0");

		// アプリケーション利用フラグ17 = 画面項目.アプリケーション利用フラグ17
		result.setApplicationUseFlag17(form.useApp17?"1":"0");

		// アプリケーション利用フラグ18 = 画面項目.アプリケーション利用フラグ18
		result.setApplicationUseFlag18(form.useApp18?"1":"0");

		// アプリケーション利用フラグ19 = 画面項目.アプリケーション利用フラグ19
		result.setApplicationUseFlag19(form.useApp19?"1":"0");

		// アプリケーション利用フラグ20 = 画面項目.アプリケーション利用フラグ20
		result.setApplicationUseFlag20(form.useApp20?"1":"0");

		// システム有効フラグ01 = -
		result.setSystemValidFlag01("0");

		// システム有効フラグ02 = -
		result.setSystemValidFlag02("0");

		// システム有効フラグ03 = -
		result.setSystemValidFlag03("0");

		// システム有効フラグ04 = -
		result.setSystemValidFlag04("0");

		// システム有効フラグ05 = -
		result.setSystemValidFlag05("0");

		// システム有効フラグ06 = -
		result.setSystemValidFlag06("0");

		// システム有効フラグ07 = -
		result.setSystemValidFlag07("0");

		// システム有効フラグ08 = -
		result.setSystemValidFlag08("0");

		// システム有効フラグ09 = -
		result.setSystemValidFlag09("0");

		// システム有効フラグ10 = -
		result.setSystemValidFlag10("0");

		// システム有効フラグ11 = -
		result.setSystemValidFlag11("0");

		// システム有効フラグ12 = -
		result.setSystemValidFlag12("0");

		// システム有効フラグ13 = -
		result.setSystemValidFlag13("0");

		// システム有効フラグ14 = -
		result.setSystemValidFlag14("0");

		// システム有効フラグ15 = -
		result.setSystemValidFlag15("0");

		// システム有効フラグ16 = -
		result.setSystemValidFlag16("0");

		// システム有効フラグ17 = -
		result.setSystemValidFlag17("0");

		// システム有効フラグ18 = -
		result.setSystemValidFlag18("0");

		// システム有効フラグ19 = -
		result.setSystemValidFlag19("0");

		// システム有効フラグ20 = -
		result.setSystemValidFlag20("0");

		// 登録者ID = -
		result.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());

		// 登録日時 = CURRENT_TIMESTAMP
		result.setRegistTs(currentDate);

		// 更新者ID = -
		result.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());

		// 更新日時 = CURRENT_TIMESTAMP
		result.setUpdateTs(currentDate);

		//サイボウズ						アプリケーション利用フラグ02								コラボレーションサーバ							システム有効フラグ06
		//研究用LDAP							システム有効フラグ01
		
		if(form.useApp02) {
			result.setSystemValidFlag06("1");
			result.setSystemValidFlag01("1");
		}

		//並列演算装置						アプリケーション利用フラグ03								研究用LDAP							システム有効フラグ01
		if(form.useApp03) {
			result.setSystemValidFlag01("1");
		}
		//VPN						アプリケーション利用フラグ04								研究用Active Directory							システム有効フラグ02
		if(form.useApp04) {
			result.setSystemValidFlag02("1");
		}
		//		教育システム						アプリケーション利用フラグ05								教育用LDAP							システム有効フラグ03
		//		教育用Active Directory							システム有効フラグ04
		//		CISプリント管理							システム有効フラグ07
		//		教育用ファイルサーバ							システム有効フラグ08
		//		教育用WWWサーバ							システム有効フラグ09
		if(form.useApp05) {
			result.setSystemValidFlag03("1");
			result.setSystemValidFlag04("1");
			result.setSystemValidFlag07("1");
			result.setSystemValidFlag08("1");
			result.setSystemValidFlag09("1");
		}
		//		演習室1						アプリケーション利用フラグ06								演習室１Active Directory							システム有効フラグ05
		//		演習室1ファイルサーバ							システム有効フラグ10
		if(form.useApp06) {
			result.setSystemValidFlag05("1");
			result.setSystemValidFlag10("1");
		}

		
		return result;
	}

}
