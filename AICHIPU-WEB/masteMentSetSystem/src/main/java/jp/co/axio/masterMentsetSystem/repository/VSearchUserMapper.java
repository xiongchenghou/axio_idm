package jp.co.axio.masterMentsetSystem.repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import jp.co.axio.masterMentsetSystem.dto.UserSearchDto;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author a004811
* @description "v_search_user" テーブルのデータベース操作マッパー
* @createDate 2023-12-21 11:25:08
* @Entity jp.co.axio.masterMentsetSystem.model.VSearchUser
*/
public interface VSearchUserMapper extends BaseMapper<VSearchUser> {

    IPage<VSearchUser> selectComplexUserPage(IPage<VSearchUser> page, UserSearchDto dto);

    List<VSearchUser> searchUserList( List<VSearchUser>list,UserSearchDto dto);


}




