package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.TAuthHist;
import jp.co.axio.masterMentsetSystem.model.TAuthHistExample;
import jp.co.axio.masterMentsetSystem.model.TAuthHistKey;
import org.apache.ibatis.annotations.Param;

public interface TAuthHistMapper {
    long countByExample(TAuthHistExample example);

    int deleteByExample(TAuthHistExample example);

    int deleteByPrimaryKey(TAuthHistKey key);

    int insert(TAuthHist record);

    int insertSelective(TAuthHist record);

    List<TAuthHist> selectByExample(TAuthHistExample example);

    TAuthHist selectByPrimaryKey(TAuthHistKey key);

    int updateByExampleSelective(@Param("record") TAuthHist record, @Param("example") TAuthHistExample example);

    int updateByExample(@Param("record") TAuthHist record, @Param("example") TAuthHistExample example);

    int updateByPrimaryKeySelective(TAuthHist record);

    int updateByPrimaryKey(TAuthHist record);
}