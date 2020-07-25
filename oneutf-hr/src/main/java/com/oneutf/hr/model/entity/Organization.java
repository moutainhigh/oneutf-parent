package com.oneutf.hr.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.entity.BeanEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author Administrator 组织实体
 */
@TableName("sys_org")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Organization extends BeanEntity {

    /**
     * 名称
     */
    private String orgName;
    /**
     * 类型
     */
    private String orgType;
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
    private String describe;
    /**
     * 上级部门
     */
    private String deptParentId;
    /**
     * 成立日期
     */
    private Date establishTime;

}
