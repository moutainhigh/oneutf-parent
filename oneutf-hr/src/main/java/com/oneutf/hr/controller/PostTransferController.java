package com.oneutf.hr.controller;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PostTransferVo;
import com.oneutf.hr.service.DeptTransferService;
import com.oneutf.hr.service.PostTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("hr/postTransfer")
public class PostTransferController {
    @Autowired
    private PostTransferService postTransferService;

    @PostMapping("getDataTable")
    public ApiResult<PageInfo<PostTransferVo>> getDataTable(PostTransferQuery qo){
        return postTransferService.getDataTable(qo);
    }

    @PostMapping("create")
    public ApiResult<String> create(PostTransferDto postTransferDto) {
        return postTransferService.create(postTransferDto);
    }

    @PostMapping("update")
    public ApiResult<String> update(PostTransferDto postTransferDto) {
        return postTransferService.update(postTransferDto);
    }

    @PostMapping("delete")
    public ApiResult<String> delete(String id) {
        return postTransferService.delete(id);
    }

    @PostMapping("findById")
    public ApiResult<PostTransferVo> findById(String id) {
        return postTransferService.findById(id);
    }

}
