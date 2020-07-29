package com.oneutf.hr.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oneutf.bean.model.dto.BeanDto;
import com.oneutf.bean.model.vo.BeanVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmpInfoCenterVo extends BeanVo {
    /**
     * 员工id
     */
    private String empId;
    /**
     * 起始年月
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startingDate;

    /**
     * 截止年月
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate stopDate;

    /**
     * 所在单位名称
     */
    private String unitName;
    /**
     * 从事工作内容
     */
    private String jobContent;

    /**
     * 担任职位
     */
    private String duties;

   /**
     * 薪资
     */
    private BigDecimal salary;
   /**
     * 证明人
     */
    private String prove;
   /**
     * 证明人职务
     */
    private String proveDuties;
    /**
     * 证明人电话
     */
    private String proveTel;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 与本人关系
     */
    private String relationship;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 所在单位
     */
    private String company;
    /**
     * 职位
     */
    private String position;

    /**
     * 联系电话
     */
    private String telephone;


}
