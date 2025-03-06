package com.xj.openai.code.review.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class OpenaiCodeReviewTestApplicationTests {


    @Test
    public void test(){
        System.out.println(Integer.parseInt("aaa"));
    }

    @Test
    void contextLoads() {
    }

}
