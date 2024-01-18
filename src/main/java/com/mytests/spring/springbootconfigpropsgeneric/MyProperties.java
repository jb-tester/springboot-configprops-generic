package com.mytests.spring.springbootconfigpropsgeneric;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("my.generic.props")
public class MyProperties {

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
}
