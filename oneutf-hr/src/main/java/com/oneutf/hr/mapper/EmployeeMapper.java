package com.oneutf.hr.mapper;

import com.oneutf.bean.model.mapper.BeanMapper;
import com.oneutf.hr.model.entity.Employee;
import com.oneutf.hr.model.entity.Organization;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 */
@Mapper
public interface EmployeeMapper extends BeanMapper<Employee> {

}
