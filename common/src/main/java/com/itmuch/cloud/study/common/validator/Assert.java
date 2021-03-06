package com.itmuch.cloud.study.common.validator;

import com.itmuch.cloud.study.common.enums.ErrorCodeEnum;
import com.itmuch.cloud.study.common.exception.RRException;
import org.apache.commons.lang3.StringUtils;

/**
 * 数据校验
 *
 * @author xierongli
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isEmpty(String str, String message) {
        if (StringUtils.isEmpty(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }

    public static void isNotNull(Object object, String message) {
        if (object != null) {
            throw new RRException(message);
        }
    }

    public static void isTrue(boolean expression, String message) {
        if (expression) {
            throw new RRException(message);
        }
    }

    public static void isTrue(boolean expression, ErrorCodeEnum errorCodeEnum) {
        if (expression) {
            throw new RRException(errorCodeEnum);
        }
    }



    public static void isTrue(boolean expression, Integer errorCode, String message) {
        if (expression) {
            throw new RRException(message, errorCode);
        }
    }

    public static void hasText(String text, String message) {
        if (StringUtils.isEmpty(text)) {
            throw new RRException(message);
        }
    }

    public static void doesNotContain(String textToSearch, String substring, String message) {
        if (org.springframework.util.StringUtils.hasLength(textToSearch) && org.springframework.util.StringUtils.hasLength(substring) && textToSearch.contains(substring)) {
            throw new RRException(message);
        }
    }

    public static void doesNotContain(String textToSearch, String substring) {
        doesNotContain(textToSearch, substring, "[Assertion failed] - this String argument must not contain the substring [" + substring + "]");
    }


}
