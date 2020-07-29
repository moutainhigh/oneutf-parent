package com.oneutf.hr.model.dto;

import com.oneutf.bean.model.dto.BeanDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmpQuitDto extends BeanDto {
    /**
     * 员工id
     */
    private String empId;
    /**
     * 离职日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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
