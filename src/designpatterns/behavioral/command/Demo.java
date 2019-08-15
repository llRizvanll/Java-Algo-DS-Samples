package designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        HomeAutomate homeAutomate = new HomeAutomate();

        SwitchTab<Fan> fanSwitchTab = new SwitchTab<>(fan);

        List<Integer> list = new ArrayList<>();
        homeAutomate.setiCommand(new SwitchTab<>(fan));

        homeAutomate.buttonPressed();

        Light light = new Light();

        homeAutomate.setiCommand(new SwitchTab<>(light));

        homeAutomate.buttonPressed();
    }
}
