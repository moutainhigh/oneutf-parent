package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.entity.Organization;
import com.oneutf.hr.model.query.OrganizationQuery;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.sys.model.query.SysUserQuery;
import com.oneutf.sys.model.vo.SysUserVo;

/**
 * @author Administrator
 */
public interface OrganizationService extends BeanService<Organization> {
    /**
     * 创建组织--新建部门
     * @param organizationDto
     * @return
     */
    ApiResult<String> create(OrganizationDto organizationDto);

    /**
     *  修改部门
     * @param organizationDto
     * @return
     */
    ApiResult<String> update(OrganizationDto organizationDto);

    /**
     *  根据ID获取部门
     * @param id
     * @return
     */
    ApiResult<OrganizationVo> findById(String id);

    /**
     *  删除部门
     * @param id
     * @return
     */
    ApiResult<String> delete(String id);

    /**
     *  获取列表
     * @param qo
     * @return
     */
    ApiResult<PageInfo<OrganizationVo>> getDataTable(OrganizationQuery qo);
}
