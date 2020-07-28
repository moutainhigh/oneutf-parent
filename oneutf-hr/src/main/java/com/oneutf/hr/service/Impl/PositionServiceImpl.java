package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.PositionMapper;
import com.oneutf.hr.model.dto.PositionDto;
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.entity.Position;
import com.oneutf.hr.model.query.PositionQuery;
import com.oneutf.hr.model.vo.EmployeeVo;
import com.oneutf.hr.model.vo.PositionVo;
import com.oneutf.hr.service.PositionService;
import com.oneutf.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

@Service
public class PositionServiceImpl extends BeanServiceImpl<PositionMapper, Position> implements PositionService {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @Override
    public ApiResult<String> create(PositionDto positionDto) {
        Position position = BeanUtil.copyProperties(positionDto, Position.class);
        this.save(position);
        return success("创建成功");
    }

    @Override
    public ApiResult<PositionVo> findById(String id) {
        Position position = this.getById(id);
        PositionVo positionVo = BeanUtil.copyProperties(position,PositionVo.class);
        return success(positionVo);
    }

    @Override
    public ApiResult<String> update(PositionDto positionDto) {
        Position position = BeanUtil.copyProperties(positionDto, Position.class);
        this.updateById(position);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
        String msg = "删除失败";
        if(this.employeeService.findEmpByDeptId(id).size()<=0){
            this.removeById(id);
            msg = "删除成功";
        }
        return success(msg);
    }

    @Override
    public ApiResult<PageInfo<PositionVo>> getDataTable(PositionQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<Position> entityList = lambdaQuery().list();
        List<PositionVo> vos = BeanUtil.voTransfer(entityList, PositionVo.class);
        PageInfo<PositionVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }
}
