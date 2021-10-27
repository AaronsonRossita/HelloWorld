package food;

public class Orange extends Fruit {

    private int vitaminC;

    public Orange(String type, String color, double weight, int vitaminC) {
        super(type, color, weight);
        this.vitaminC = vitaminC;
    }

    @Override
    public void ripe() {
        System.out.println("the orange is ripe");
    }
}
