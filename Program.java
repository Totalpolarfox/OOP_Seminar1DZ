// Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
// Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        
        AnimalFeed animalFeed1 = new AnimalFeed("Royal Canin", "Puppy", 1350, "dog", "dry");
        AnimalFeed animalFeed2 = new AnimalFeed("AlphaPet", "Satiety", 1700, "dog", "dry");
        AnimalFeed animalFeed3 = new AnimalFeed("Royal Canin", "Renal", 1100, "cat", "dry");
        AnimalFeed animalFeed4 = new AnimalFeed("Sheba", "Adult", 950, "dog", "wet");
        AnimalFeed animalFeed5 = new AnimalFeed("AlphaPet", "Exigent", 1000, "dog", "wet");
        AnimalFeed animalFeed6 = new AnimalFeed("Sheba", "Sensible", 1200, "cat", "dry");
        AnimalFeed animalFeed7 = new AnimalFeed("Royal Canin", "Sterelised", 850, "cat", "wet");
        AnimalFeed animalFeed8 = new AnimalFeed("Felix", "Kitten", 900, "cat", "wet");
        AnimalFeed animalFeed9 = new AnimalFeed("Purina", "Sterelised", 900, "cat", "dry");
        AnimalFeed animalFeed10 = new AnimalFeed("Perfect Fit", "OptyRenal", 750, "cat", "dry");
        AnimalFeed animalFeed11 = new AnimalFeed("Whiskas", "Digestion", 950, "dog", "dry");
        AnimalFeed animalFeed12 = new AnimalFeed("Purina", "Nutrytion", 1200, "dog", "dry");
        AnimalFeed animalFeed13 = new AnimalFeed("Purina", "NutrySavoir", 1100, "cat", "wet");
        AnimalFeed animalFeed14 = new AnimalFeed("Perfect Fit", "Maitenance", 600, "cat", "wet");
        AnimalFeed animalFeed15 = new AnimalFeed("Felix", "OptySavoir", 800, "dog", "wet");
        AnimalFeed animalFeed16 = new AnimalFeed("Purina", "Sensetive", 1000, "dog", "wet");      
        
        ArrayList<Product> list = new ArrayList<>();
        list.add(animalFeed1);
        list.add(animalFeed2);
        list.add(animalFeed3);
        list.add(animalFeed4);
        list.add(animalFeed5);
        list.add(animalFeed6);
        list.add(animalFeed7);
        list.add(animalFeed8);
        list.add(animalFeed9);
        list.add(animalFeed10);
        list.add(animalFeed11);
        list.add(animalFeed12);
        list.add(animalFeed13);
        list.add(animalFeed14);
        list.add(animalFeed15);
        list.add(animalFeed16);

        VendingMachine vendingMachine1 = new VendingMachine(list);
        AnimalFeed animalFeedRes1 = vendingMachine1.getAnimal("Purina", "dog");
        if (animalFeedRes1 != null) {
            System.out.println("Вы купили: ");
            System.out.println(animalFeedRes1.displayInfo());
        }else {
            System.out.println("Такой товар в автомате отсутствует!");
        }

        VendingMachine vendingMachine2 = new VendingMachine(list);
        AnimalFeed animalFeedRes2 = vendingMachine2.getTypFeed("Royal Canin", "wet");
        if (animalFeedRes2 != null) {
            System.out.println("Вы купили: ");
            System.out.println(animalFeedRes2.displayInfo());
        }else {
            System.out.println("Такой товар в автомате отсутствует!");
        }

    }
}
