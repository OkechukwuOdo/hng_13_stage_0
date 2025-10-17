package com.hng.backend_hng_stage_0.scourse;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class ResponseData {
    private String status;
    private User user;
    private Instant timestamp;
    private String fact;


@Data
    public static class User {
        private String email;
        private String name;
        private String stack;
    }
}

//{
//        "status": "success",
//        "user": {
//        "email": "<your email>",
//        "name": "<your full name>",
//        "stack": "<your backend stack>"
//        },
//        "timestamp": "<current UTC time in ISO 8601 format>",
//        "fact": "<random cat fact from Cat Facts API>"
//        }