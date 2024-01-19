package jp.co.axio.masterMentsetSystem.repository;

import java.util.Date;
import java.util.List;
import jp.co.axio.masterMentsetSystem.model.MSystemCriterionDt;
import jp.co.axio.masterMentsetSystem.model.MSystemCriterionDtExample;
import org.apache.ibatis.annotations.Param;

public interface MSystemCriterionDtMapper {
    long countByExample(MSystemCriterionDtExample example);

    int deleteByExample(MSystemCriterionDtExample example);

    int deleteByPrimaryKey(Date criterionDt);

    int insert(MSystemCriterionDt record);

    int insertSelective(MSystemCriterionDt record);

    List<MSystemCriterionDt> selectByExample(MSystemCriterionDtExample example);

    int updateByExampleSelective(@Param("record") MSystemCriterionDt record, @Param("example") MSystemCriterionDtExample example);

    int updateByExample(@Param("record") MSystemCriterionDt record, @Param("example") MSystemCriterionDtExample example);
}