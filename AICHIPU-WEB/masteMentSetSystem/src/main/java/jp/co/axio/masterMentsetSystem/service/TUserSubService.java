package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.ReserveUserDetail;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


/**
 * @author a004811
 * @createDate 2024-01-10 19:23:49
 */
@Service
public class TUserSubService extends ServiceImpl<TUserSubEntityMapper, TUserSubEntity> {

    @Autowired
    TUserSubEntityMapper mapper;

    public int getCount(String userId){
        return mapper.countByUserId(userId);
    }

    public List<ReserveUserDetail> getReserveUserDetail(Date reflectionDate) {
        return mapper.selectReserveUserDetail(reflectionDate);
    }

}
