package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.GarageDoor;
import goroshko.commande.interfaces.ICommand;

public class GarageDoorCloseCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.donw();
    }
}
