package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.model.MPassword;
import jp.co.axio.masterMentsetSystem.model.MPasswordExample;
import jp.co.axio.masterMentsetSystem.model.MUserCompany;
import org.apache.ibatis.annotations.Param;

public interface MPasswordMapper extends BaseMapper<MPassword> {
    long countByExample(MPasswordExample example);

    int deleteByExample(MPasswordExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MPassword record);

    int insertSelective(MPassword record);

    List<MPassword> selectByExample(MPasswordExample example);

    MPassword selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MPassword record, @Param("example") MPasswordExample example);

    int updateByExample(@Param("record") MPassword record, @Param("example") MPasswordExample example);

    int updateByPrimaryKeySelective(MPassword record);

    int updateByPrimaryKey(MPassword record);

    // 自定义SQLメソッド：パスワードの復号
    String decryptPassword(@Param("encryptedPassword") String encryptedPassword, @Param("key") String key,@Param("userId") String userId);
}