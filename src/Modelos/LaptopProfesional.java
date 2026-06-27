package Modelos;

public class LaptopProfesional extends Laptop {

    public LaptopProfesional(String marcaModelo, int fabricacion,
                             String tipoProcesador, int tamPantalla){

        super(marcaModelo, fabricacion, tipoProcesador, tamPantalla);
    }

    @Override
    public void ejecutarPrueba(){
        System.out.println("Laptop para profesional");
    }

}