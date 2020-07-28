package com.oneutf.hr.model.dto;

import com.oneutf.bean.model.dto.BeanDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmployeeDto extends BeanDto {

    /**
     *姓名
     */
    private String name;
    /**
     *性别
     */
    private String sex;
    /**
     *出生日期
     */
    private Date birthday;
    /**
     *身份证号
     */
    private String idCard;
    /**
     *部门
     */
    private String deptId;
    /**
     *岗位
     */
    private String positionId;
    /**
     *入职日期
     */
    private Date entryTime;
    /**
     *参加工作日期
     */
    private Date firstWorkTime;
    /**
     *用工形式
     */
    private String staffType;
    /**
     *人员来源
     */
    private String recruitType;
    /**
     *政治面貌
     */
    private String politicalOutlook;
    /**
     *民族
     */
    private String nation;
    /**
     *籍贯
     */
    private String nativePlace;
    /**
     *联系电话
     */
    private String telephone;
    /**
     *电子邮件
     */
    private String email;
    /**
     *身高
     */
    private String height;
    /**
     *血型
     */
    private String bloodType;
    /**
     *婚姻状况
     */
    private String maritalStatus;
    /**
     *出生地
     */
    private String birthplace;
    /**
     *户口所在地
     */
    private String registeredResidence;
    /**
     *最高学历
     */
    private String highestEducation;
    /**
     *最高学位
     */
    private String highestDegree;
    /**
     *毕业院校
     */
    private String graduationSchool;
    /**
     *所学专业
     */
    private String major;
    /**
     *毕业日期
     */
    private LocalDate graduationDate;

}
