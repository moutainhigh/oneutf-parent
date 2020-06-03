package com.oneutf.bean.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author oneutf
 */
@Data
public class BeanDto {

    private Long id;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}
