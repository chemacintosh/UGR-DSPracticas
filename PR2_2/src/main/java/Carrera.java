import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Carrera {

    protected ArrayList<Bicicleta> bicicletas;

    Carrera(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public void comenzar(int cicloRetirada, String tipoCarrera) {

        System.out.println("\n Damos comienzo a la carrera por " + tipoCarrera + " con " + bicicletas.size() + " cicilistas apuntados! \n");

        int lesionados = Math.round((bicicletas.size() * 20) / 100);

        for (int i = 0; i < bicicletas.size(); i++) {
            bicicletas.get(i).start();
        }

        boolean carreraEnProceso = true;
        int contadorSegundosTranscurridos = 0;

        while (carreraEnProceso) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.print(ex.getMessage());;
            }
            contadorSegundosTranscurridos++;

            if(contadorSegundosTranscurridos % 10 == 0){
                System.out.println("Carrera de " + tipoCarrera + " --> Trascurrido segundo " + contadorSegundosTranscurridos);
            }
            if (contadorSegundosTranscurridos == cicloRetirada) {
                System.out.print("\n");
                for (int i = 0; i < lesionados; i++) {
                    Random r = new Random();
                    int numeroEliminado = r.nextInt(bicicletas.size());
                    System.out.println("Carrera de " + tipoCarrera + " --> Retirada por lesión bicicleta número " + bicicletas.get(i).getNumero());
                    bicicletas.remove(numeroEliminado);
                }
                System.out.print("\n");
            }

            if (contadorSegundosTranscurridos == 60) {
                carreraEnProceso = false;

                Ganador();

                System.out.println("\n Y con esto damos por finalizada la carrera por " + tipoCarrera + "! \n");

                for (int i = 0; i < bicicletas.size(); i++) {
                    bicicletas.get(i).stop();
                }
            }
        }
    }

    protected void Ganador() {
        int distanciaRecorridaPorElGanador = 0;
        int IDGanador = 0;

        for (int i = 0; i < bicicletas.size(); i++) {
            if(bicicletas.get(i).getDistancia() > distanciaRecorridaPorElGanador)
                IDGanador = bicicletas.get(i).getNumero();
        }

        System.out.println("\n La victoria se la lleva la bicicleta número: " + IDGanador + "\n");


    }
}
