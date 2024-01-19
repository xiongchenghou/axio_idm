package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;
import jp.co.axio.masterMentsetSystem.model.TPasswordHist;
import jp.co.axio.masterMentsetSystem.model.TPasswordHistExample;
import jp.co.axio.masterMentsetSystem.model.TPasswordHistKey;
import org.apache.ibatis.annotations.Param;

public interface TPasswordHistMapper {
    long countByExample(TPasswordHistExample example);

    int deleteByExample(TPasswordHistExample example);

    int deleteByPrimaryKey(TPasswordHistKey key);

    int insert(TPasswordHist record);

    int insertSelective(TPasswordHist record);

    List<TPasswordHist> selectByExample(TPasswordHistExample example);

    TPasswordHist selectByPrimaryKey(TPasswordHistKey key);

    int updateByExampleSelective(@Param("record") TPasswordHist record, @Param("example") TPasswordHistExample example);

    int updateByExample(@Param("record") TPasswordHist record, @Param("example") TPasswordHistExample example);

    int updateByPrimaryKeySelective(TPasswordHist record);

    int updateByPrimaryKey(TPasswordHist record);
}