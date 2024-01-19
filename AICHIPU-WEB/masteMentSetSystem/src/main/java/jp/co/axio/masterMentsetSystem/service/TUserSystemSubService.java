package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author a004811
 * @createDate 2024-01-10 19:23:49
 */
@Service
public class TUserSystemSubService extends ServiceImpl<TUserSystemSubEntityMapper, TUserSystemSubEntity> {

    @Autowired
    TUserSystemSubEntityMapper mapper;

    public TUserSystemSubEntity getTUserSystemSubEntity(Wrapper<TUserSystemSubEntity> queryWrapper) {
        return getOne(queryWrapper);
    }

    //未反映:"1"の場合：trueを返す
    public boolean getReflectionFlag(String userId) {
        return "1".equals(mapper.selectReflectionFlagByUserId(userId));
    }
}
