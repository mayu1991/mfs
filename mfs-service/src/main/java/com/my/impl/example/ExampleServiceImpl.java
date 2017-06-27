package com.my.impl.example;

import com.my.intf.example.IExampleService;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2017/6/26.
 */
@Service
public class ExampleServiceImpl implements IExampleService {

    @Override
    public String helloworld() {
        return "helloworld";
    }
}
