package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Bienvenido a la Cine Colombia");
        System.out.println("++++++++++++++++++++++++++++++++");

        System.out.println("++++++++  Menu  +++++++++++++++++");
        System.out.println("1- Agregar pelicula");
        System.out.println("2- Bucar todo");
        System.out.println("3- Buscar por nombre");
        System.out.println("4- Modiciar la clasificacion");
        System.out.println("5- Salir del Menu");

        int opcion = 0;
        ArrayList<HashMap<String,Object>> peliculas = new ArrayList<>();

        Scanner lea = new Scanner(System.in);

        do{
            System.out.print("Digite una opcion: ");
            opcion = lea.nextInt();
            lea.nextLine();
            HashMap<String,Object> pelicula = new HashMap<>();

            if(opcion == 1){
                System.out.print("Digite nombre de la pelicula: ");
                String nombrePelicula = lea.nextLine();

                System.out.print("Digite la duracion de la pelicula (H:min:seg): ");
                String duracionPelicula = lea.nextLine();

                System.out.print("Digite la clasificacion de la pelicula: ");
                String clasificacionPelicula = lea.nextLine();

                System.out.print("Digite la sinopsis de la pelicula: ");
                String sinopsisPelicula = lea.nextLine();

                System.out.print("Digita el año extreno de la pelicula: ");
                int anio = lea.nextInt();

                System.out.print("Digita el mes extreno de la pelicula: ");
                int mes = lea.nextInt();

                System.out.print("Digita el dia extreno de la pelicula: ");
                int dia = lea.nextInt();

                LocalDate fechaExtreno = LocalDate.of(anio,mes,dia);

                int idPelicula = new Random().nextInt(100);

                pelicula.put("id",idPelicula);
                pelicula.put("nombre",nombrePelicula);
                pelicula.put("duracion",duracionPelicula);
                pelicula.put("clasificacion",clasificacionPelicula);
                pelicula.put("sinopsis",sinopsisPelicula);
                pelicula.put("fecha extreno",fechaExtreno);

                peliculas.add(pelicula);


            }else if(opcion == 2){
                System.out.println("Listado de peliculas");
                System.out.println("++++++++++++++++++++++");
                for(HashMap<String,Object>peliculaAuxiliar:peliculas){
                    System.out.println(peliculaAuxiliar);
                };

            }else if(opcion == 3){
                System.out.println("Digite el nombre de la Pelicula que vas a buscar");
                String peliculaBuscar = lea.nextLine();

                for(HashMap<String,Object>peliculaAxiliar:peliculas){
                    if(peliculaBuscar.equals(peliculaAxiliar.get("nombre"))){
                        System.out.println("Datos de la pelicula buscada");
                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.println(peliculaAxiliar);
                    };

                };

            }else  if(opcion == 4){

                System.out.println("Digite el nombre de la Pelicula que vas a buscar");
                String peliculaBuscar = lea.nextLine();

                for(HashMap<String,Object>peliculaAxiliar:peliculas){
                    if(peliculaBuscar.equals(peliculaAxiliar.get("nombre"))){
                        System.out.println("Datos de la pelicula buscada");
                        System.out.println("+++++++++++++++++++++++++++++");

                        System.out.print("Modificar clasificaion: ");
                        String modificacion = lea.nextLine();
                        peliculaAxiliar.put("clasificacion",modificacion);

                        System.out.println(" ++++ Modoficion con exito +++++++");
                        System.out.println(peliculaAxiliar);
                    };

                };

            }else if(opcion == 5){

            }else {
                System.out.println("Opcion no valida");
            }
        }while (opcion!=5);
    }
}