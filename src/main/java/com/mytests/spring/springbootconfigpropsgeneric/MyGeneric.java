package com.mytests.spring.springbootconfigpropsgeneric;


public class MyGeneric<T> {
    private final T t;

    public MyGeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
