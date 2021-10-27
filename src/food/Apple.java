package food;

public class Apple extends Fruit {

    private String nickname;

    public Apple(String type, String color, double weight, String nickname) {
        super(type, color, weight);
        this.nickname = nickname;
    }

    @Override
    public void ripe() {
        System.out.println("the apple is ripe");
    }
}
