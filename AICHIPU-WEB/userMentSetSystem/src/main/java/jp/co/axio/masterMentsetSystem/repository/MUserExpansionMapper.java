package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.MUserExpansion;
import jp.co.axio.masterMentsetSystem.model.MUserExpansionExample;
import org.apache.ibatis.annotations.Param;

public interface MUserExpansionMapper {
    long countByExample(MUserExpansionExample example);

    int deleteByExample(MUserExpansionExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MUserExpansion record);

    int insertSelective(MUserExpansion record);

    List<MUserExpansion> selectByExample(MUserExpansionExample example);

    MUserExpansion selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MUserExpansion record, @Param("example") MUserExpansionExample example);

    int updateByExample(@Param("record") MUserExpansion record, @Param("example") MUserExpansionExample example);

    int updateByPrimaryKeySelective(MUserExpansion record);

    int updateByPrimaryKey(MUserExpansion record);
}