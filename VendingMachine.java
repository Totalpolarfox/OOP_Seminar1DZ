import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public AnimalFeed getAnimal(String brand, String animal) {
        for (Product product : products) {
            if (product instanceof AnimalFeed) {
                AnimalFeed animalFeed = (AnimalFeed)product;
                if (animalFeed.getBrand().equals(brand) && animalFeed.getAnimal().equals(animal)) {
                    return animalFeed;
                }
            }
        }
        return null;
    }

}
