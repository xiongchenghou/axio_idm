package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import jp.co.axio.masterMentsetSystem.model.WUserSub;
import jp.co.axio.masterMentsetSystem.repository.WUserSubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author a004811
* @description 【w_user_sub(ユーザ一時)】テーブルにに対してのデーターベースの操作サービス
* @createDate 2024-01-06 12:57:55
*/
@Service
public class WUserSubService extends ServiceImpl<WUserSubMapper, WUserSub> {

    public void addWUserSub(WUserSub wUserSub){
        save(wUserSub);
    }

    public boolean updateWUserSub(WUserSub entity, Wrapper<WUserSub> updateWrapper){

        return update(entity, updateWrapper);
    }
}
