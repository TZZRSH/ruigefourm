package auth.model.VerificationCode;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.ruige.validator.PhoneNumber;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-18 15:01
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendVerificationCodeReqVO {
    @NotBlank(message = "手机号不能为空")
    @PhoneNumber
    private String phone;
}
