import java.util.ArrayList;
import java.util.Random;

public class Cliente {

    public static void main(String[] args) {
        Random rand = new Random();

        int numeroBicicletas = rand.nextInt(50) + 5;

        FactoriaCarreraYBicicleta factoriaMontana = new FactoriaMontana();
        FactoriaCarreraYBicicleta factoriaCarretera = new FactoriaCarretera();

        ArrayList<Bicicleta> bicicletasMontana = new ArrayList<Bicicleta>();
        ArrayList<Bicicleta> bicicletasCarretera = new ArrayList<Bicicleta>();

        for (int i = 0; i < numeroBicicletas; i++) {
            bicicletasMontana.add(factoriaMontana.crearBicicleta(i));
            bicicletasCarretera.add(factoriaCarretera.crearBicicleta(i));
        }

        Carrera carreraMontana = factoriaMontana.crearCarrera(bicicletasMontana);
        Carrera carreraCarretera = factoriaCarretera.crearCarrera(bicicletasCarretera);

        carreraCarretera.comenzar(16, "carrera");

        carreraMontana.comenzar(16, "montaña");
    }

}