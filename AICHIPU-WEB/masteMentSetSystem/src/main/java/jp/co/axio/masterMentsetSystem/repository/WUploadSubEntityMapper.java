package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.WUploadSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUploadSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUploadSubEntityKey;
import org.apache.ibatis.annotations.Param;

public interface WUploadSubEntityMapper {
    long countByExample(WUploadSubEntityExample example);

    int deleteByExample(WUploadSubEntityExample example);

    int deleteByPrimaryKey(WUploadSubEntityKey key);

    int insert(WUploadSubEntity record);

    int insertSelective(WUploadSubEntity record);

    List<WUploadSubEntity> selectByExample(WUploadSubEntityExample example);

    WUploadSubEntity selectByPrimaryKey(WUploadSubEntityKey key);

    int updateByExampleSelective(@Param("record") WUploadSubEntity record, @Param("example") WUploadSubEntityExample example);

    int updateByExample(@Param("record") WUploadSubEntity record, @Param("example") WUploadSubEntityExample example);

    int updateByPrimaryKeySelective(WUploadSubEntity record);

    int updateByPrimaryKey(WUploadSubEntity record);
}