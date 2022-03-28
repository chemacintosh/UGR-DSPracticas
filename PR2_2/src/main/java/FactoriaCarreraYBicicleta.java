import java.util.ArrayList;

public abstract class FactoriaCarreraYBicicleta {

	abstract public Bicicleta crearBicicleta(int numero);

	abstract public Carrera crearCarrera(ArrayList<Bicicleta> bicicletas);

}