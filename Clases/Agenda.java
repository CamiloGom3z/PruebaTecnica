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

    public Contacto buscarPornombre (String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public void borrarContacto (String nombre){
        Contacto contacto = buscarPornombre(nombre);
        contactos.remove(contacto);
        System.out.println("contacto :" + contacto + "ha sido eliminado");
    }


    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
