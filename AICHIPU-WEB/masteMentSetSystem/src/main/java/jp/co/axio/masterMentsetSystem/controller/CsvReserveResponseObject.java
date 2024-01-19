package jp.co.axio.masterMentsetSystem.controller;

import jp.co.axio.masterMentsetSystem.model.ReserveUserDetail;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import lombok.Data;

import java.util.List;

@Data
/**
 * ユーザーCSV反映まちユーザレスポンスオブジェクト。
 */
public class CsvReserveResponseObject {

    // 反映まちユーザリスト
    private List<ReserveUserDetail> list;
    // ページに表示するメッセージ
    private String message;

    /**
     * ユーザーCSV反映まちユーザレスポンスオブジェクトのコンストラクタ。
     *
     * @param list    反映まちユーザリスト
     * @param message ページに表示するメッセージ
     */


    public CsvReserveResponseObject(List<ReserveUserDetail> list, String message) {
        this.list = list;
        this.message = message;
    }
}
