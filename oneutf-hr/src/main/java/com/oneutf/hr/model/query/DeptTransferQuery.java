package com.oneutf.hr.model.query;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class DeptTransferQuery extends BeanQuery {
    /**
     * 员工名字
     */
    private String empId;
    /**
     * 调转后的部门
     */
    private String afterDeptId;

    /**
     * 调转类型
     */
    private String transferType;

    /**
     * 调转原因
     */
    private String transferReason;
    /**
     * 备注
     */
    private String remarks;
    /**
     *调动日期
     */

    private LocalDate transferTime;

}
