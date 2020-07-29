package com.oneutf.hr.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oneutf.bean.model.dto.BeanDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
     * 员工号
     */
    @NotBlank(message = "员工号不能为空")
    private String code;
    /**
     *姓名
     */
    @NotBlank(message = "姓名不能为空")
    private String name;
    /**
     *性别
     */
    @NotBlank(message = "性别不能为空")
    private String sex;
    /**
     *出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "出生日期不能为空")
    private LocalDate birthday;
    /**
     *身份证号
     */
    @NotBlank(message = "身份证号不能为空")
    private String idCard;
    /**
     *部门
     */
    @NotBlank(message = "部门不能为空")
    private String deptId;
    /**
     *岗位
     */
    @NotBlank(message = "岗位不能为空")
    private String positionId;
    /**
     *入职日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "入职日期不能为空")
    private LocalDate entryDate;
    /**
     *参加工作日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "参加工作日期不能为空")
    private LocalDate firstWorkDate;
    /**
     *用工形式
     */
    @NotBlank(message = "用工形式不能为空")
    private String staffType;
    /**
     *人员来源
     */
    @NotBlank(message = "人员来源不能为空")
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate graduationDate;

}
