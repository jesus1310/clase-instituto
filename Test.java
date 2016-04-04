import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private static final int MINIMO_EDAD = 18;
    private static final int MAXIMO_EDAD = 25;
    private static final int MINIMO_NOTA = 1;
    private static final int MAXIMO_NOTA = 10;
    private static final int NUM_NOTAS = 6;
    private static final int INDICE_ALUMNOS = 4;
    private Random rnd = new Random();
    private String[] listaNombres = {"Pepe","Paco","Luis","Alejandro","Guillermo"};
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    /**
     * Método para crear 5 alumnos y probar los métodos de la clase Alumno
     */
    public void test(){
        for (int i = 0; i <= INDICE_ALUMNOS; i++){
            Alumno alumno = new Alumno(listaNombres[rnd.nextInt(INDICE_ALUMNOS)],rnd.nextInt(MAXIMO_EDAD - MINIMO_EDAD) + MINIMO_EDAD);
            listaAlumnos.add(alumno);
            for (int cont = 1; cont < NUM_NOTAS; cont++){
                alumno.addNota(rnd.nextInt(MAXIMO_NOTA)+MINIMO_NOTA);
            }
            alumno.muestraDatos();
        }
    }
}
