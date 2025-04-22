package ru.practicum;


public class SpeedLight {
    public String showLight(int currentSpeed) {
        System.out.println("Эта строка для демонстрации");
        if (currentSpeed < 60) {
            return "green";
        } else if (currentSpeed < 80) {
            return "yellow";
        } else {
            return "red";
        }
    }
}
