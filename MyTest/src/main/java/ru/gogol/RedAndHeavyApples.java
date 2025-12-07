package ru.gogol;

public class RedAndHeavyApples implements ApplePredicate {
    public boolean test(Apple apple){
        return "Red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
