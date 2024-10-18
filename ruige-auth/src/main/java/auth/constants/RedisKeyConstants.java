package auth.constants;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-18 14:56
 **/
public class RedisKeyConstants {
    private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code:";

    /**
     * 构建验证码 KEY
     * @param phone
     * @return
     */
    public static String buildVerificationCodeKey(String phone) {
        return VERIFICATION_CODE_KEY_PREFIX + phone;
    }
}
