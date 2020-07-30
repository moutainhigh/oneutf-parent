package com.oneutf.hr.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.vo.BeanVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmpQuitVo extends BeanVo {
    /**
     * 员工id
     */
    private String empId;
    private EmployeeVo employeeVo;
    /**
     * 离职日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate quitTime;

    /**
     * 离职类型
     */
    private String quitType;
    /**
     * 离职去向
     */
    private String quitDirection;
    /**
     * 是否进入人才库
     */
    private String talentPool;

    /**
     * 备注
     */
    private String remarks;


}
