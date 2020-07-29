package com.oneutf.hr.model.query;

import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.query.BeanQuery;
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
public class EmpQuitQuery extends BeanQuery {
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
