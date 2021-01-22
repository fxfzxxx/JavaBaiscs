package Exception_Test;

import java.util.Scanner;
import java.io.*;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accNumber = 0;
        double amount = 0;
        System.out.println("Please enter your account number: ");

        if (scan.hasNextInt()) {
            // 判断输入的是否是Int
            accNumber = scan.nextInt();
            // 接收整数
            System.out.println("Account number：" + accNumber);
        } else {
            // 输入错误的信息
            System.out.println("Wrong input info.");
        }
        CheckAccount c = new CheckAccount(accNumber);

        System.out.println("Please enter the amount you want to deposit: ");
        if (scan.hasNextDouble()) {
            // 判断输入的是否是double
            amount = scan.nextDouble();
            // 接收整数
            System.out.println("Deposit amount：" + amount);

            c.deposit(amount);

        } else {
            // 输入错误的信息
            System.out.println("Wrong input info.");
        }

        if (scan.hasNextDouble()) {
            // 判断输入的是否是double
            amount = scan.nextDouble();
            // 接收整数
            System.out.println("Withdraw amount：" + amount);

        } else {
            // 输入错误的信息
            System.out.println("Wrong input info.");
        }
        try {
            c.withdraw(amount);
            System.out.println("Withdraw: " + amount);

        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, insufficient fund in your account." + e.getAmount());
            e.printStackTrace();
        }

        scan.close();
    }
}
