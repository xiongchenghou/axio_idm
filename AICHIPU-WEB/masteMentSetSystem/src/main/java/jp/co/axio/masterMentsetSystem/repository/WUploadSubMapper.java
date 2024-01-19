package jp.co.axio.masterMentsetSystem.repository;

import jp.co.axio.masterMentsetSystem.model.WUploadSub;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author a004811
* @description 【w_upload_sub(アップロード一時)】テーブルにに対してのデーターベースの操作Mapper
* @createDate 2024-01-05 18:24:51
* @Entity jp.co.axio.masterMentsetSystem.domain.WUploadSubmodel
*/
public interface WUploadSubMapper extends BaseMapper<WUploadSub> {

    @Override
    int insert(WUploadSub entity);
}




