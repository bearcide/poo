package fi.poo;

/**
 *
 * Simula a una persona
 */
public class Persona {
    private String nombre, direccion, sexo;
    private int edad;
    private float altura;
  
    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }
    /**
     * Constructor crea a la persona
     * @param nombre El nombre de la persona es un String
     * @param sexo El sexo de la persona es un String
     * @param direccion La dirreccion de la persona es un String
     * @param edad La edad de la persona es primitivo entero
     * @param altura La altura de la persona es primitivo entero
     */
    public Persona(String nombre, String direccion, String sexo, int edad, float altura) {    
        this.nombre = nombre;
        this.direccion = direccion;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }


    /**
     * @return regesa el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre Modifica el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return  regresa el valor de sexo
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * 
     * @param modifica el valor del sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
     * @return regesa la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion Cambia el valor de direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     /**
     * @return regesa la direccion
     */
    public int getEdad() {
        return edad;
    }
    /**
     * @param edad Cambia el valor de edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return regresa la altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * 
     * @param altura  Modifica la altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Metodo donde la persona dice algo
     * @param var lo que dice
     */
    public void hablar(String var) {
        System.out.println(var);
    }
    /**
     * Indica la distancia en la que una persona corre
     * @param distancia la distancia que corre
     */
    public void corre(int distancia){
        System.out.println("Corri "+ distancia+" metros");
    }
    /**
     * Indica las tareas que hace una persona
     * @param labor el tipo de labor que hace
     */
    public void hacerTareas(String labor){
        System.out.println("Hice tareas de "+ labor);
    }
    /**
     * Indica que esta jugando
     */
    public void jugar(){
       System.out.println("Estoy jugando");
    }
    /**
     * Indica que esta comiendo la persona
     * @param comida el tipo de comida que come
     */
    public void comer(String comida){
       System.out.println("Estoy comiendo "+ comida);
    }
    /**
     * Metodo sobre escribe toString 
     * @return regresa una cadena con los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
    
    
}
