package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.entity.EmpQuit;
import com.oneutf.hr.model.entity.PostTransfer;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.EmpQuitVo;
import com.oneutf.hr.model.vo.PostTransferVo;

public interface EmpQuitService extends BeanService<EmpQuit> {
    /**
     * 创建岗位信息
     * @param empQuitDto
     * @return
     */
    ApiResult<String> create(EmpQuitDto empQuitDto);

    /**
     *  查询岗位信息
     * @param id
     * @return
     */
    ApiResult<EmpQuitVo> findById(String id);

    /**
     *  修改岗位信息
     * @param empQuitDto
     * @return
     */
    ApiResult<String> update(EmpQuitDto empQuitDto);

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
    ApiResult<PageInfo<EmpQuitVo>> getDataTable(EmpQuitQuery qo);

    ApiResult<EmpQuitVo> findByEmpId(String id);
}
