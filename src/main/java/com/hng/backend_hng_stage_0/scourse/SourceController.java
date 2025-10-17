package com.hng.backend_hng_stage_0.scourse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/me")
@RequiredArgsConstructor
public class SourceController {
    private final SourceService service;
    @GetMapping()
    public ResponseEntity<ResponseData> getProfileDetail(){
        ResponseData responseData=  service.getProfileDetail();
        return ResponseEntity.ok(responseData);
    }
}
