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
@TableName("hr_post_transfer")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PostTransfer extends BeanEntity {
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
    private LocalDate transferTime;

}
