import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{

    // Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // Declaración de un arreglo de tipo TDA
    public static Alumno[] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;

        System.out.println("Solicitud de información de cada estudiante");
        for ( int i = 0; i < alumnos.length; i++){
            System.out.println("-------------------------------");
            System.out.println("Escribe la matrícula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            // Creación de un objeto Alumno (POJO)
            Alumno a = new Alumno(matricula, nombre);
            // Leyendo calificaciones
            System.out.println("Escribe calificación de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de inglés: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de iot: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setPromedio();
            // Agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void imprimirAlumnos(){
        System.out.println("Contenido del arreglo alumnos: ");
        for (Alumno a : alumnos ){
            System.out.println("-----------------------------------");
            System.out.println("Información del alumno: ");
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) throws IOException{
        int n; // tamaño del grupo
        double promedio; // el promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("---------------------------------------------");
        // Recuperando el tamaño del grupo
        System.out.println("Escribe el número de alumnos en el grupo: ");
        entrada = bufer.readLine(); // lectura del teclado
        n = Integer.parseInt(entrada); // Conversión de String a int

        // Construir el arreglo alumnos
        alumnos = new Alumno[n];
        // Introducir información de los alumnos
        leerAlumnos();
        // Mostrar la información
        imprimirAlumnos();


        // Obtener el promedio
       // promedio = suma / n;

        // System.out.println("-----------------------------------------");
        // System.out.println("Las calificaciones de cada alumno son: ");
        // for ( double calif : calificaciones){
        //     System.out.println(calif);
        // }
        // System.out.println("-----------------------------------------");
        // System.out.println("El promedio de grupo es: " + promedio);

    }
}