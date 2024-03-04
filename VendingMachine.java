import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public AnimalFeed getProduct(String brand, String animal, String typeFeed) {
        for (Product product : products) {
            if (product instanceof AnimalFeed) {
                AnimalFeed animalFeed = (AnimalFeed)product;
                if (animalFeed.getBrand().equals(brand) && animalFeed.getAnimal().equals(animal) && animalFeed.getTypeFeed().equals(typeFeed)) {
                    return animalFeed;
                }
            }
        }
        return null;
    }

}
