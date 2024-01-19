package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.VSearchUserEntity;
import jp.co.axio.masterMentsetSystem.model.VSearchUserEntityExample;
import org.apache.ibatis.annotations.Param;

public interface VSearchUserEntityMapper {
    long countByExample(VSearchUserEntityExample example);

    int deleteByExample(VSearchUserEntityExample example);

    int insert(VSearchUserEntity record);

    int insertSelective(VSearchUserEntity record);

    List<VSearchUserEntity> selectByExample(VSearchUserEntityExample example);

    int updateByExampleSelective(@Param("record") VSearchUserEntity record, @Param("example") VSearchUserEntityExample example);

    int updateByExample(@Param("record") VSearchUserEntity record, @Param("example") VSearchUserEntityExample example);
}