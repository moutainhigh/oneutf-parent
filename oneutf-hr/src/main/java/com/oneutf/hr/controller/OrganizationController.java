package com.oneutf.hr.controller;


import com.oneutf.bean.controller.BaseController;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.hr.service.OrganizationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator //组织控制类
 */
@RestController
@RequestMapping("hr/org")
public class OrganizationController extends BaseController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("create")
    public ApiResult<String> create(OrganizationDto organizationDto) {

        return organizationService.create(organizationDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(OrganizationDto organizationDto) {

        return organizationService.create(organizationDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {

        return organizationService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<OrganizationVo> findById(String id) {

        return organizationService.findById(id);
    }

}
