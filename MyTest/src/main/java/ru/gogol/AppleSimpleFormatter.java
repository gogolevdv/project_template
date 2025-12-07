package ru.gogol;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple a) {
        return "Apple color: " + a.getColor()+"; " + "weight = "+ a.getWeight()+"g.";
    }
}
