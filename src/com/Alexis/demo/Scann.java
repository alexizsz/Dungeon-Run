package com.Alexis.demo;

import java.util.Scanner;

public class Scann {

    private Scanner sc;

    public Scann(){
        this.sc = new Scanner(System.in);
    }
    public int nextInt(){
        return sc.nextInt();
    }
    public String nextLine(){
        return sc.nextLine();
    }

}
