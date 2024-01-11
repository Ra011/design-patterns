package strategy;

public abstract class Player {
    protected String title;
    defenceBehavior DefenceBehavior;
    offenceBehavior OffenceBehaviorBehavior;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    ///////////////////////////////////////////////////// here
    //// public play(boolean possession): String

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("swimming");
    }
}