package jp.co.axio.masterMentsetSystem.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CsvHeaderProperties {

    @Value("${csv.header.columns}")
    private String csvHeader;

    @Value("${saerch.csv.header.columns}")
    private String searchCsvHeader;


}
