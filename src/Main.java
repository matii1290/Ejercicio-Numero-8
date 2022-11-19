public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setNombre("Matias");
    persona.setEdad(26);
    persona.setTelefono(15405500);

    System.out.println(persona.nombre);
    System.out.println(persona.edad);
    System.out.println(persona.telefono);
    }
}

class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;


    String nombre = Nombre;
    Integer edad = Edad;
    Integer telefono = Telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.Nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
