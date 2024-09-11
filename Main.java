// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de la clase Persona
        Persona persona1 = new Persona("Juan", 25, 70.5, 1.75);
        Persona persona2 = new Persona("Ana", 17, 60.0, 1.65);
        Persona persona3 = new Persona("Carlos", 30, 80.0, 1.80);
        Persona persona4 = new Persona("Maria", 20, 55.0, 1.60);
        Persona persona5 = new Persona("Luis", 15, 50.0, 1.55);

        // Imprimir la información de cada persona
        persona1.imprimirInformacion();
        persona2.imprimirInformacion();
        persona3.imprimirInformacion();
        persona4.imprimirInformacion();
        persona5.imprimirInformacion();
    }
}

