package jp.co.axio.masterMentsetSystem.repository;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author a004811
* @description 【w_upload_file_sub(アップロードファイル一時)】テーブルにに対してのデーターベースの操作Mapper
* @createDate 2024-01-05 18:24:51
* @Entity jp.co.axio.masterMentsetSystem.domain.WUploadFileSubmodel
*/
public interface WUploadFileSubMapper extends BaseMapper<WUploadFileSub>  {

    @Override
    int insert(WUploadFileSub entity);


    @Override
    int update(WUploadFileSub entity, Wrapper<WUploadFileSub> updateWrapper);

    int updateWUploadFileSub(WUploadFileSub entity);

}




