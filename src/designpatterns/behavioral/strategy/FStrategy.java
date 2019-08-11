package designpatterns.behavioral.strategy;

public class FStrategy implements IStrategy {

    @Override
    public void connectTo(String name) {
        System.out.println("Facebook Strategy");
    }
}
