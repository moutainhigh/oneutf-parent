package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.EmpQuitMapper;
import com.oneutf.hr.mapper.PostTransferMapper;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.dto.PostTransferDto;
import com.oneutf.hr.model.entity.EmpQuit;
import com.oneutf.hr.model.entity.PostTransfer;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.EmpQuitVo;
import com.oneutf.hr.model.vo.PostTransferVo;
import com.oneutf.hr.service.EmpQuitService;
import com.oneutf.hr.service.PostTransferService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

@Service
public class EmpQuitServiceImpl extends BeanServiceImpl<EmpQuitMapper, EmpQuit> implements EmpQuitService {

    @Override
    public ApiResult<String> create(EmpQuitDto empQuitDto) {
        EmpQuit empQuit = BeanUtil.copyProperties(empQuitDto, EmpQuit.class);
        this.save(empQuit);
        return success("创建成功");
    }

    @Override
    public ApiResult<EmpQuitVo> findById(String id) {
        EmpQuit empQuit = this.getById(id);
        EmpQuitVo empQuitVo = BeanUtil.copyProperties(empQuit,EmpQuitVo.class);
        return success(empQuitVo);
    }

    @Override
    public ApiResult<String> update(EmpQuitDto empQuitDto) {
        EmpQuit empQuit = BeanUtil.copyProperties(empQuitDto, EmpQuit.class);
        this.updateById(empQuit);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
            this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<EmpQuitVo>> getDataTable(EmpQuitQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<EmpQuit> entityList = lambdaQuery().list();
        List<EmpQuitVo> vos = BeanUtil.voTransfer(entityList, EmpQuitVo.class);
        PageInfo<EmpQuitVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }

    @Override
    public ApiResult<EmpQuitVo> findByEmpId(String id) {
        EmpQuit empQuit =  lambdaQuery().eq(EmpQuit::getEmpId,id).one();
        EmpQuitVo empQuitVo = BeanUtil.copyProperties(empQuit, EmpQuitVo.class);
        return success(empQuitVo);
    }
}
