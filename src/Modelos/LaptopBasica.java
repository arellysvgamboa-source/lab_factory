package Modelos;

public class LaptopBasica extends Laptop {

    public LaptopBasica(String marcaModelo, int fabricacion,
                        String tipoProcesador, int tamPantalla){

        super(marcaModelo, fabricacion, tipoProcesador, tamPantalla);
    }

    @Override
    public void ejecutarPrueba(){
        System.out.println("Laptop basica");
    }

}