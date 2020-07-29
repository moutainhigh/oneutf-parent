package com.oneutf.hr.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PositionVo;
import com.oneutf.hr.service.DeptTransferService;
import com.oneutf.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("hr/deptTransfer")
public class DeptTransferController {
    @Autowired
    private DeptTransferService deptTransferService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<DeptTransferVo>> getDataTable(DeptTransferQuery qo){
        return deptTransferService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(@Valid DeptTransferDto deptTransferDto) {
        return deptTransferService.create(deptTransferDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(DeptTransferDto deptTransferDto) {
        return deptTransferService.update(deptTransferDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {
        return deptTransferService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<DeptTransferVo> findById(String id) {
        return deptTransferService.findById(id);
    }

}
