package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import jp.co.axio.masterMentsetSystem.repository.WUploadFileSubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author a004811
 * @description 【w_upload_file_sub(アップロードファイル一時)】テーブルにに対してのデーターベースの操作サービス
 * @createDate 2024-01-05 18:24:51
 */
@Service
public class WUploadFileSubService extends ServiceImpl<WUploadFileSubMapper, WUploadFileSub> {

    @Autowired
    WUploadFileSubMapper mapper;

    public boolean addWUploadFileSubList(List<WUploadFileSub> entityList) {
        return saveBatch(entityList);
    }

    public boolean updateWUploadFileSub(WUploadFileSub entity, Wrapper<WUploadFileSub> updateWrapper) {
        return update(entity, updateWrapper);
    }

    @Transactional
    public void updateWUploadFileSub(WUploadFileSub entity) {
        mapper.updateWUploadFileSub(entity);
    }

    public void updateWUploadFileSubList(List<WUploadFileSub> entityList) {
        for (WUploadFileSub entity : entityList){
            mapper.updateWUploadFileSub(entity);
        }
    }

}
