package com.program.console;

import java.util.Date;

public class Waiter {

//    1 sec pause
     public static void waitShort() {
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
     }

//     2 sec pause
    public static void waitMiddle() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    3 sec pause
    public static void waitLong() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
