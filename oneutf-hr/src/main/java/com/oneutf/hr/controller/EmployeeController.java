package com.oneutf.hr.controller;


import com.github.pagehelper.PageInfo;
import com.oneutf.bean.controller.BaseController;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.EmployeeDto;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.query.EmployeeQuery;
import com.oneutf.hr.model.query.OrganizationQuery;
import com.oneutf.hr.model.vo.EmployeeVo;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.hr.service.EmployeeService;
import com.oneutf.hr.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator //组织控制类
 */
@RestController
@RequestMapping("hr/employee")
public class EmployeeController extends BaseController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("create")
    public ApiResult<String> create(EmployeeDto employeeDto){

        return employeeService.create(employeeDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(EmployeeDto employeeDto){

        return employeeService.update(employeeDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(@RequestParam(value="id",required=false)String id){

        return employeeService.delete(id);
    }

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<EmployeeVo>> getDataTable(EmployeeQuery qo){

        return employeeService.getDataTable(qo);
    }
    @PostMapping("findById")
    public ApiResult<EmployeeVo> findById(String id){

        return employeeService.findById(id);
    }

}
