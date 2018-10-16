package com.youli.web.controller;

import com.youli.core.Res;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanfuqiang
 * @description
 * @date 2018/10/17 0:21
 * @vesion 1.0
 */
@RestController
public class HealthyCheckController {

    @RequestMapping(value = "/healthyCheck/check", method = RequestMethod.GET)
    public Res<Integer> check() {
        //return Res.sucess(new Integer(3));
        return Res.buildRes("33","22", new Integer(22111));
    }
}
