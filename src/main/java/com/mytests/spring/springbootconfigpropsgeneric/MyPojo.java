package com.mytests.spring.springbootconfigpropsgeneric;


import java.util.Collection;

public class MyPojo {


    MyGeneric<Foo> ofFoo;
    MyGeneric<? extends Foo> ofFooChildren;
    Class<? extends Foo> ofFooClass;
    Class<? extends MyGeneric<Object>> ofGenericOfObjectClass;
    Class<? extends MyGeneric<? extends Foo>> ofGenericOfFooClass;
    Class<? extends Collection<String>> ofStringCollectionClass;
    Class<Collection<String>> ofGenericTypeClass;

    public MyGeneric<Foo> getOfFoo() {
        return ofFoo;
    }

    public void setOfFoo(MyGeneric<Foo> ofFoo) {
        this.ofFoo = ofFoo;
    }

    public MyGeneric<? extends Foo> getOfFooChildren() {
        return ofFooChildren;
    }

    public void setOfFooChildren(MyGeneric<? extends Foo> ofFooChildren) {
        this.ofFooChildren = ofFooChildren;
    }

    public Class<? extends Foo> getOfFooClass() {
        return ofFooClass;
    }

    public void setOfFooClass(Class<? extends Foo> ofFooClass) {
        this.ofFooClass = ofFooClass;
    }

    public Class<? extends MyGeneric<Object>> getOfGenericOfObjectClass() {
        return ofGenericOfObjectClass;
    }

    public void setOfGenericOfObjectClass(Class<? extends MyGeneric<Object>> ofGenericOfObjectClass) {
        this.ofGenericOfObjectClass = ofGenericOfObjectClass;
    }

    public Class<? extends MyGeneric<? extends Foo>> getOfGenericOfFooClass() {
        return ofGenericOfFooClass;
    }

    public void setOfGenericOfFooClass(Class<? extends MyGeneric<? extends Foo>> ofGenericOfFooClass) {
        this.ofGenericOfFooClass = ofGenericOfFooClass;
    }

    public Class<? extends Collection<String>> getOfStringCollectionClass() {
        return ofStringCollectionClass;
    }

    public void setOfStringCollectionClass(Class<? extends Collection<String>> ofStringCollectionClass) {
        this.ofStringCollectionClass = ofStringCollectionClass;
    }

    public Class<Collection<String>> getOfGenericTypeClass() {
        return ofGenericTypeClass;
    }

    public void setOfGenericTypeClass(Class<Collection<String>> ofGenericTypeClass) {
        this.ofGenericTypeClass = ofGenericTypeClass;
    }
}
