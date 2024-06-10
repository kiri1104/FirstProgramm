package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.Light;
import goroshko.commande.interfaces.ICommand;

public class LivingRoomLightOffCommand implements ICommand {
    private Light light;
    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
