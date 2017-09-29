package com.example.ota.demo3.controller;

import com.example.ota.demo3.Models.ResultModel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/num")
    @ResponseBody
    public  ResultModel HelloWorld(){
        return GetRandomNum();
    }
    public ResultModel GetRandomNum()
    {

        Date now=new Date();
        ResultModel model=new ResultModel();
        model.setStartTime(now);


        int[] values=new int[1000];
        Random random=new Random();
        for(int i=0;i<1000;i++)
        {
            values[i]=i*10+random.nextInt(9);
        }
        Date end=new Date();
        model.setEndTime(end);
        model.setNumbers(values);
        return  model;
    }

}
