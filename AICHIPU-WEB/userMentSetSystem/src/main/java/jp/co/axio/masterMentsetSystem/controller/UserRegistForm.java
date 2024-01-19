package jp.co.axio.masterMentsetSystem.controller;

import java.io.Serializable;
import java.util.List;

import jp.co.axio.masterMentsetSystem.dto.PasswordHisDto;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistForm extends accessForm implements Serializable {

	/**
	 * ユーザ新規作成フォーム
	 */
	private static final long serialVersionUID = 1L;
	
	public static String OPDIV_DEL = "del";
	public static String OPDIV_UNDO_DEL = "undoDel";
	public static String OPDIV_LOCK = "lock";
	public static String OPDIV_UNLOCK = "unlock";
	public static String OPDIV_INITPASSWORD = "initPassword";

	
	/** 詳細画面の操作区分 del,undoDel,lock,unlock,initPassword */
	public String viewPageOpDiv;
	
	/** 削除フラグ */
	public String deleteFlag;
	
	/** 無効フラグ */
	public String invalidFlag;
	
	/** 未来ユーザフラグ */
	public String futureUserFlag;
	
	/** 反映フラグ */
	public String reflectionFlag;
	
	
	/** 反映日 */
	public String hanEiDt;
	
	/** 在籍状況 */
	public String zaiSeki;

	/** 利用者区分 */
	public String riYouShaDiv;
	
	/** 利用者名称 */
	public String riYouShaNm;

	/** 利用者区分プルダウン */
	public List<PulldownItemDto> riYouShaDivList;

	/** 利用者ID */
	public String riYouShaId;

	/** 学籍番号・教職員番号 */
	public String gakuSekiBn;

	/** 姓（漢字） */
	public String seiJp;

	/** 名（漢字） */
	public String meiJp;

	/** 姓（英字） */
	public String seiEn;

	/** 名（英字） */
	public String meiEn;

	/** キャンパス */
	public String campus;
	
	/** キャンパス名称 */
	public String campusNm;

	/** キャンパスプルダウン */
	public List<PulldownItemDto> campusList;

	/** 所属 */
	public String shoZoku;
	
	/** 所属名称 */
	public String shoZokuNm;

	/** 所属プルダウン */
	public List<PulldownItemDto> shoZokuList;

	/** メールアドレス */
	public String mailAddr;

	/** 入学年度 */
	public String nyuGakuNendo;

	/** 開始日 */
	public String validateStartDt;
	
	/** 開始日View */
	public String validateStartDtView;

	/** 終了日 */
	public String validateEndDt;
	
	/** 終了日View */
	public String validateEndDtView;

	/** 利用アプリケーション１ */
	public boolean useApp01;

	/** 利用アプリケーション２ */
	public boolean useApp02;

	/** 利用アプリケーション３ */
	public boolean useApp03;

	/** 利用アプリケーション４ */
	public boolean useApp04;

	/** 利用アプリケーション５ */
	public boolean useApp05;

	/** 利用アプリケーション６ */
	public boolean useApp06;

	/** 利用アプリケーション７ */
	public boolean useApp07;

	/** 利用アプリケーション８ */
	public boolean useApp08;

	/** 利用アプリケーション９ */
	public boolean useApp09;

	/** 利用アプリケーション１０ */
	public boolean useApp10;

	/** 利用アプリケーション１１ */
	public boolean useApp11;

	/** 利用アプリケーション１２ */
	public boolean useApp12;

	/** 利用アプリケーション１３ */
	public boolean useApp13;

	/** 利用アプリケーション１４ */
	public boolean useApp14;

	/** 利用アプリケーション１５ */
	public boolean useApp15;

	/** 利用アプリケーション１６ */
	public boolean useApp16;

	/** 利用アプリケーション１７ */
	public boolean useApp17;

	/** 利用アプリケーション１８ */
	public boolean useApp18;

	/** 利用アプリケーション１９ */
	public boolean useApp19;

	/** 利用アプリケーション２０ */
	public boolean useApp20;

	/** その他項目１ */
	public String otherItem01;

	/** その他項目２ */
	public String otherItem02;

	/** その他項目３ */
	public String otherItem03;

	/** その他項目４ */
	public String otherItem04;

	/** その他項目５ */
	public String otherItem05;

	/** その他項目６ */
	public String otherItem06;

	/** その他項目７ */
	public String otherItem07;

	/** その他項目８ */
	public String otherItem08;

	/** その他項目９ */
	public String otherItem09;

	/** その他項目１０ */
	public String otherItem10;

	/** その他項目１１ */
	public String otherItem11;

	/** その他項目１２ */
	public String otherItem12;

	/** その他項目１３ */
	public String otherItem13;

	/** その他項目１４ */
	public String otherItem14;

	/** その他項目１５ */
	public String otherItem15;

	/** その他項目１６ */
	public String otherItem16;

	/** その他項目１７ */
	public String otherItem17;

	/** その他項目１８ */
	public String otherItem18;

	/** その他項目１９ */
	public String otherItem19;

	/** その他項目２０ */
	public String otherItem20;

	/** その他項目２１ */
	public String otherItem21;

	/** その他項目２２ */
	public String otherItem22;

	/** その他項目２３ */
	public String otherItem23;

	/** その他項目２４ */
	public String otherItem24;

	/** その他項目２５ */
	public String otherItem25;

	/** その他項目２６ */
	public String otherItem26;

	/** その他項目２７ */
	public String otherItem27;

	/** その他項目２８ */
	public String otherItem28;

	/** その他項目２９ */
	public String otherItem29;

	/** その他項目３０ */
	public String otherItem30;

	/** その他項目３１ */
	public String otherItem31;

	/** その他項目３２ */
	public String otherItem32;

	/** その他項目３３ */
	public String otherItem33;

	/** その他項目３４ */
	public String otherItem34;

	/** その他項目３５ */
	public String otherItem35;

	/** その他項目３６ */
	public String otherItem36;

	/** その他項目３７ */
	public String otherItem37;

	/** その他項目３８ */
	public String otherItem38;

	/** その他項目３９ */
	public String otherItem39;

	/** その他項目４０ */
	public String otherItem40;


}
