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
    public String displayInfo() {
        // переопределяем (перегрузка) метод из родительского класса
        return String.format("Корм для животных\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tДля животного: %s\n\tВид корма: %s\n\t]", brand, name, price, animal, typeFeed);
    }

}
