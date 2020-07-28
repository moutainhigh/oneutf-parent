package com.oneutf.hr.model.vo;

import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.vo.BeanVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PositionVo extends BeanVo {
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
