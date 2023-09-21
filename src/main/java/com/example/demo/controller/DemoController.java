package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DemoController {
    // 생성자 주입
//    private DemoService demoService;
//
//    // Demoservice 객체를 매개변수로 하는 생성자
//    @Autowired
//    public DemoController(DemoService demoService){
//        this.demoService = demoService;
//    }

    // 생성자 주입 좀 더 편하게
//    private final DemoService demoService;
//
//    // @RequiredArgsConstructor: 파이널이 붙은 애들로만 생성자를 만듦
//    // fianl이 붙음으로써 값이 변하지 않게.
//
//    private final DemoService1 demoService;
//    private DemoService2 demoService;
//    private final DemoService3 demoService;
//
//    public DemoController(DemoService1 demoService1, DemoService3 demoService3) {
//        this.demoService1 = demoService1;
//        this.demoService3 = demoService3;

    }
