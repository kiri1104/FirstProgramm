package goroshko.commande.listcommands;

import goroshko.commande.baseclasses.Stereo;
import goroshko.commande.interfaces.ICommand;

public class StereoOffCommand implements ICommand {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
