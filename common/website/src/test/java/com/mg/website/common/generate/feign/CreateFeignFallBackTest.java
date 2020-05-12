package com.mg.website.common.generate.feign;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CreateFeignFallBackTest {

    @Test
    void classInit() {
        CreateFeignFallBack action = new CreateFeignFallBack("matao", new String[]{
                "get","list"
        });
        try {
            action.startCreate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}