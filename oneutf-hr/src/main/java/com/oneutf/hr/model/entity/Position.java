package com.oneutf.hr.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Administrator
 */
@TableName("hr_position")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Position extends BeanEntity {
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
