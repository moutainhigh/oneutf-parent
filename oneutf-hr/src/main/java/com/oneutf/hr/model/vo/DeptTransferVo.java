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
public class DeptTransferVo extends BeanVo {
    /**
     * 员工名字
     */
    private String empId;
    private String empName;
    /**
     * 调转后的部门
     */
    private String afterDeptId;
    private String afterDeptName;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate transferTime;

}
