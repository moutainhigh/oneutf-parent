package com.oneutf.hr.model.query;

import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.query.BeanQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrganizationQuery extends BeanQuery {

    /**
     * 编号
     */
    private String code;
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
    private LocalDateTime establishTime;

}
