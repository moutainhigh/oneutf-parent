package com.oneutf.hr.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.EmpInfoCenterDto;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.entity.EmpInfoCenter;
import com.oneutf.hr.model.query.EmpInfoCenterQuery;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.vo.EmpInfoCenterVo;
import com.oneutf.hr.model.vo.EmpQuitVo;
import com.oneutf.hr.service.EmpInfoCenterService;
import com.oneutf.hr.service.EmpQuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("hr/empQuit")
public class EmpInfoCenterController {
    @Autowired
    private EmpInfoCenterService empInfoCenterService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<EmpInfoCenterVo>> getDataTable(EmpInfoCenterQuery qo){
        return empInfoCenterService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(EmpInfoCenterDto empInfoCenterDto) {

        return empInfoCenterService.create(empInfoCenterDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(EmpInfoCenterDto empInfoCenterDto) {

        return empInfoCenterService.update(empInfoCenterDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {

        return empInfoCenterService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<EmpInfoCenterVo> findById(String id) {

        return empInfoCenterService.findById(id);
    }

    @PostMapping("findByEmpId")
    public ApiResult<EmpInfoCenterVo> findByEmpId(String id) {

        return empInfoCenterService.findByEmpId(id);
    }

}
