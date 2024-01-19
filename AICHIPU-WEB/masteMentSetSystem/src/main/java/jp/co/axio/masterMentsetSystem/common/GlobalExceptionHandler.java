package jp.co.axio.masterMentsetSystem.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MissingServletRequestPartException.class)
    public ResponseEntity<String> handleMissingServletRequestPartException(MissingServletRequestPartException ex) {
        // 自定义エラーメッセージを作成
        String errorMessage = "リクエストに必要な部分が不足 : " + ex.getRequestPartName();

        // エラーメッセージを含む ResponseEntity を返す
        return ResponseEntity.badRequest().body(errorMessage);
    }
}
