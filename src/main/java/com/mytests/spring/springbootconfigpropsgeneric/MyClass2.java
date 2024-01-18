package com.mytests.spring.springbootconfigpropsgeneric;


public class MyClass2 extends MyGeneric<Object>{
    String id;
    public MyClass2(Object obj) {
        super(obj);
        id = obj.toString();
    }

    public String getId() {
        return id;
    }
}
