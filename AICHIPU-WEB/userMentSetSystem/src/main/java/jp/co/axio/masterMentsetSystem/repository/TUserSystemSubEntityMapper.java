package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntityExample;
import org.apache.ibatis.annotations.Param;

public interface TUserSystemSubEntityMapper {
    long countByExample(TUserSystemSubEntityExample example);

    int deleteByExample(TUserSystemSubEntityExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TUserSystemSubEntity record);

    int insertSelective(TUserSystemSubEntity record);

    List<TUserSystemSubEntity> selectByExample(TUserSystemSubEntityExample example);

    TUserSystemSubEntity selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TUserSystemSubEntity record, @Param("example") TUserSystemSubEntityExample example);

    int updateByExample(@Param("record") TUserSystemSubEntity record, @Param("example") TUserSystemSubEntityExample example);

    int updateByPrimaryKeySelective(TUserSystemSubEntity record);

    int updateByPrimaryKey(TUserSystemSubEntity record);
}