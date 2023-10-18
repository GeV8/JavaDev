import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Clothes[] clothingArray = {
                    new Clothes("Футболка", "Футболка", 38, 20.0, "червона"),
                    new Clothes("Джинси", "Штани", 32, 50.0, "синя"),
                    new Clothes("Спортивний костюм", "Комплект", 40, 80.0, "чорна"),
                    new Clothes("Куртка", "Верхній одяг", 42, 70.0, "сіра"),
                    new Clothes("Шапка", "Аксесуар", 56, 10.0, "чорна")
            };

            Arrays.sort(clothingArray, Comparator.comparingDouble(clothes -> clothes.getPrice()));

            System.out.println("Сортування за ціною за зростанням:");
            for (Clothes item : clothingArray) {
                System.out.println(item);
            }

            Arrays.sort(clothingArray, Comparator.comparing(Clothes::getColor).reversed());

            System.out.println("\nСортування за кольором за спаданням:");
            for (Clothes item : clothingArray) {
                System.out.println(item);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}