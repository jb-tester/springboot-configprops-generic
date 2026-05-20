package com.mytests.spring.springbootconfigpropsgeneric;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("my.generic.props")
public class MyProperties {

    @NestedConfigurationProperty
    MyGeneric2<String, Boolean> genericStrBoolean;
    @NestedConfigurationProperty
    MyGeneric<Boolean> genericBoolean;
    @NestedConfigurationProperty
    MyGeneric<String> genericString;

    List<MyPojo> pojoList;
    Map<String, MyPojo> pojoMap;

    public List<MyPojo> getPojoList() {
        return pojoList;
    }

    public void setPojoList(List<MyPojo> pojoList) {
        this.pojoList = pojoList;
    }

    public Map<String, MyPojo> getPojoMap() {
        return pojoMap;
    }

    public void setPojoMap(Map<String, MyPojo> pojoMap) {
        this.pojoMap = pojoMap;
    }

    public MyGeneric2<String, Boolean> getGenericStrBoolean() {
        return genericStrBoolean;
    }

    public void setGenericStrBoolean(MyGeneric2<String, Boolean> genericStrBoolean) {
        this.genericStrBoolean = genericStrBoolean;
    }

    public MyGeneric<Boolean> getGenericBoolean() {
        return genericBoolean;
    }

    public void setGenericBoolean(MyGeneric<Boolean> genericBoolean) {
        this.genericBoolean = genericBoolean;
    }

    public MyGeneric<String> getGenericString() {
        return genericString;
    }

    public void setGenericString(MyGeneric<String> genericString) {
        this.genericString = genericString;
    }
}
