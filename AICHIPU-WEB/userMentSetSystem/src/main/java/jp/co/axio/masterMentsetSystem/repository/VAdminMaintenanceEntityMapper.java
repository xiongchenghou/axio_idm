package jp.co.axio.masterMentsetSystem.repository;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntityExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VAdminMaintenanceEntityMapper  extends BaseMapper<VAdminMaintenanceEntity> {
    long countByExample(VAdminMaintenanceEntityExample example);

    int deleteByExample(VAdminMaintenanceEntityExample example);

    int insert(VAdminMaintenanceEntity record);

    int insertSelective(VAdminMaintenanceEntity record);

    List<VAdminMaintenanceEntity> selectByExample(VAdminMaintenanceEntityExample example);

    int updateByExampleSelective(@Param("record") VAdminMaintenanceEntity record, @Param("example") VAdminMaintenanceEntityExample example);

    int updateByExample(@Param("record") VAdminMaintenanceEntity record, @Param("example") VAdminMaintenanceEntityExample example);

    List<VAdminMaintenanceEntity> searchByUserId(@Param("userId") String userId);

    IPage<VAdminMaintenanceEntity> selectUserPage(Page<VAdminMaintenanceEntity> page);
}