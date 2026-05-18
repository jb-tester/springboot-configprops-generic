package com.mytests.spring.springbootconfigpropsgeneric;


public class MyGeneric2<T1, T2> {
    T1 typeOne;
    T2 typeTwo;

    public T1 getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(T1 typeOne) {
        this.typeOne = typeOne;
    }

    public T2 getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(T2 typeTwo) {
        this.typeTwo = typeTwo;
    }
}
