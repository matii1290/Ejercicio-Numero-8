public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Matias");
        persona.setEdad(26);
        persona.setTelefono(15405500);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;


    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setEdad(int edad) {
        this.Edad = edad;
    }
    public void setTelefono(int telefono) {
        this.Telefono = telefono;
    }

    public String getNombre() {
        return this.Nombre;
    }
    public int getEdad() {
        return this.Edad;
    }
    public int getTelefono() {
        return this.Telefono;
    }
}
