package auth.controller;

import auth.model.VerificationCode.SendVerificationCodeReqVO;
import lombok.extern.slf4j.Slf4j;
import org.example.ruige.response.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-18 23:04
 **/

@RestController
@Slf4j
public class VerificationCodeController {
    @PostMapping("/verification/code/send")
    public Response send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return Response.success();
    }
}
