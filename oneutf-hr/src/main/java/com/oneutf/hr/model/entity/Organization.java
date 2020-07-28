package com.oneutf.hr.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Administrator 组织实体
 */
@TableName("hr_org")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Organization extends BeanEntity {

    /**
     * 名称
     */
    private String name;
    /**
     * 类型
     */
    private String type;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 描述
     */
    private String desc;
    /**
     * 上级部门
     */
    private String deptParent;
    /**
     * 成立日期
     */
    private LocalDate establishDate;

}
