package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.DeptTransferMapper;
import com.oneutf.hr.mapper.PositionMapper;
import com.oneutf.hr.model.dto.DeptTransferDto;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.entity.DeptTransfer;
import com.oneutf.hr.model.entity.Position;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PositionVo;
import com.oneutf.hr.service.DeptTransferService;
import com.oneutf.hr.service.PositionService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

@Service
public class DeptTransferServiceImpl extends BeanServiceImpl<DeptTransferMapper, DeptTransfer> implements DeptTransferService {

    @Override
    public ApiResult<String> create(DeptTransferDto deptTransferDto) {
        DeptTransfer deptTransfer = BeanUtil.copyProperties(deptTransferDto, DeptTransfer.class);
        this.save(deptTransfer);
        return success("创建成功");
    }

    @Override
    public ApiResult<DeptTransferVo> findById(String id) {
        DeptTransfer deptTransfer = this.getById(id);
        DeptTransferVo deptTransferVo = BeanUtil.copyProperties(deptTransfer,DeptTransferVo.class);
        return success(deptTransferVo);
    }

    @Override
    public ApiResult<String> update(DeptTransferDto deptTransferDto) {
        DeptTransfer deptTransfer = BeanUtil.copyProperties(deptTransferDto, DeptTransfer.class);
        this.updateById(deptTransfer);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
            this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<DeptTransferVo>> getDataTable(DeptTransferQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<DeptTransfer> entityList = lambdaQuery().list();
        List<DeptTransferVo> vos = BeanUtil.voTransfer(entityList, DeptTransferVo.class);
        PageInfo<DeptTransferVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}
