package jp.co.axio.masterMentsetSystem.repository;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jp.co.axio.masterMentsetSystem.dto.UserSearchDto;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author gm101
* @description 针对表【v_search_user】的数据库操作Mapper
* @createDate 2023-12-21 11:25:08
* @Entity jp.co.axio.masterMentsetSystem.model.VSearchUser
*/
public interface VSearchUserMapper extends BaseMapper<VSearchUser> {

    IPage<VSearchUser> selectComplexUserPage(IPage<VSearchUser> page, UserSearchDto dto);

    List<VSearchUser> searchUserList( List<VSearchUser>list,UserSearchDto dto);


}




