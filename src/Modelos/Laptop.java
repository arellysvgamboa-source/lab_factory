package Modelos;

public abstract class Laptop {

    protected String marcaModelo;
    protected int fabricacion;
    protected String tipoProcesador;
    protected int tamPantalla;

    public Laptop(String marcaModelo, int fabricacion,
                  String tipoProcesador, int tamPantalla){

        this.marcaModelo = marcaModelo;
        this.fabricacion = fabricacion;
        this.tipoProcesador = tipoProcesador;
        this.tamPantalla = tamPantalla;
    }

    public String getMarcaModelo(){
        return marcaModelo;
    }

    public int getAnioFabricacion(){
        return fabricacion;
    }

    public String getTipoProcesador(){
        return tipoProcesador;
    }

    public int getTamanoPantalla(){
        return tamPantalla;
    }
    public abstract void ejecutarPrueba();
}