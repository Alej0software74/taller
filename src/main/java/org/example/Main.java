package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se debe poder agregar
        //Se debe poder buscar todas
        // Se debe poder buscar por nombre
        //Modificar

        Scanner leerTeclado=new Scanner(System.in);

        //Menu de las opciones a tener
        System.out.println("Bienvenidos todos a:");
        System.out.println("El pequeño teatro");
        System.out.println("*{{*****--¿00(0)00?--*****}}*");
        System.out.println("1. Agregar:");
        System.out.println("2. Buscar todas:");
        System.out.println("3. Buscar por nombre:");
        System.out.println("4. Modificar:");
        System.out.println("0. Salir");
        System.out.println("*{{*****--¿00(0)00?--*****}}*");

        //Creando un menu de opciones en java
        int opcionElegida;
        ArrayList<HashMap<String, Object>> Obras=new ArrayList<>();

        do {
            HashMap<String, Object> obra=new HashMap<>();

            System.out.println("Digite una opcione:");

            opcionElegida=leerTeclado.nextInt();
            //separador
            leerTeclado.nextLine();
            if (opcionElegida==1){

                System.out.print("Nombre de la obra:");
                String nombreObra=leerTeclado.nextLine();
                System.out.println("Director:");
                String director=leerTeclado.nextLine();
                System.out.println("Genero de la obra:");
                String generoObra=leerTeclado.nextLine();
                int idObra=new Random().nextInt(100);
                System.out.println("El id de la Obra es:"+ idObra);
                System.out.println("Ingresa el precio de la Obra:");
                int costo=leerTeclado.nextInt();
                System.out.println("Digite el año del estreno:");
                int Anio=leerTeclado.nextInt();
                System.out.println("Digite el mes:");
                int Mes=leerTeclado.nextInt();
                System.out.println("Digite el dia");
                int Dia=leerTeclado.nextInt();

                LocalDate fecha=LocalDate.of(Anio,Mes,Dia);

                //armar el objeto de datos
                obra.put("nombre",nombreObra);
                obra.put("director",director);
                obra.put("genero",generoObra);
                obra.put("costo",costo);
                obra.put("id",idObra);
                obra.put("fecha",fecha);

                //llevar el objeto al arreglo
                Obras.add(obra);

            } else if (opcionElegida==2) {
                System.out.println("Mostrar el inventario de Obras");

                for (HashMap<String,Object>ObraAuxiliar:Obras){
                    System.out.println(ObraAuxiliar);

                }

            } else if (opcionElegida==3) {
                System.out.println("Buscando Obra:");
                System.out.println("Digita el nombre de la Obra quieres ver:");
                String NombreObraAbuscar=leerTeclado.nextLine();

                //Separador
                for (HashMap<String,Object>ObraAuxiliar:Obras){
                    System.out.println(ObraAuxiliar.get("Nombre"));
                    //Sepador
                    if (NombreObraAbuscar.equals(ObraAuxiliar.get("Nombre")));
                    System.out.println("Obra a encontrar:");
                    System.out.println(ObraAuxiliar);
                    //Separador
                }

            } else if (opcionElegida==4) {
                System.out.println("Modificar Obra:");

            } else if (opcionElegida==0) {
                System.out.println("Saliendo");

            }
            else {
                System.out.println("Opcion invalida");
            }

        }while (opcionElegida!=0);
    }
}