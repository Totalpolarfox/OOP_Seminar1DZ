public class AnimalFeed extends Product {

    private String animal;
    private String typeFeed;
    
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
    public String getTypeFeed() {
        return typeFeed;
    }
    public void setTypeFeed(String typeFeed) {
        this.typeFeed = typeFeed;
    }

    public AnimalFeed(String brand, String name, double price, String animal, String typeFeed){
        super(brand, name, price); // вызов конструктора из родительского класса
        this.animal = animal; 
        this.typeFeed = typeFeed;  
    }


}
