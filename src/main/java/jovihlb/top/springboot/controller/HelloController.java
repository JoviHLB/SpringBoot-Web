package jovihlb.top.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: jovihlb.top.springboot.controller
 * Description：
 * Author: HLB
 * Date:  2021/3/27 18:45
 * Modified By:
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return "Hello Spring Boot!";
    }
}
