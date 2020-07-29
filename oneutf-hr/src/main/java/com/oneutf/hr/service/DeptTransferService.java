package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.entity.DeptTransfer;
import com.oneutf.hr.model.entity.Position;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PositionVo;

public interface DeptTransferService extends BeanService<DeptTransfer> {
    /**
     * 创建岗位信息
     * @param deptTransferDto
     * @return
     */
    ApiResult<String> create(DeptTransferDto deptTransferDto);

    /**
     *  查询岗位信息
     * @param id
     * @return
     */
    ApiResult<DeptTransferVo> findById(String id);

    /**
     *  修改岗位信息
     * @param deptTransferDto
     * @return
     */
    ApiResult<String> update(DeptTransferDto deptTransferDto);

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
    ApiResult<PageInfo<DeptTransferVo>> getDataTable(DeptTransferQuery qo);


}
