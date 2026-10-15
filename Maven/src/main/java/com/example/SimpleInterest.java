package com.example;

public class SimpleInterest {

    public double calculate(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be non-negative.");
        }
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        System.out.println("Simple Interest (P=1000, R=5, T=2): " + si.calculate(1000, 5, 2));
    }
}