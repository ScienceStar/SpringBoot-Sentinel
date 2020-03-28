package com.pr.demo.controller;

        import com.pr.demo.service.HelloService;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/28 15:16
 * @Version V1.0
 **/
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
}
