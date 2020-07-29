package com.oneutf.hr.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.OrganizationMapper;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.entity.Organization;
import com.oneutf.hr.model.query.OrganizationQuery;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.hr.service.OrganizationService;
import com.oneutf.sys.model.entity.SysRole;
import com.oneutf.sys.model.entity.SysUser;
import com.oneutf.sys.model.vo.SysUserVo;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author Administrator
 */

@Service
public class OrganizationServiceImpl extends BeanServiceImpl<OrganizationMapper,Organization> implements OrganizationService {


    @Autowired
    private EmployeeServiceImpl employeeService;
    @Override
    public ApiResult<String> create(OrganizationDto organizationDto) {

        Organization organization = BeanUtil.copyProperties(organizationDto, Organization.class);
        this.save(organization);
        return success("创建成功");
    }

    @Override
    public ApiResult<String> update(OrganizationDto organizationDto) {
        Organization organization = BeanUtil.copyProperties(organizationDto, Organization.class);
        this.updateById(organization);
        return success("修改成功");
    }

    @Override
    public ApiResult<OrganizationVo> findById(String id) {
        Organization organization =  this.getById(id);;
        OrganizationVo organizationVo = BeanUtil.copyProperties(organization, OrganizationVo.class);
        return success(organizationVo);
    }

    @Override
    public ApiResult<String> delete(String id) {
        String msg = "删除失败";
        if(this.employeeService.findEmpByDeptId(id).size()<=0){
            this.removeById(id);
            msg = "删除成功";
        }
        return success(msg);
    }

    @Override
    public ApiResult<PageInfo<OrganizationVo>> getDataTable(OrganizationQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());

        List<Organization> entityList = lambdaQuery().list();
        List<OrganizationVo> vos = BeanUtil.voTransfer(entityList, OrganizationVo.class);
        vos.forEach(vo -> {
            if(StringUtils.isNotBlank(vo.getDeptParent())){
                vo.setDeptParentName(this.getById(vo.getDeptParent()).getName());
            }
        });
        PageInfo<OrganizationVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}
