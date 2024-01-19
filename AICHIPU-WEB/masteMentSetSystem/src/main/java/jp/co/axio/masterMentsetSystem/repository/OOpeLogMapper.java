package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.model.OOpeLog;
import jp.co.axio.masterMentsetSystem.model.OOpeLogExample;
import org.apache.ibatis.annotations.Param;

public interface OOpeLogMapper extends BaseMapper<OOpeLog> {
    long countByExample(OOpeLogExample example);

    int deleteByExample(OOpeLogExample example);

    int insert(OOpeLog record);

    int insertSelective(OOpeLog record);

    List<OOpeLog> selectByExample(OOpeLogExample example);

    int updateByExampleSelective(@Param("record") OOpeLog record, @Param("example") OOpeLogExample example);

    int updateByExample(@Param("record") OOpeLog record, @Param("example") OOpeLogExample example);
}