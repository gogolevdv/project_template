package ru.gogol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Apple {
    private String color;
    private int weight; // в граммах
    private static final List<Apple> inventory = new ArrayList<>();

    private static final String[] COLORS = {"Red", "Green", "Yellow", "Pink", "Orange"};
    private static final Random random = new Random();

    public Apple() {
        // Конструктор по умолчанию
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    // Геттеры
    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    // Метод для наполнения экземпляра случайными данными
    public void fillWithRandomData() {
        this.color = COLORS[random.nextInt(COLORS.length)];
        this.weight = 50 + random.nextInt(251); // вес от 50 до 300 грамм
    }

    // Метод для добавления яблока в инвентарь
    public void addToInventory() {
        inventory.add(this);
    }

    // Статический метод для наполнения инвентаря случайными яблоками
    public static void fillInventoryWithRandomApples(int count) {
        inventory.clear();
        for (int i = 0; i < count; i++) {
            Apple apple = new Apple();
            apple.fillWithRandomData();
            inventory.add(apple);
        }
    }

    // Метод для отбора яблок по цвету
    public static List<Apple> filterByColor(String targetColor) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equalsIgnoreCase(targetColor)) {
                result.add(apple);
            }
        }
        return result;
    }

    // Метод для отбора яблок по весу
    public static List<Apple> filterByWeight(int minWeight, int maxWeight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() >= minWeight && apple.getWeight() <= maxWeight) {
                result.add(apple);
            }
        }
        return result;
    }

    // Метод для отбора яблок по цвету и весу
    public static List<Apple> filterByColorAndWeight(String targetColor, int minWeight, int maxWeight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equalsIgnoreCase(targetColor) &&
                    apple.getWeight() >= minWeight && apple.getWeight() <= maxWeight) {
                result.add(apple);
            }
        }
        return result;
    }

    // Геттер для инвентаря
    public static List<Apple> getInventory() {
        return new ArrayList<>(inventory); // Возвращаем копию для защиты от изменений
    }

    // Метод для очистки инвентаря
    public static void clearInventory() {
        inventory.clear();
    }

    @Override
    public String toString() {
        return "Apple{color='" + color + "', weight=" + weight + "g}";
    }

    // Метод для отображения списка яблок
    public static void displayApples(List<Apple> apples) {
        if (apples.isEmpty()) {
            System.out.println("No apples found.");
        } else {
            for (Apple apple : apples) {
                System.out.println(apple);
            }
        }
    }
}