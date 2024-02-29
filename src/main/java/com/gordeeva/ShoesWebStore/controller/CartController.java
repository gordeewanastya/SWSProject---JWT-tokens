package com.gordeeva.ShoesWebStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoppingCart")
public class CartController {
    @GetMapping
    public String showShoppingCart(){
        return "shoppingCart";
    }
}
