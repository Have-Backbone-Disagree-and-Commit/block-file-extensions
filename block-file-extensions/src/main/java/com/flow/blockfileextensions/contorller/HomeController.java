package com.flow.blockfileextensions.contorller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/pinExtensions")
    @ResponseBody
    public String pinExtension(@RequestParam("name") String name,
                               @RequestParam("isChecked") boolean isChecked) {
        try {
        //  학장자 이름, 체크 여부
            log.info("확장자 이름 : " + name + ", 체크여부 : " + isChecked);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "success";

    }
}
