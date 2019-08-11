package designpatterns.behavioral.command;

public class HomeAutomate {

    ICommand iCommand;

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void buttonPressed(){
        this.iCommand.execute();
    }
}
