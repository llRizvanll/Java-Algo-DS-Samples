package designpatterns.behavioral.command;

public class SwitchTab<T extends Switch> implements ICommand{

    private T t;

    SwitchTab(T t){ this.t = t;}

    @Override
    public void execute() {
        if (t.isEnabled())
            t.onStop();
        else
            t.onStart();
    }
}
