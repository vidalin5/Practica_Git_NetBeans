package clases;

/**
 *
 * @author Vidal <vidalfm94@gmail.com>
 */
public class Persona {

    //Atributos de la clase persona
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int telefono;
    private int edad;
    private float estatura;
    private static int cuentaObjetos = 0;

    /**
     * Constructor con los parámetros obligatorios
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param direccion
     */
    public Persona(String nombre, String apellidos, String dni, String direccion) {

        //Asigamos a los atributos del objeto los parámetros que hemos pasado
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;

        cuentaObjetos++;
    }

    public Persona(String nombre, String apellidos, String dni, String direccion, int telefono, int edad, float estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.estatura = estatura;
        
        cuentaObjetos++;
    }

    /**
     * Get que nos devuelve el nombre de la persona
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Get que nos devuelve los apellidos de la persona
     *
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Get que nos devuelve el dni de la persona
     *
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Get que nos devuelve la dirección de la persona
     *
     * @return dirección
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Get que nos devuelve el teléfono de la persona
     *
     * @return teléfono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Get que nos devuelve la edad de la persona
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Get que nos devuelve la estatura de la persona
     *
     * @return estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * Get que nos devuelve el número de objetos creados de la clase persona
     *
     * @return número de objetos
     */
    public int getCuentaObjetos() {
        return cuentaObjetos;
    }

    /**
     * Método que da valor al atributo nombre
     *
     * @param nombre nuevo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que da valor al atributo apellidos
     *
     * @param apellidos nuevos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método que da valor al atributo dni
     *
     * @param dni nuevo
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método que da valor al atributo direccion
     *
     * @param direccion nueva
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que da valor al atributo telefono
     *
     * @param telefono nuevo
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que da valor al atributo edad
     *
     * @param edad nueva
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que da valor al atributo estatura
     *
     * @param estatura nueva
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public char obtenerLetraDni(String dni) {

        int DNI = Integer.parseInt(dni);
        char array[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return array[DNI % 23];
    }
    
    public String obtenerNif(String dni) {
        
        char letra;
        
        letra = obtenerLetraDni(dni);
        
        StringBuilder nif = new StringBuilder();
        
        nif.append(dni);
        nif.append(letra);
        
        return nif.toString();
    }
    
    public int estaturaCentimetros(float estatura) {
        
        double estaturacm;
        
        estaturacm = estatura * 100;
        
        return (int)estaturacm;
    }

}
