package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.EmpInfoCenterMapper;
import com.oneutf.hr.mapper.EmpQuitMapper;
import com.oneutf.hr.model.dto.EmpInfoCenterDto;
import com.oneutf.hr.model.dto.EmpQuitDto;
import com.oneutf.hr.model.entity.EmpInfoCenter;
import com.oneutf.hr.model.entity.EmpQuit;
import com.oneutf.hr.model.query.EmpInfoCenterQuery;
import com.oneutf.hr.model.query.EmpQuitQuery;
import com.oneutf.hr.model.vo.EmpInfoCenterVo;
import com.oneutf.hr.model.vo.EmpQuitVo;
import com.oneutf.hr.service.EmpInfoCenterService;
import com.oneutf.hr.service.EmpQuitService;
import com.oneutf.util.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author Administrator
 */
@Service
public class EmpInfoCenterServiceImpl extends BeanServiceImpl<EmpInfoCenterMapper, EmpInfoCenter> implements EmpInfoCenterService {

    @Override
    public ApiResult<String> create(EmpInfoCenterDto empInfoCenterDto) {
        EmpInfoCenter empInfoCenter = BeanUtil.copyProperties(empInfoCenterDto, EmpInfoCenter.class);
        this.save(empInfoCenter);
        return success("创建成功");
    }

    @Override
    public ApiResult<EmpInfoCenterVo> findById(String id) {
        EmpInfoCenter empQuit = this.getById(id);
        EmpInfoCenterVo empInfoCenterVo = BeanUtil.copyProperties(empQuit,EmpInfoCenterVo.class);
        return success(empInfoCenterVo);
    }

    @Override
    public ApiResult<String> update(EmpInfoCenterDto empInfoCenterDto) {
        EmpInfoCenter empInfoCenter = BeanUtil.copyProperties(empInfoCenterDto, EmpInfoCenter.class);
        this.updateById(empInfoCenter);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
            this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<EmpInfoCenterVo>> getDataTable(EmpInfoCenterQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<EmpInfoCenter> entityList = lambdaQuery().list();
        List<EmpInfoCenterVo> vos = BeanUtil.voTransfer(entityList, EmpInfoCenterVo.class);
        PageInfo<EmpInfoCenterVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }

    @Override
    public ApiResult<EmpInfoCenterVo> findByEmpId(String id) {
        EmpInfoCenter empInfoCenter =  lambdaQuery().eq(EmpInfoCenter::getEmpId,id).one();
        EmpInfoCenterVo empInfoCenterVo = BeanUtil.copyProperties(empInfoCenter, EmpInfoCenterVo.class);
        return success(empInfoCenterVo);
    }

}
