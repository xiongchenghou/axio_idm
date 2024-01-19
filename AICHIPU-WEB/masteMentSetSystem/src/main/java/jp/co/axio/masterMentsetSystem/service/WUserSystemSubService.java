package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSub;
import jp.co.axio.masterMentsetSystem.repository.WUserSystemSubMapper;
import org.springframework.stereotype.Service;

/**
 * @author a004811
 * @description 【w_user_system_sub(ユーザシステム利用一時)】テーブルにに対してのデーターベースの操作サービス
 * @createDate 2024-01-06 12:57:55
 */
@Service
public class WUserSystemSubService extends ServiceImpl<WUserSystemSubMapper, WUserSystemSub> {

    public void addWUserSystemSub(WUserSystemSub wUserSystemSub) {
        save(wUserSystemSub);
    }
}
