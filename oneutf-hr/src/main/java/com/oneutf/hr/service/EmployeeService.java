package com.oneutf.hr.service;

import com.github.pagehelper.PageInfo;
import com.oneutf.bean.result.ApiResult;
import com.oneutf.bean.service.BeanService;
import com.oneutf.hr.model.dto.EmployeeDto;
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.query.EmployeeQuery;
import com.oneutf.hr.model.vo.EmployeeVo;

import java.util.List;

/**
 * @author Administrator
 */
public interface EmployeeService extends BeanService<Employee> {
    /**
     * 创建员工信息
     * @param employeeDto
     * @return
     */
    ApiResult<String> create(EmployeeDto employeeDto);

    /**
     *  查询员工信息
     * @param id
     * @return
     */
    ApiResult<EmployeeVo> findById(String id);

    /**
     *  修改员工信息
     * @param employeeDto
     * @return
     */
    ApiResult<String> update(EmployeeDto employeeDto);

    /**
     *  删除员工信息
     * @param id
     * @return
     */
    ApiResult<String> delete(String id);

    /**
     *  获取列表
     * @param qo
     * @return
     */
    ApiResult<PageInfo<EmployeeVo>> getDataTable(EmployeeQuery qo);

    /**
     * 根据部门id获取员工信息
     * @param deptId
     * @return
     */
    List<Employee> findEmpByDeptId(String deptId);

    /**
     * 根据岗位id获取人员信息
     * @param postId
     * @return
     */
    List<Employee> findEmpByPostId(String postId);
}
