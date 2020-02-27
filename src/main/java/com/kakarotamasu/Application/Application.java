package com.kakarotamasu.Application;

import com.kakarotamasu.Database.Database;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Database db = new Database();
        db.getDipFromDatabase(62);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        int start = scanner.nextInt();
        float startValue = db.getDipFromDatabase(start);
        System.out.println("Enter end");
        int end = scanner.nextInt();
        float endValue  = db.getDipFromDatabase(end);
        System.out.println("calculation - " + (startValue-endValue));
    }


    public float dipReadingCalculation(float a, float b){
        return a -b;
    }
}
