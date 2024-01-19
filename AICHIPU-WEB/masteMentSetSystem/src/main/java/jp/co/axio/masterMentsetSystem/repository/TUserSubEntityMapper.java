package jp.co.axio.masterMentsetSystem.repository;

import java.sql.Date;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.model.ReserveUserDetail;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TUserSubEntityMapper extends BaseMapper<TUserSubEntity> {
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

    int countByUserId(@Param("userId") String userId);

    List<ReserveUserDetail> selectReserveUserDetail(@Param("reflectionDate") Date reflectionDate);

}