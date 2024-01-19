package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jp.co.axio.masterMentsetSystem.dto.UserSearchDto;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import jp.co.axio.masterMentsetSystem.repository.VSearchUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author gm101
* @description 针对表【v_search_user】的数据库操作Service
* @createDate 2023-12-21 11:25:08
*/

@Service
public class VUserSearchService {
    @Autowired
    VSearchUserMapper mapper;


    public IPage<VSearchUser> getPages(UserSearchDto dto){
    IPage<VSearchUser> page = new Page<VSearchUser>(dto.getCurrent(), dto.getSize());
        return mapper.selectComplexUserPage(page, dto);
    }

    public List<VSearchUser> list(UserSearchDto dto){
        List<VSearchUser> list = new ArrayList<VSearchUser>();
        return mapper.searchUserList(list,dto);
    }

    public List<VSearchUser> getAll(){
        List<VSearchUser> list = new ArrayList<VSearchUser>();
        return mapper.selectList(null);
    }
}
