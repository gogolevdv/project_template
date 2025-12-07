package ru.gogol;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Наполняем инвентарь случайными яблоками
        Apple.fillInventoryWithRandomApples(10);

        List<Apple> greenApple = Apple.filterApple(Apple.getInventory(),a->"Green".equals(a.getColor()));


        System.out.println("=== All apples in inventory ===");

        Apple.displayApples(Apple.getInventory());
        System.out.println("=== Green apples in inventory ===");
        Apple.displayApples(greenApple);
        System.out.println("=== Yellow apples in inventory ===");
        Apple.displayApples(Apple.filterApple(Apple.getInventory(),a->"Yellow".equals(a.getColor())));
        Apple.displayApples(Apple.getInventory().stream().filter(a->"Yellow".equals(a.getColor())).toList());
        System.out.println("=== Pink apples in inventory ===");
        Apple.displayApples(Apple.filterApple(Apple.getInventory(),a->"Pink".equals(a.getColor())));
        System.out.println("=== Red apples in inventory ===");
        Apple.displayApples(Apple.filterApple(Apple.getInventory(),a->"Red".equals(a.getColor())));

        Apple.displayApples(Apple.filterApple(Apple.getInventory(),a->a.getWeight()>150));

        System.out.println("=== Red and Heavy apples in inventory ===");

        Apple.displayApples(Apple.filterApple1(Apple.getInventory(), new RedAndHeavyApples()));

        Apple.prettyPrintApple(Apple.getInventory(), new AppleSimpleFormatter());

    }
}