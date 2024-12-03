package tn.cni.micro_two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/two/hello")

public class HelloController {
 @GetMapping
    public String ahlaOne() {
        return "ahla from two";
    }
}
