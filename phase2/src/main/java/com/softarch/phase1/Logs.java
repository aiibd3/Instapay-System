package com.softarch.phase1;

public class Logs { // this part creates logs for the users to keep track of their transactions
    String[] log = new String[100];
    float[] amount = new float[100];
    int LogCounter = 0;

    public void logger(String k, float a) // this part writes the transactions of each user to their logs
    {
        if (LogCounter < 100) {
            log[LogCounter] = k;
            amount[LogCounter] = a;
            LogCounter++;
        } else {
            System.out.println("Logs are full");
        }
    }
}
