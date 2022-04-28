package com.company;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class IfWeather {
    public static void main(String[] args) {
        cityTemp(25);
    }

    public static void cityTemp(int degree) {
        if (degree >= 0 && degree <= 15) {
            System.out.println("cold");
        }
        if (degree >= 16 && degree <= 25) {
            System.out.println("warm");
        } else if (degree >= 26 && degree <= 35) {

            System.out.println("hot");
        } else if (degree >= 36 && degree <= 45) {
            System.out.println("extra hot");
        }
    }
}





