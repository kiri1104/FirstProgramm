package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.Light;
import goroshko.commande.interfaces.ICommand;


public class KitchenLightOnCommand implements ICommand {
    private Light light;
    public KitchenLightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
