package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSubEntityKey;
import org.apache.ibatis.annotations.Param;

public interface WUploadFileSubEntityMapper {
    long countByExample(WUploadFileSubEntityExample example);

    int deleteByExample(WUploadFileSubEntityExample example);

    int deleteByPrimaryKey(WUploadFileSubEntityKey key);

    int insert(WUploadFileSubEntity record);

    int insertSelective(WUploadFileSubEntity record);

    List<WUploadFileSubEntity> selectByExample(WUploadFileSubEntityExample example);

    WUploadFileSubEntity selectByPrimaryKey(WUploadFileSubEntityKey key);

    int updateByExampleSelective(@Param("record") WUploadFileSubEntity record, @Param("example") WUploadFileSubEntityExample example);

    int updateByExample(@Param("record") WUploadFileSubEntity record, @Param("example") WUploadFileSubEntityExample example);

    int updateByPrimaryKeySelective(WUploadFileSubEntity record);

    int updateByPrimaryKey(WUploadFileSubEntity record);
}