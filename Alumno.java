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
    private int numeroInicial = 1;
    private int numeroLista;
    private ArrayListInt notas;
    
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
}
