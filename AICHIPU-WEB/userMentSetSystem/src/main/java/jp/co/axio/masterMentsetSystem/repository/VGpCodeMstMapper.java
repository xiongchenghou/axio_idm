package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jp.co.axio.masterMentsetSystem.model.VGpCodeMst;
import jp.co.axio.masterMentsetSystem.model.VGpCodeMstExample;
import org.apache.ibatis.annotations.Param;

public interface VGpCodeMstMapper extends BaseMapper<VGpCodeMst> {
    long countByExample(VGpCodeMstExample example);

    int deleteByExample(VGpCodeMstExample example);

    int insert(VGpCodeMst record);

    int insertSelective(VGpCodeMst record);

    List<VGpCodeMst> selectByExample(VGpCodeMstExample example);

    int updateByExampleSelective(@Param("record") VGpCodeMst record, @Param("example") VGpCodeMstExample example);

    int updateByExample(@Param("record") VGpCodeMst record, @Param("example") VGpCodeMstExample example);

    // クラスコードとコード値を使用してvalue_1「パスワード暗号用共通鍵」を検索する
    String selectValue1ByClassCodeAndCodeValue(
            @Param("classCode") String classCode
    );
}