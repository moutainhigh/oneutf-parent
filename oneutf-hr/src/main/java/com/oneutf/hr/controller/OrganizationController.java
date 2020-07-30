package com.oneutf.hr.controller;


import com.github.pagehelper.PageInfo;
import com.oneutf.bean.controller.BaseController;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.query.OrganizationQuery;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.hr.service.OrganizationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author Administrator //组织控制类
 */
@RestController
@RequestMapping("hr/org")
public class OrganizationController extends BaseController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<OrganizationVo>> getDataTable(OrganizationQuery qo){
        return organizationService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(@Valid OrganizationDto organizationDto) {
        return organizationService.create(organizationDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(OrganizationDto organizationDto) {
        return organizationService.update(organizationDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {
        return organizationService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<OrganizationVo> findById(String id) {
        return organizationService.findById(id);
    }

    @PostMapping("month")
    public ApiResult<Map<String, Integer>> month(){
        return organizationService.month();
    }

}
