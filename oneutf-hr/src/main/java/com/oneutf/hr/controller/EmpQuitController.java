package com.oneutf.hr.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.EmpQuitVo;
import com.oneutf.hr.model.vo.PostTransferVo;
import com.oneutf.hr.service.EmpQuitService;
import com.oneutf.hr.service.PostTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("hr/empQuit")
public class EmpQuitController {
    @Autowired
    private EmpQuitService empQuitService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<EmpQuitVo>> getDataTable(EmpQuitQuery qo){
        return empQuitService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(EmpQuitDto empQuitDto) {
        return empQuitService.create(empQuitDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(EmpQuitDto empQuitDto) {
        return empQuitService.update(empQuitDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {
        return empQuitService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<EmpQuitVo> findById(String id) {
        return empQuitService.findById(id);
    }

    @PostMapping("findByEmpId")
    public ApiResult<EmpQuitVo> findByEmpId(String id) {
        return empQuitService.findByEmpId(id);
    }

}
