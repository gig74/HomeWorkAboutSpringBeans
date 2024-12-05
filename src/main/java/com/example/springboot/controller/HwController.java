package com.example.springboot.controller;

import com.example.springboot.model.RequestScopeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwController {
    private RequestScopeBean requestScopeBean;

    public HwController(RequestScopeBean requestScopeBean) {
        System.out.println("Rest controller has started");
        this.requestScopeBean = requestScopeBean;
    }

    @GetMapping("/*")
    public String hw() {
        StringBuilder b = new StringBuilder();
        b.append("HW!!!\n\n");
        b.append("First call of the request scope bean : \n");
        b.append(requestScopeBean.toString());
        b.append("\n\n");
        b.append("Second call of the request scope bean : \n");
        b.append(requestScopeBean.toString());
        b.append("\n");
        return b.toString();
    }
}
