package com.mytests.spring.springbootconfigpropsgeneric;


public class MyClass extends MyGeneric<FooImpl1>{
    String id;
    public MyClass(FooImpl1 fooImpl1) {
        super(fooImpl1);
        id = fooImpl1.getId();
    }

    public String getId() {
        return id;
    }
}
