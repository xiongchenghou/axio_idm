package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.WUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUserSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUserSubEntityKey;
import org.apache.ibatis.annotations.Param;

public interface WUserSubEntityMapper {
    long countByExample(WUserSubEntityExample example);

    int deleteByExample(WUserSubEntityExample example);

    int deleteByPrimaryKey(WUserSubEntityKey key);

    int insert(WUserSubEntity record);

    int insertSelective(WUserSubEntity record);

    List<WUserSubEntity> selectByExample(WUserSubEntityExample example);

    WUserSubEntity selectByPrimaryKey(WUserSubEntityKey key);

    int updateByExampleSelective(@Param("record") WUserSubEntity record, @Param("example") WUserSubEntityExample example);

    int updateByExample(@Param("record") WUserSubEntity record, @Param("example") WUserSubEntityExample example);

    int updateByPrimaryKeySelective(WUserSubEntity record);

    int updateByPrimaryKey(WUserSubEntity record);
}