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
public class PostTransferQuery extends BeanQuery {
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate TransferTime;

}
