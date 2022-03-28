public abstract class Bicicleta extends Thread {

	protected int id;
    protected int distancia;
        
    Bicicleta(int id){
        this.id=id;
        distancia=0;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public int getNumero() {
        return id;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                long espera=Math.round(Math.random()*1000);
                Thread.sleep(espera);
                distancia++;
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}