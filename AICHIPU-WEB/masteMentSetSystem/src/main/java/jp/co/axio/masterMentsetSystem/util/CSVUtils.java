package jp.co.axio.masterMentsetSystem.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.mozilla.universalchardet.UniversalDetector;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class CSVUtils {

    /**
     * オブジェクトリストをCSVファイルに書き込みます
     *
     * @param csvPrinter CSVプリンター、データをCSVに書き込むために使用します
     * @param objects    オブジェクトリスト、CSVファイルに書き込むオブジェクトを含みます
     * @throws IOException 書き込み中のIO例外
     */
    public static void writeObjectsToCSV(CSVPrinter csvPrinter, List<?> objects) throws IOException, IllegalAccessException {
        // CSVフォーマットを作成
        CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader(getHeaders(objects.get(0).getClass()));

        // try-with-resourcesを使用してリソースの解放を確保
        try (csvPrinter) {
            for (Object object : objects) {
                writeObjectToCSV(csvPrinter, object);
            }
        }
    }

    /**
     * オブジェクトの属性名をCSVファイルのヘッダーとして取得します
     *
     * @param clazz オブジェクトのクラス
     * @return ヘッダーの文字列配列
     */
    private static String[] getHeaders(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        String[] headers = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            headers[i] = fields[i].getName();
        }
        return headers;
    }

    /**
     * 単一のオブジェクトをCSVファイルに書き込みます
     *
     * @param csvPrinter CSVプリンター
     * @param object     書き込むオブジェクト
     * @throws IOException 書き込み中のIO例外
     */
    private static void writeObjectToCSV(CSVPrinter csvPrinter, Object object) throws IOException, IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        Object[] data = new Object[fields.length];

        int dataIndex = 0; // データ配列の書き込みインデックスを追跡するための変数

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);

            String fieldName = fields[i].getName();

            // フィールド名がフィルタリングが必要かどうかをチェックします
            if (!shouldFilter(fieldName)) {
                data[dataIndex] = fields[i].get(object);
                dataIndex++; // フィールドがフィルタリングされていない場合にのみインデックスを増やします
            }
        }

        // データ配列にデータがある場合、CSVレコードを書き込みます
        if (dataIndex > 0) {
            csvPrinter.printRecord(Arrays.copyOf(data, dataIndex));
        }
    }

    // フィールドがフィルタリングが必要かどうかをチェックします
    private static boolean shouldFilter(String fieldName) {
        return fieldName.equals("futureUserFlag") || fieldName.equals("reflectionFlag") || fieldName.equals("initPassword");
    }

    /**
     * 入力ストリームからファイルのエンコーディングを自動的に検出します。
     *
     * @param inputStream 入力ストリーム、検出するファイルのデータが含まれています
     * @return ファイルのエンコーディング名、検出できない場合はデフォルトのエンコーディング名
     */
    public static String detectFileEncoding(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[4096];
        UniversalDetector detector = new UniversalDetector(null);

        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) > 0 && !detector.isDone()) {
            detector.handleData(buffer, 0, bytesRead);
        }

        detector.dataEnd();

        String detectedCharset = detector.getDetectedCharset();
        if (detectedCharset != null) {
            return detectedCharset;
        } else {
            // エンコーディングを検出できなかった場合、デフォルトのエンコーディングを返すか、エラー処理を行います。
            return Charset.defaultCharset().name();
        }
    }
}