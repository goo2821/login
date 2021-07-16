package com.bose.user;

import com.bose.user.error.ErrorException;
import com.bose.user.error.ErrorStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
public class MyTest {

    @Test
    public void test() {
        throw new ErrorException(ErrorStatus.EMAIL_IS_NOT_FOUND);
    }

}
