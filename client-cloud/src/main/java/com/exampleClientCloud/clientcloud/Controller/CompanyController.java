package com.exampleClientCloud.clientcloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CompanyController 
{
    @Value("${server.port}")
    private String name;
    @GetMapping("/m")
    public String getvaaluer()
    {
        return name;
    }
}
