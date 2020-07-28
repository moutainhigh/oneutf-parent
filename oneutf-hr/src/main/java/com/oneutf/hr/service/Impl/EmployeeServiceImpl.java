package com.oneutf.hr.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.impl.BeanServiceImpl;
import com.oneutf.hr.mapper.EmployeeMapper;
import com.oneutf.hr.model.dto.EmployeeDto;
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.query.EmployeeQuery;
import com.oneutf.hr.model.vo.EmployeeVo;
import com.oneutf.hr.service.EmployeeService;
import com.oneutf.util.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.oneutf.bean.result.ApiResultUtils.success;

/**
 * @author Administrator
 */

@Service
public class EmployeeServiceImpl extends BeanServiceImpl<EmployeeMapper,Employee> implements EmployeeService {

    @Override
    public ApiResult<String> create(EmployeeDto employeeDto) {

        Employee employee = BeanUtil.copyProperties(employeeDto, Employee.class);
        this.save(employee);
        return success("创建成功");
    }

    @Override
    public ApiResult<EmployeeVo> findById(String id) {
        Employee employee = this.getById(id);
        EmployeeVo employeeVo = BeanUtil.copyProperties(employee,EmployeeVo.class);
        return success(employeeVo);
    }

    @Override
    public ApiResult<String> update(EmployeeDto employeeDto) {
        Employee employee = BeanUtil.copyProperties(employeeDto, Employee.class);
        this.updateById(employee);
        return success("修改成功");
    }

    @Override
    public ApiResult<String> delete(String id) {
        this.removeById(id);
        return success("删除成功");
    }

    @Override
    public ApiResult<PageInfo<EmployeeVo>> getDataTable(EmployeeQuery qo) {
        PageHelper.startPage(qo.getPage(), qo.getLimit());
        List<Employee> entityList = lambdaQuery().list();
        List<EmployeeVo> vos = BeanUtil.voTransfer(entityList, EmployeeVo.class);
        PageInfo<EmployeeVo> pageInfo = new PageInfo<>(vos);
        return success(pageInfo);
    }

    @Override
    public List<Employee> findEmpByDeptId(String deptId) {
        List<Employee> employees = lambdaQuery().eq(Employee::getDeptId,deptId).list();
        return employees;
    }

    @Override
    public List<Employee> findEmpByPostId(String postId) {
        List<Employee> employees = lambdaQuery().eq(Employee::getPositionId,postId).list();
        return employees;
    }
}
