package PruebaTecnica;

import PruebaTecnica.Clases.Agenda;
import PruebaTecnica.Clases.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija 1: Crear Contacto 2:Actulizarlo 3: Eliminarlo");
        Integer respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
                 Scanner sc = new Scanner(System.in);
                 Contacto contacto = new Contacto();
                System.out.println("Escriba el nombre");
                String nombre = sc.nextLine();
                contacto.setNombre(nombre);

                System.out.println("Escriba el telefono");
                Integer telefono = sc.nextInt();
                contacto.setTelefono(telefono);

                System.out.println("Escriba la ciudad");
                String ciudad = sc.nextLine();
                contacto.setCiudad(ciudad);

                agenda.guardarContacto(contacto);

                agenda.verContactos();

                break;

            case 2:

                    break;
            case 3:


                agenda.borrarContacto(agenda.borrarContacto(contacto));
                break;


        }





    }
}
