package jp.co.axio.masterMentsetSystem.controller;

import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import lombok.Data;

import java.util.List;

@Data
/**
 * ユーザーCSVレスポンスオブジェクト。
 */
public class UserCsvResponseObject {
    // データリスト
    private List<WUploadFileSub> data;
    // ページに表示するメッセージ
    private String message;

    /**
     * ユーザーCSVレスポンスオブジェクトのコンストラクタ。
     *
     * @param data    データリスト
     * @param message ページに表示するメッセージ
     */
    public UserCsvResponseObject(List<WUploadFileSub> data, String message) {
        this.data = data;
        this.message = message;
    }
}
