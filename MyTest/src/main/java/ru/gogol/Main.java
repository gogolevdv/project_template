package ru.gogol;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Наполняем инвентарь случайными яблоками
        Apple.fillInventoryWithRandomApples(10);

        System.out.println("=== All apples in inventory ===");
        Apple.displayApples(Apple.getInventory());
    }
}