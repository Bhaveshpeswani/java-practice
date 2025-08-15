import java.util.Scanner;

public class MethodParameters {

    static void MyMethod(String fname){
        System.out.println("Hey" + fname + ", Welcome to Java! :) ");
    }

    public static void main(String[] args) {
        MyMethod(" Bhavesh");
        MyMethod(" Peswani");
    }
}