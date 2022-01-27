package com.andrei.crypto_currency_watcher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crypto")
public class CryptoController {

    @GetMapping
    public String cryptoList() {


        return "arrList";
    }
}
