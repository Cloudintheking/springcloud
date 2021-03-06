package com.fatboa.serviceribbon.controller;

import com.fatboa.serviceribbon.service.HiService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hl
 * @time: 2018/10/31 13:58
 * @description:
 */
@RestController
public class HelloController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    String hi(@RequestParam String name) {
        return hiService.hi(name);
    }

    @GetMapping("/ribbon")
    String ribbon() {
        return "hi,我是ribbon";
    }

    @GetMapping("/tracefeign")
    public String tracefeign() {
        return hiService.trace();
    }
}
