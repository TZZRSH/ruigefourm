package auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-18 14:57
 **/
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    // 省略...

    // ----------- 业务异常状态码 -----------
    VERIFICATION_CODE_SEND_FREQUENTLY("AUTH-20000", "请求太频繁，请3分钟后再试"),
    ;
    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;
}
