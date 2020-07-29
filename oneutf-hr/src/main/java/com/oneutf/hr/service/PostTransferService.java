package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.entity.DeptTransfer;
import com.oneutf.hr.model.entity.PostTransfer;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PostTransferVo;

public interface PostTransferService extends BeanService<PostTransfer> {
    /**
     * 创建岗位信息
     * @param postTransferDto
     * @return
     */
    ApiResult<String> create(PostTransferDto postTransferDto);

    /**
     *  查询岗位信息
     * @param id
     * @return
     */
    ApiResult<PostTransferVo> findById(String id);

    /**
     *  修改岗位信息
     * @param postTransferDto
     * @return
     */
    ApiResult<String> update(PostTransferDto postTransferDto);

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
    ApiResult<PageInfo<PostTransferVo>> getDataTable(PostTransferQuery qo);


}
