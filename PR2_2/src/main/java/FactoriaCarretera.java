import java.util.ArrayList;

public class FactoriaCarretera extends FactoriaCarreraYBicicleta {

	public Bicicleta crearBicicleta(int numero) {
		Bicicleta bicicleta =  new BicicletaCarretera(numero);
                return bicicleta;
	}
        
        public Carrera crearCarrera(ArrayList<Bicicleta> bicicletas) {
		Carrera carrera= new CarreraCarretera(bicicletas);
                return carrera;
	}
}