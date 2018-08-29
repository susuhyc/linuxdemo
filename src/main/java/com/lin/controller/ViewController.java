package com.lin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LISS
 * @email liss@staff.chinabyte.com
 * @date 2018/08/29 11:24
 * @since 2.8.1
 */
@RestController
@RequestMapping("view")
public class ViewController
{
    @RequestMapping("list")
    public void viewList(){
        System.out.println("123456789");
    }
}
