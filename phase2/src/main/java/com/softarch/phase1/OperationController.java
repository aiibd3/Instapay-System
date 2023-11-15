package com.softarch.phase1;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {
    WalletManagement w = new WalletManagement();
    Pay p = new Pay();

    @PostMapping(value = "/users/pay/bill")
    public String payBills(@RequestParam int choice, String amount, int sp, String ccn) {
        return p.payBill(choice, amount, sp, ccn);
    }

    @PostMapping(value = "/users/pay/transfer")
    public String transferToWallet(@RequestParam int choice, String amount, int sp, String option) {
        return p.TransferToWallet(choice, amount, sp, option);
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
