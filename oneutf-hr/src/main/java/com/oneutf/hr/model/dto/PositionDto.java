package com.oneutf.hr.model.dto;

import com.oneutf.bean.model.dto.BeanDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "编号不能为空")
    private String jobNumber;
    /**
     * 名称
     */
    @NotBlank(message = "名称不能为空")
    private String jobTitle;
    /**
     * 岗位类型
     */
    @NotBlank(message = "岗位类型不能为空")
    private String jobType;
    /**
     * 岗位编制
     */
    private String jobOrganization;

}
