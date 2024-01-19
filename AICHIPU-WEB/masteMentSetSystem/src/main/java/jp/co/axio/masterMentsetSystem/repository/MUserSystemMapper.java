package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.model.MUserSystem;
import jp.co.axio.masterMentsetSystem.model.MUserSystemExample;
import org.apache.ibatis.annotations.Param;

public interface MUserSystemMapper   extends BaseMapper< MUserSystem> {
    long countByExample(MUserSystemExample example);

    int deleteByExample(MUserSystemExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MUserSystem record);

    int insertSelective(MUserSystem record);

    List<MUserSystem> selectByExample(MUserSystemExample example);

    MUserSystem selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MUserSystem record, @Param("example") MUserSystemExample example);

    int updateByExample(@Param("record") MUserSystem record, @Param("example") MUserSystemExample example);

    int updateByPrimaryKeySelective(MUserSystem record);

    int updateByPrimaryKey(MUserSystem record);
}