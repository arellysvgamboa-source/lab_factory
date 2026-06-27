package Cliente;

import Factory.*;
import Modelos.Laptop;

public class Sistema_Cliente {

    public static void main(String[] args) {

        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

        Laptop gamer = LaptopFactory.crearLaptop("gamer");
        System.out.println("Corriendo programas en una Laptop para Gamer");
        gamer.ejecutarPrueba();
        mostrarInformacion(gamer);

        System.out.println();

        Laptop basica = LaptopFactory.crearLaptop("basica");
        System.out.println("Corriendo programas en una Laptop Basica");
        basica.ejecutarPrueba();
        mostrarInformacion(basica);

        System.out.println();

        Laptop profesional = LaptopFactory.crearLaptop("profesional");
        System.out.println("Corriendo programas en una Laptop Profesional");
        profesional.ejecutarPrueba();
        mostrarInformacion(profesional);

    }

    public static void mostrarInformacion(Laptop laptop) {

        System.out.println("Marca y Modelo: " + laptop.getMarcaModelo());
        System.out.println("Año de Fabricacion: " + laptop.getAnioFabricacion());
        System.out.println("Procesador: " + laptop.getTipoProcesador());
        System.out.println("Tamaño de la Pantalla: " + laptop.getTamanoPantalla());

    }

}