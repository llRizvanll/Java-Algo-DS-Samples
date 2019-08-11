package designpatterns.behavioral.command;

public class Fan extends Switch {

    private Boolean enableItem = false;

    @Override
    void onStop() {
        System.out.println(" Fan is off!");
        this.enableItem = true;
    }

    @Override
    void onStart() {
        System.out.println(" Fan is on!");
        this.enableItem = false;
    }

    @Override
    Boolean isEnabled() {
        return enableItem ? enableItem : false;
    }
}
