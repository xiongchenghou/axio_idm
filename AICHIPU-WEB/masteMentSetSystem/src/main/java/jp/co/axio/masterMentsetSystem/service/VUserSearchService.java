package jp.co.axio.masterMentsetSystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jp.co.axio.masterMentsetSystem.dto.UserSearchDto;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VSearchUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author a004811
 * @description テーブル【v_search_user】に対するデータベース操作のService
 * @createDate 2023-12-21 11:25:08
 */

@Service
public class VUserSearchService {
    @Autowired
    VSearchUserMapper mapper;

    @Autowired
    private VAdminMaintenanceEntityMapper vAdminMaintenanceEntityMapper;

    /**
     * 条件に基づいてページを取得します。
     *
     * @param dto 検索条件
     * @return ページデータ
     */
    public IPage<VSearchUser> getPages(UserSearchDto dto){
        IPage<VSearchUser> page = new Page<VSearchUser>(dto.getCurrent(), dto.getSize());
        return mapper.selectComplexUserPage(page, dto);
    }

    /**
     * 条件に基づいてユーザーリストを取得します。
     *
     * @param dto 検索条件
     * @return ユーザーリスト
     */
    public List<VSearchUser> list(UserSearchDto dto){
        List<VSearchUser> list = new ArrayList<VSearchUser>();
        return mapper.searchUserList(list, dto);
    }

    /**
     * すべてのユーザーリストを取得します。
     *
     * @return すべてのユーザーリスト
     */
    public List<VSearchUser> getAll(){
        List<VSearchUser> list = new ArrayList<VSearchUser>();
        return mapper.selectList(null);
    }

    /**
     * ユーザーIDの配列に基づいてユーザーエンティティリストをクエリします。
     *
     * @param userIds ユーザーIDの配列
     * @return ユーザーエンティティリスト
     */
    public List<VAdminMaintenanceEntity> queryEntitiesByUserIds(String[] userIds) {
        // String配列をList<String>に変換します
        List<String> userIdsList = Arrays.asList(userIds);

        // QueryWrapperを使用してクエリ条件を構築します
        QueryWrapper<VAdminMaintenanceEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("user_id", userIdsList);

        // selectListメソッドを呼び出してクエリを実行します
        List<VAdminMaintenanceEntity> resultList = vAdminMaintenanceEntityMapper.selectList(queryWrapper);
        return resultList;
    }
}
