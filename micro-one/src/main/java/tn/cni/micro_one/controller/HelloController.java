package tn.cni.micro_one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/one/hello")

public class HelloController {
 @GetMapping
    public String ahlaOne() {
        return "ahla from One";
    }
}
