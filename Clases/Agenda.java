package PruebaTecnica.Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    List<Contacto> contactos = new ArrayList<>();

    public void guardarContacto( Contacto contacto){
        contactos.add(contacto);
    }
    public void verContactos (){
        for (Contacto contacto: contactos) {
            System.out.println(contacto.toString());
        }
    }

    public void borrarContacto (Contacto contacto){
        contactos.remove(contacto);
    }


}
