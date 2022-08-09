package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

public class StockAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to Stock Management");
        System.out.println("Enter the Number of Shares to Add: ");
        int numOfShares = scanner.nextInt();

        for (int index = 0; index < numOfShares; index++) {

            Stocks newShare = new Stocks();

            System.out.println("Enter Share name: ");
            newShare.setShareName(scanner.next());
            System.out.println("Enter share Price: ");
            newShare.setSharePrice(scanner.nextDouble());
            System.out.println("Enter no. of share taken: ");
            newShare.setShareCount(scanner.nextDouble());

        }
        System.out.println("Press \n1.Print Stocks  \n2.Calculate the value \n3.Remove stock \n4.Add \n5.Buy ");
        int key = scanner.nextInt();
        switch (key) {
            case 1:
                System.out.println("Enter the num of shares to add: ");
                int numOfShare = scanner.nextInt();

                for (int index = 0; index < numOfShare; index++) {

                    Stocks newShares = new Stocks();

                    System.out.println("Enter Share name: ");
                    newShares.setShareName(scanner.next());
                    System.out.println("Enter share Price: ");
                    newShares.setSharePrice(scanner.nextDouble());
                    System.out.println("Enter no. of share taken: ");
                    newShares.setShareCount(scanner.nextDouble());
                }
                break;
            case 2:
                System.out.println("Choose which stock you want to buy");
                System.out.println("1.Stocks Name=idea, Price=55.0 ");
                System.out.println("2.Stocks Name=airtel, Price=44.44 ");
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        Stocks buyShare = new Stocks();
                        buyShare.setShareName("Jio");
                        buyShare.setSharePrice(55);
                        System.out.println("enter the no of shares to buy");
                        buyShare.setShareCount(scanner.nextDouble());
                        break;
                    case 2:
                        Stocks buyShares = new Stocks();
                        buyShares.setShareName("Airtel");
                        buyShares.setSharePrice(44.44);
                        System.out.println("enter the no of shares to buy");
                        buyShares.setShareCount(scanner.nextDouble());
                        break;
                }
                break;
        }
        scanner.close();
    }
}