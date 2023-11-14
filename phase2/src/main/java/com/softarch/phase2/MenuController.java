package com.softarch.phase2;

import org.springframework.web.bind.annotation.*;

@RestController
public class MenuController {
    @GetMapping(value = "/menu/userMenu")
    public String getUserMenu() {
        return (
                """
                        -Pay Service (http://localhost:8080/menu/PayMenu)
                        -Add to Wallet (http://localhost:8080/users/addCash)
                        -Show Wallet Balance(http://localhost:8080/users/showWallet)
                        """
        );
    }

    @GetMapping(value = "/menu/PayMenu")
    public String getPayMenu() {
        return (
                """
                        -Mobile Recharge Services (http://localhost:8080/users/pay/mobile)
                        -Internet Payment Services (http://localhost:8080/users/pay/internet)
                        -Landline Services (http://localhost:8080/users/pay/landline)
                        """
        );
    }
}