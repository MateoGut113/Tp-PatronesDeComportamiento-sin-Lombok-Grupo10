package Command;

public class Invoker {
    private Command currentCommand;

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void ejecutarComando() {
        if (currentCommand != null) {
            currentCommand.execute();
        }
    }
}