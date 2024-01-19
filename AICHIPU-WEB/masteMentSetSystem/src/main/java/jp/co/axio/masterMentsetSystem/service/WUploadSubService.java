package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.WUploadSub;
import jp.co.axio.masterMentsetSystem.repository.WUploadSubMapper;
import org.springframework.stereotype.Service;

/**
 * @author a004811
 * @description 【w_upload_sub(アップロード一時)】テーブルにに対してのデーターベースの操作サービス
 * @createDate 2024-01-05 18:24:51
 */
@Service
public class WUploadSubService extends ServiceImpl<WUploadSubMapper, WUploadSub> {


    public void addWUploadSub(WUploadSub entity) {
        save(entity);
    }

}
