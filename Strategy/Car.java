public class Car {
    MoveBehavior behavior;
    public void setBehavior(MoveBehavior behavior){
        this.behavior = behavior;
    }
    public void move(){
        behavior.move();
    }
}
