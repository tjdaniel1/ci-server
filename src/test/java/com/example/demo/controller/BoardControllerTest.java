package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class BoardControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void getAllBoard() {

    }

    @Test
    void getByIdBoard() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/boards/1"))
                .andExpect(MockMvcResultMatchers.status().is5xxServerError());
    }

    @Test
    void saveBoard() {
    }
}