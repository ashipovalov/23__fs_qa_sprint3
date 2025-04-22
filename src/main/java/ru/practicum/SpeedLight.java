package ru.practicum;


public class SpeedLight {
    public String showLight(int currentSpeed) {
        System.out.println("Эта строка для демонстрации");
        System.out.println("Это наше самое настоящее изменение");
        System.out.println("А теперь посмотрим ребейз");
        if (currentSpeed < 60) {
            return "green";
        } else if (currentSpeed < 80) {
            return "yellow";
        } else {
            return "red";
        }
    }
}
