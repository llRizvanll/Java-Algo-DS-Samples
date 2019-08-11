package designpatterns.behavioral.command;

public class Light extends Switch{

    private Boolean enableItem = false;

    @Override
    void onStop() {
        System.out.println(" Light is off!");
        this.enableItem = true;
    }

    @Override
    void onStart() {
        System.out.println(" Light is on!");
        this.enableItem = false;
    }

    @Override
    Boolean isEnabled() {
        return enableItem ? enableItem : false;
    }
}
