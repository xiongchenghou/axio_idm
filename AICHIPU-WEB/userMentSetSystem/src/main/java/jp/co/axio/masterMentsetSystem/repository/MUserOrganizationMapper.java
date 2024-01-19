package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.MUserOrganization;
import jp.co.axio.masterMentsetSystem.model.MUserOrganizationExample;
import jp.co.axio.masterMentsetSystem.model.MUserOrganizationKey;
import org.apache.ibatis.annotations.Param;

public interface MUserOrganizationMapper {
    long countByExample(MUserOrganizationExample example);

    int deleteByExample(MUserOrganizationExample example);

    int deleteByPrimaryKey(MUserOrganizationKey key);

    int insert(MUserOrganization record);

    int insertSelective(MUserOrganization record);

    List<MUserOrganization> selectByExample(MUserOrganizationExample example);

    MUserOrganization selectByPrimaryKey(MUserOrganizationKey key);

    int updateByExampleSelective(@Param("record") MUserOrganization record, @Param("example") MUserOrganizationExample example);

    int updateByExample(@Param("record") MUserOrganization record, @Param("example") MUserOrganizationExample example);

    int updateByPrimaryKeySelective(MUserOrganization record);

    int updateByPrimaryKey(MUserOrganization record);
}