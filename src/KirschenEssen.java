import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class KirschenEssen extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Cherries");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("KirschenEssen");
    }
}