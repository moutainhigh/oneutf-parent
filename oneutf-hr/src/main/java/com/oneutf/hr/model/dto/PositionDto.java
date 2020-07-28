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
public class PositionDto extends BeanDto {
    /**
     * 编号
     */
    private String jobNumber;
    /**
     * 名称
     */
    private String jobTitle;
    /**
     * 岗位类型
     */
    private String jobType;
    /**
     * 岗位编制
     */
    private String jobOrganization;

}
