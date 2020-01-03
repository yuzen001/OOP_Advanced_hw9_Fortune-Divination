package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String LuckyString[] = {"普通","吉","大吉"};
        System.out.println("請輸入生日 :月 日");
        int MonthNumber = Integer.parseInt(scanner.next());
        while (MonthNumber<1||MonthNumber>12){
            System.out.println("輸入錯誤請再輸入月份:");
            MonthNumber = Integer.parseInt(scanner.next());
        }
        int DateNumber = Integer.parseInt(scanner.next());
        while (DateNumber<1||DateNumber>31){
            System.out.println("輸入錯誤請再輸入日期:");
            DateNumber = Integer.parseInt(scanner.next());
        }
        int LuckyNumber = (MonthNumber*2+DateNumber)%3;
        System.out.println("你的運勢:"+LuckyString[LuckyNumber]);
    }
}