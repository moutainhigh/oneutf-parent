package com.oneutf.hr.model.dto;

import com.oneutf.bean.model.dto.BeanDto;
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
public class PostTransferDto extends BeanDto {
    /**
     * 员工id
     */
    private String empId;
    /**
     * 调转后的岗位
     */
    private String afterPostId;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate transferTime;

}
