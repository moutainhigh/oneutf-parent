package com.oneutf.hr.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author Administrator
 */
@TableName("hr_emp_quit")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmpQuit extends BeanEntity {
    /**
     * 员工id
     */
    private String empId;
    /**
     * 离职日期
     */
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
