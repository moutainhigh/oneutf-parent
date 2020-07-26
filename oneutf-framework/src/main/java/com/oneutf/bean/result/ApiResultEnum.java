package com.oneutf.bean.result;

import com.oneutf.bean.exception.Const;
import lombok.Getter;

/**
 * @author oneutf
 */

@Getter
public enum ApiResultEnum {
    /**
     * 成功状态
     */
    SUCCESS(Const.RESPONSE_SUCCESS_STATUS_CODE, Const.RESPONSE_SUCCESS_MESSAGE),
    /**
     * 系统异常
     */
    FAILURE(Const.RESPONSE_INTERNAL_FAILURE_STATUS_CODE, Const.RESPONSE_INTERNAL_FAILURE_MESSAGE),
    /**
     * 未知异常
     */
    UNKNOWN(Const.RESPONSE_UNKNOWN_FAILURE_STATUS_CODE, Const.RESPONSE_UNKNOWN_FAILURE_MESSAGE);

    private Integer code;
    private String msg;

    private ApiResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
