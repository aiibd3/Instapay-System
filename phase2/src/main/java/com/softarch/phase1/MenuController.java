package com.softarch.phase1;

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
                        -Transfer money Services: (http://localhost:8080/users/pay/transfer)  
                        1. Transfer another bank account
                        2. Transfer To a Mobile Wallet through a wallet providers
                        3. Transfer to Another InstaPay account
                                                                  
                        -Pay bills (http://localhost:8080/users/pay/bill)                                                
                        """
        );
    }
}