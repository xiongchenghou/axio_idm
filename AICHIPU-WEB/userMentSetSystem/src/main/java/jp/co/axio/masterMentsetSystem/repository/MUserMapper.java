package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.model.MUser;
import jp.co.axio.masterMentsetSystem.model.MUserExample;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import org.apache.ibatis.annotations.Param;

public interface MUserMapper extends BaseMapper<MUser> {
    long countByExample(MUserExample example);

    int deleteByExample(MUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MUser record);

    int insertSelective(MUser record);

    List<MUser> selectByExample(MUserExample example);

    MUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MUser record, @Param("example") MUserExample example);

    int updateByExample(@Param("record") MUser record, @Param("example") MUserExample example);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);


    LoginInfo selectLoginInfoByUserId(@Param("userId") String userId);


}