package com.txy.gkzyfz.test;

import java.util.UUID;

public class Uuid {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
