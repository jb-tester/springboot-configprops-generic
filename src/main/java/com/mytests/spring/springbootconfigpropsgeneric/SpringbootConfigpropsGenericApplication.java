package com.mytests.spring.springbootconfigpropsgeneric;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootConfigpropsGenericApplication implements CommandLineRunner {

    private final MyProperties myProperties;

    public SpringbootConfigpropsGenericApplication(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsGenericApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---test properties of generic type: ---");
        System.out.println(myProperties.getGenericBoolean().getT());
        System.out.println(myProperties.getGenericStrBoolean().getTypeOne());
        System.out.println(myProperties.getGenericStrBoolean().getTypeTwo());
        System.out.println("---test generic-type properties of MyPOJO : ---");
        for (MyPojo pojo : myProperties.getPojoList()) {
            System.out.println("---");
            System.out.println(pojo.getOfFoo().getT().getId());
            System.out.println(pojo.getOfFooChildren().getT().getId());
            System.out.println(pojo.getOfFooClass());
            System.out.println(pojo.getOfStringCollectionClass());
            System.out.println(pojo.getOfGenericTypeClass());
            System.out.println(pojo.getOfGenericOfObjectClass());
            System.out.println(pojo.getOfGenericOfFooClass());

        }

    }
}
