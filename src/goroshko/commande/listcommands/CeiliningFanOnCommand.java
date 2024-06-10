package  goroshko.commande.listcommands;

import goroshko.commande.baseclasses.CeilingFan;
import goroshko.commande.interfaces.ICommand;

public class CeiliningFanOnCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeiliningFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
