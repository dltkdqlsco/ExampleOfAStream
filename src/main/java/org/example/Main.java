package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("lee", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("kim", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("hong", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단");
        customerList.stream().forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("여행 비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println();
        System.out.println("20세 이상 고이름 정렬");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
    }
}