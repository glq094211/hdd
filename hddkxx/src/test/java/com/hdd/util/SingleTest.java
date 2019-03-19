package com.hdd.util;

import java.util.function.Supplier;

public class SingleTest {

    private int num = 0;

    public static SingleTest create(final Supplier<SingleTest> supplier){
        return supplier.get();
    }

    public void add(){
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        SingleTest singleTest = SingleTest.create(SingleTest::new);
        singleTest.add();
        SingleTest singleTest1 = singleTest.create(SingleTest::new);
        singleTest1.add();

    }
}
