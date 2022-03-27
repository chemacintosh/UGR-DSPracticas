import java.util.ArrayList;

public class FactoriaMontana extends FactoriaCarreraYBicicleta {

	public Bicicleta crearBicicleta(int numero) {
                Bicicleta bicicleta =  new BicicletaMontana(numero);
                return bicicleta;
	}

	public Carrera crearCarrera(ArrayList<Bicicleta> bicicletas) {
		Carrera carrera= new CarreraMontana(bicicletas);
                return carrera;
	}

}