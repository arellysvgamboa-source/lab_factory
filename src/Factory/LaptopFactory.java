package Factory;

import Modelos.*;

public class LaptopFactory {

    public static Laptop crearLaptop(String tipo){

        if(tipo.equalsIgnoreCase("basica")){
            return new LaptopBasica("Dell Latitude",2020,"Intel core i7",14);
        }

        if(tipo.equalsIgnoreCase("gamer")){
            return new LaptopGamer("Macbook air",2017,"Silicon M1",13);
        }

        if(tipo.equalsIgnoreCase("profesional")){
            return new LaptopProfesional("Macbook Pro",2022,"Apple Silicon M2",16);
        }

        return null;
    }

}