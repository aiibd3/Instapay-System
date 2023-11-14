package com.softarch.phase2;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {


    WalletManagement w = new WalletManagement();
    Pay p = new Pay();

    @PostMapping(value = "/users/pay/mobile")
    public String payMobile(@RequestParam int choice, String amount, int sp, String ccn) {
        return p.payMobile(choice, amount, sp, ccn);
    }

    @PostMapping(value = "/users/pay/internet")
    public String payInternet(@RequestParam int choice, String amount, int sp, String ccn) {
        return p.PayInternet(choice, amount, sp, ccn);
    }

    @PostMapping(value = "/users/pay/landline")
    public String payLandline(@RequestParam int choice, String amount, int sp, String ccn) {
        return p.payLandline(choice, amount, sp, ccn);
    }

    @PostMapping(value = "/users/addCash")
    public String addCash(@RequestParam String cnum, int cash) {
        return w.addCash(cnum, cash);
    }

    @GetMapping(value = "/users/showWallet")
    public float walletPrint() {
        return w.walletPrint();
    }
}
