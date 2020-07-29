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
public class PostTransferVo extends BeanVo {
    /**
     * 员工id
     */
    private String empId;
    /**
     * 调转后的部门
     */
    private String afterPostId;

    /**
     * 调转类型
     */
    private String TransferType;

    /**
     * 调转原因
     */
    private String TransferReason;
    /**
     * 备注
     */
    private String remarks;
    /**
     *调动日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate TransferTime;

}
