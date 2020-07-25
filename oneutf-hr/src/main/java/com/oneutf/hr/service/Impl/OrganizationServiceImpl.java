package com.oneutf.hr.service.Impl;

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
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author Administrator
 */

@Service
public class OrganizationServiceImpl extends BeanServiceImpl<OrganizationMapper,Organization> implements OrganizationService {

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
    public ApiResult<String> delete(String id) {
        this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<OrganizationVo>> getDataTable(OrganizationQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<Organization> entityList = lambdaQuery().list();
        List<OrganizationVo> vos = BeanUtil.voTransfer(entityList, OrganizationVo.class);
        PageInfo<OrganizationVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}