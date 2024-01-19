package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.MUserCompany;
import jp.co.axio.masterMentsetSystem.model.MUserCompanyExample;
import jp.co.axio.masterMentsetSystem.model.MUserCompanyKey;
import org.apache.ibatis.annotations.Param;

public interface MUserCompanyMapper {
    long countByExample(MUserCompanyExample example);

    int deleteByExample(MUserCompanyExample example);

    int deleteByPrimaryKey(MUserCompanyKey key);

    int insert(MUserCompany record);

    int insertSelective(MUserCompany record);

    List<MUserCompany> selectByExample(MUserCompanyExample example);

    MUserCompany selectByPrimaryKey(MUserCompanyKey key);

    int updateByExampleSelective(@Param("record") MUserCompany record, @Param("example") MUserCompanyExample example);

    int updateByExample(@Param("record") MUserCompany record, @Param("example") MUserCompanyExample example);

    int updateByPrimaryKeySelective(MUserCompany record);

    int updateByPrimaryKey(MUserCompany record);
}