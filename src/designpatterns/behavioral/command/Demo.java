package designpatterns.behavioral.command;

public class Demo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        HomeAutomate homeAutomate = new HomeAutomate();

        homeAutomate.setiCommand(new SwitchTab<Fan>(fan));

        homeAutomate.buttonPressed();

    }
}
