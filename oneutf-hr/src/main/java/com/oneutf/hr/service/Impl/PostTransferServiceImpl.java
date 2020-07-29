package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.DeptTransferMapper;
import com.oneutf.hr.mapper.PostTransferMapper;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.entity.DeptTransfer;
import com.oneutf.hr.model.entity.PostTransfer;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PostTransferVo;
import com.oneutf.hr.service.DeptTransferService;
import com.oneutf.hr.service.PostTransferService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

@Service
public class PostTransferServiceImpl extends BeanServiceImpl<PostTransferMapper, PostTransfer> implements PostTransferService {

    @Override
    public ApiResult<String> create(PostTransferDto postTransferDto) {
        PostTransfer postTransfer = BeanUtil.copyProperties(postTransferDto, PostTransfer.class);
        this.save(postTransfer);
        return success("创建成功");
    }

    @Override
    public ApiResult<PostTransferVo> findById(String id) {
        PostTransfer postTransfer = this.getById(id);
        PostTransferVo postTransferVo = BeanUtil.copyProperties(postTransfer,PostTransferVo.class);
        return success(postTransferVo);
    }

    @Override
    public ApiResult<String> update(PostTransferDto postTransferDto) {
        PostTransfer postTransfer = BeanUtil.copyProperties(postTransferDto, PostTransfer.class);
        this.updateById(postTransfer);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
            this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<PostTransferVo>> getDataTable(PostTransferQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<PostTransfer> entityList = lambdaQuery().list();
        List<PostTransferVo> vos = BeanUtil.voTransfer(entityList, PostTransferVo.class);
        PageInfo<PostTransferVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}
