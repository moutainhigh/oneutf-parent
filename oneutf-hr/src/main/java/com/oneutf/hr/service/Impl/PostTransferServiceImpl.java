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
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.entity.Organization;
import com.oneutf.hr.model.entity.PostTransfer;
import com.oneutf.hr.model.query.DeptTransferQuery;
import com.oneutf.hr.model.query.PostTransferQuery;
import com.oneutf.hr.model.vo.DeptTransferVo;
import com.oneutf.hr.model.vo.PostTransferVo;
import com.oneutf.hr.service.*;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

@Service
public class PostTransferServiceImpl extends BeanServiceImpl<PostTransferMapper, PostTransfer> implements PostTransferService {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private OrganizationService organizationService;

    @Override
    public ApiResult<String> create(PostTransferDto postTransferDto) {
        if ("数据录入错误".equals(postTransferDto.getTransferType())) {
            return success("调转成功");
        }
        Employee employee = employeeService.getById(postTransferDto.getEmpId());
        employee.setPositionId(postTransferDto.getAfterPostId());
        employeeService.updateById(employee);
        PostTransfer postTransfer = BeanUtil.copyProperties(postTransferDto, PostTransfer.class);
        this.save(postTransfer);
        return success("创建成功");
    }

    @Override
    public ApiResult<PostTransferVo> findById(String id) {
        PostTransfer postTransfer = this.getById(id);
        PostTransferVo postTransferVo = BeanUtil.copyProperties(postTransfer,PostTransferVo.class);
        postTransferVo.setEmployeeVo(employeeService.findById(postTransferVo.getEmpId()).getData());
        postTransferVo.setAfterPostVo(positionService.findById(postTransferVo.getAfterPostId()).getData());
        postTransferVo.setOrganizationVo(employeeService.findById(postTransferVo.getEmpId()).getData().getOrganizationVo());
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

        List<PostTransferVo> vos = new ArrayList<>();
        entityList.forEach(entity -> {
            vos.add(this.findById(entity.getId()).getData());
        });

        PageInfo<PostTransferVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}
