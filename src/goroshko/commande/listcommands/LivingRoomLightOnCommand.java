package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.Light;
import goroshko.commande.interfaces.ICommand;


public class LivingRoomLightOnCommand implements ICommand {
    private Light light;
    public LivingRoomLightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
