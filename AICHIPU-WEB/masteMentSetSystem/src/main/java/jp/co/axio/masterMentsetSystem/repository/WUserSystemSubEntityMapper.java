package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSubEntityKey;
import org.apache.ibatis.annotations.Param;

public interface WUserSystemSubEntityMapper {
    long countByExample(WUserSystemSubEntityExample example);

    int deleteByExample(WUserSystemSubEntityExample example);

    int deleteByPrimaryKey(WUserSystemSubEntityKey key);

    int insert(WUserSystemSubEntity record);

    int insertSelective(WUserSystemSubEntity record);

    List<WUserSystemSubEntity> selectByExample(WUserSystemSubEntityExample example);

    WUserSystemSubEntity selectByPrimaryKey(WUserSystemSubEntityKey key);

    int updateByExampleSelective(@Param("record") WUserSystemSubEntity record, @Param("example") WUserSystemSubEntityExample example);

    int updateByExample(@Param("record") WUserSystemSubEntity record, @Param("example") WUserSystemSubEntityExample example);

    int updateByPrimaryKeySelective(WUserSystemSubEntity record);

    int updateByPrimaryKey(WUserSystemSubEntity record);
}