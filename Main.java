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
                Contacto contacto = new Contacto();
                System.out.println("Escriba el nombre");
                String nombre = scanner.nextLine();
                contacto.setNombre(nombre);

                System.out.println("Escriba el telefono");
                Integer telefono = scanner.nextInt();
                contacto.setTelefono(telefono);
                scanner.nextLine();

                System.out.println("Escriba la ciudad");
                String ciudad = scanner.nextLine();
                contacto.setCiudad(ciudad);

                agenda.guardarContacto(contacto);

                agenda.verContactos();

                break;

            case 2:

                System.out.println("escriba el nombre para actualizar el contacto");
                String nombreActulizar = scanner.nextLine();



                break;
            case 3:
                System.out.println("escriba el nombre del contacto para eliminar");
                String nombreborrar = scanner.nextLine();
                agenda.borrarContacto(nombreborrar);

                break;


        }





    }
}
