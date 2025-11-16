public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBehavior(new Drive());
        car.move();
        car.setBehavior(new Walk());
        car.move();
        car.setBehavior(new Swim());
        car.move();
    }
}
