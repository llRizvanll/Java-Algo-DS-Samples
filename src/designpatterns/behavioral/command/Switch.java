package designpatterns.behavioral.command;

public abstract class Switch {

    abstract void onStart();
    abstract void onStop();

    abstract Boolean isEnabled();
}
