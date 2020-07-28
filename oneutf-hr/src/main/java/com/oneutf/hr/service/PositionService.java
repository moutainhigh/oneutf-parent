package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.EmployeeDto;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.entity.Position;
import com.oneutf.hr.model.query.EmployeeQuery;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.EmployeeVo;
import com.oneutf.hr.model.vo.PositionVo;

import java.util.List;

public interface PositionService extends BeanService<Position> {
    /**
     * 创建岗位信息
     * @param positionDto
     * @return
     */
    ApiResult<String> create(PositionDto positionDto);

    /**
     *  查询岗位信息
     * @param id
     * @return
     */
    ApiResult<PositionVo> findById(String id);

    /**
     *  修改岗位信息
     * @param positionDto
     * @return
     */
    ApiResult<String> update(PositionDto positionDto);

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
    ApiResult<PageInfo<PositionVo>> getDataTable(PositionQuery qo);


}
