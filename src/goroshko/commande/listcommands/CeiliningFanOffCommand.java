package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.CeilingFan;
import goroshko.commande.interfaces.ICommand;

public class CeiliningFanOffCommand implements ICommand
{
    private CeilingFan ceilingFan;

    public CeiliningFanOffCommand(CeilingFan
                                          ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
