package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.WNewUser;
import jp.co.axio.masterMentsetSystem.model.WNewUserExample;
import org.apache.ibatis.annotations.Param;

public interface WNewUserMapper {
    long countByExample(WNewUserExample example);

    int deleteByExample(WNewUserExample example);

    int insert(WNewUser record);

    int insertSelective(WNewUser record);

    List<WNewUser> selectByExample(WNewUserExample example);

    int updateByExampleSelective(@Param("record") WNewUser record, @Param("example") WNewUserExample example);

    int updateByExample(@Param("record") WNewUser record, @Param("example") WNewUserExample example);
}