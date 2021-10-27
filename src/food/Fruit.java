package food;

public class Fruit {

    private String type;
    private String color;
    private double weight;

    public Fruit(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public void ripe(){
        System.out.println("the fruit is ripe");
    };
}
