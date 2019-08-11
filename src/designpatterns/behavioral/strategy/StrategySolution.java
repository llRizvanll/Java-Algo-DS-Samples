package designpatterns.behavioral.strategy;

public class StrategySolution {

    public static void main(String[] args) {
        StrategyMediaContext strategyMediaContext = new StrategyMediaContext();
        GStrategy gStrategy = new GStrategy();
        gStrategy.connectTo("Google Strategy");
        strategyMediaContext.setStrategyMediaContext(gStrategy);
    }
}
