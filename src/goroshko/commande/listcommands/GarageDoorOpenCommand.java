package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.GarageDoor;
import goroshko.commande.interfaces.ICommand;

public class GarageDoorOpenCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
