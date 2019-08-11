package designpatterns.behavioral.strategy;

/**
 *
 * Strategy pattern involves removing an algorithm from its host class and putting it in separate class so
 * that in the same programming context there might be different algorithms (i.e. strategies), which can be selected in runtime.
 *
 * Strategy pattern enables a client code to choose from a family of related but different algorithms and
 * gives it a simple way to choose any of the algorithm in runtime depending on the client context.
 *
 *
 */
public class StrategySolution {

    public static void main(String[] args) {
        StrategyMediaContext strategyMediaContext = new StrategyMediaContext();
        strategyMediaContext.setStrategyMediaContext(new GStrategy());
        strategyMediaContext.connectTo("Google Strategy");

        // setting up facebook strategy
        strategyMediaContext.setStrategyMediaContext(new FStrategy());
        strategyMediaContext.connectTo("Facebook Strategy");

    }
}
