package Modelos;

public class LaptopGamer extends Laptop {

    public LaptopGamer(String marcaModelo, int fabricacion,
                       String tipoProcesador, int tamPantalla){

        super(marcaModelo, fabricacion, tipoProcesador, tamPantalla);
    }

    @Override
    public void ejecutarPrueba(){
        System.out.println("Laptop para gamers");
    }

}
