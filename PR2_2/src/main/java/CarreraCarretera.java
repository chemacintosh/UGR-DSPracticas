import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarreraCarretera extends Carrera {

    CarreraCarretera(ArrayList<Bicicleta> bicicletas) {
        super(bicicletas);
    }

    public void comenzar(int cicloRetirada, String tipoCarrera){
        super.comenzar(cicloRetirada, "carretera");
    }

}