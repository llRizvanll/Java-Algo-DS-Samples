package designpatterns.behavioral.strategy;

public class StrategyMediaContext {

    IStrategy iStrategy;
    public void setStrategyMediaContext(IStrategy strategy) {
        this.iStrategy = strategy;
    }

    public void connectTo(String name){
        this.iStrategy.connectTo(name);
    }
}
