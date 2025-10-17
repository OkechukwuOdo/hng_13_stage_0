package com.hng.backend_hng_stage_0.scourse;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

@RequiredArgsConstructor
@Service
@Slf4j
public class SourceService {
//    private final RestTemplate restTemplate;
//    private final Config config;
    public ResponseData getProfileDetail() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(5000); // 5s
        factory.setReadTimeout(5000);
        RestTemplate restTemplate = new RestTemplate(factory);
        String url = "https://catfact.ninja/fact";

        try {
            String jsonResponse = restTemplate.getForObject(url, String.class);
            log.info("json response{}",jsonResponse);
            ObjectMapper mapper = new ObjectMapper();
            CatFactApiResponse apiResponse = mapper.readValue(jsonResponse, CatFactApiResponse.class);
            log.info("json response{}",apiResponse);
            if(jsonResponse!=null){
                ResponseData.User user= new ResponseData.User();
                user.setEmail("osmondokey@gmail.com");
                user.setName("Osmond Odo");
                user.setStack("Java/Spring Boot");
                return ResponseData.builder()
                        .timestamp(Instant.now())
                        .fact(apiResponse.getFact())
                        .user(user)
                        .status("Success")
                        .build();
            }

        } catch (Exception e) {
            return ResponseData.builder()
                    .status("Error")
             .fact("No Fat Chat")
                    .build();
        }

     return ResponseData.builder()
//             .fact()
             .build();
    }
}



