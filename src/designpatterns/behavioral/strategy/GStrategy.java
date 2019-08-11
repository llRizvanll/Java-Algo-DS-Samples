package designpatterns.behavioral.strategy;

public class GStrategy implements IStrategy {

    @Override
    public void connectTo(String name) {
        System.out.println("Google Strategy");
    }
}
