package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.EmpInfoCenterDto;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.entity.EmpInfoCenter;
import com.oneutf.hr.model.entity.EmpQuit;
import com.oneutf.hr.model.query.EmpInfoCenterQuery;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.vo.EmpInfoCenterVo;
import com.oneutf.hr.model.vo.EmpQuitVo;

public interface EmpInfoCenterService extends BeanService<EmpInfoCenter> {
    /**
     * 创建岗位信息
     * @param empInfoCenterDto
     * @return
     */
    ApiResult<String> create(EmpInfoCenterDto empInfoCenterDto);

    /**
     *  查询岗位信息
     * @param id
     * @return
     */
    ApiResult<EmpInfoCenterVo> findById(String id);

    /**
     *  修改岗位信息
     * @param empInfoCenterDto
     * @return
     */
    ApiResult<String> update(EmpInfoCenterDto empInfoCenterDto);

    /**
     *  删除岗位信息
     * @param id
     * @return
     */
    ApiResult<String> delete(String id);

    /**
     *  获取列表
     * @param qo
     * @return
     */
    ApiResult<PageInfo<EmpInfoCenterVo>> getDataTable(EmpInfoCenterQuery qo);

    /**
     *
     * @param id
     * @return
     */
    ApiResult<EmpInfoCenterVo> findByEmpId(String id);
}
