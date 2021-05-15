package com.github.carloshh.poc.exceptions.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ExceptionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Test that a business exception returns an error code and description as expected")
    public void testExceptionCode() throws Exception {
        mockMvc.perform(get("/exception"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("code").value("POC_CODE_EXCEPTION"))
                .andExpect(jsonPath("message").value("This is a test exception"));
    }

}