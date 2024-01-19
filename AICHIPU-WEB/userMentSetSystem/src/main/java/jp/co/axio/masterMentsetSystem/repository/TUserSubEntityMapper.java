package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntityExample;
import org.apache.ibatis.annotations.Param;

public interface TUserSubEntityMapper {
    long countByExample(TUserSubEntityExample example);

    int deleteByExample(TUserSubEntityExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TUserSubEntity record);

    int insertSelective(TUserSubEntity record);

    List<TUserSubEntity> selectByExample(TUserSubEntityExample example);

    TUserSubEntity selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TUserSubEntity record, @Param("example") TUserSubEntityExample example);

    int updateByExample(@Param("record") TUserSubEntity record, @Param("example") TUserSubEntityExample example);

    int updateByPrimaryKeySelective(TUserSubEntity record);

    int updateByPrimaryKey(TUserSubEntity record);
}