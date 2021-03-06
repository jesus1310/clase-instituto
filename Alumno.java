/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private static int numeroInicial = 1;
    private int numeroLista;
    private ArrayListInt notas;
    private static final int NOTA_APROBADO = 5;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numeroLista = numeroInicial;
        numeroInicial++;
        notas = new ArrayListInt();
    }

    /**
     * Método para añadir notas al alumno
     */
    public void addNota(int nota){
        notas.add(nota);
    }

    /**
     * Método para calcular la nota media
     */
    public float notaMedia(){
        int totalSuma = 0;
        for (int i = 0; i < notas.size(); i++){
            totalSuma += notas.get(i);
        }
        return (totalSuma/(float)notas.size());
    }

    /**
     * Método para mostrar si ha aprobado o no
     */
    public boolean aprobado(){
        return notaMedia() >= NOTA_APROBADO;
    }

    /**
     * Método que muestra los datos del alumno
     */
    public void muestraDatos(){
        System.out.println("Numero en lista: " + numeroLista + "\nNombre: " + nombre + "\nEdad: " + edad + "\nListado de notas: ");
        for(int i = 0; i < notas.size(); i++){
            System.out.println(notas.get(i));
        }
        System.out.println("Media: " + notaMedia() + "\n¿Aprobado? " + aprobado() + "\n");
    }
}
