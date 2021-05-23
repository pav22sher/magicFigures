package company.service;

import company.View.MainView;
import company.View.SecurityView;
import company.model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            User user = SecurityView.start(scanner);
            if (user != null){
                MainView.start(scanner);
            } else {
                break;
            }
        }
    }
}