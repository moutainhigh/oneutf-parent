package com.oneutf.hr.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.OrganizationDto;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.query.OrganizationQuery;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.OrganizationVo;
import com.oneutf.hr.model.vo.PositionVo;
import com.oneutf.hr.service.OrganizationService;
import com.oneutf.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("hr/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<PositionVo>> getDataTable(PositionQuery qo){
        return positionService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(PositionDto positionDto) {

        return positionService.create(positionDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(PositionDto positionDto) {

        return positionService.update(positionDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {

        return positionService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<PositionVo> findById(String id) {

        return positionService.findById(id);
    }

}
