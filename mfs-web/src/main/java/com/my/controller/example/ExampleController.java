package com.my.controller.example;

import com.my.intf.example.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @Autowired
    IExampleService exampleService;

    @RequestMapping(value = "/helloworld")
    public String helloworld() {
        return exampleService.helloworld();
    }
}
