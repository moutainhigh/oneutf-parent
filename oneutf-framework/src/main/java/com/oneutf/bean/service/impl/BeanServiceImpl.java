package com.oneutf.bean.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneutf.bean.model.entity.BeanEntity;
import com.oneutf.bean.model.mapper.BeanMapper;
import com.oneutf.bean.service.BeanService;
import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author oneutf
 * @description: 封装类
 */
@Transactional(rollbackFor = Exception.class)
public class BeanServiceImpl<M extends BeanMapper<E>, E extends BeanEntity> extends ServiceImpl<M, E> implements BeanService<E> {

    @Override
    public String validate(E e) {
        // 校验非空
        String message = "";
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validation = factory.getValidator();
        Set<ConstraintViolation<E>> constraintViolations = validation.validate(e);
        if (constraintViolations.size() > 0){
            message = constraintViolations.iterator().next().getMessage();
        }
        return message;
    }

    public Boolean add(E entity) throws Exception{
        String message = this.validate(entity);
        if(StringUtils.isNotBlank(message)){
            throw new Exception(message);
        }
        return this.save(entity);
    }
}
