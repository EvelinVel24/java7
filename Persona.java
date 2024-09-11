// Persona.java
public class Persona {
    private String nombre;
    private int edad;
    private double peso;   // En kilogramos
    private double altura; // En metros

    // Constructor
    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / (altura * altura); // Fórmula del IMC
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método para determinar la categoría del IMC
    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "sobrepeso";
        } else {
            return "obesidad";
        }
    }

    // Método para imprimir los detalles de la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Calculando IMC...");
        double imc = calcularIMC();
        System.out.println("Su índice de masa muscular es: " + String.format("%.2f", imc));
        System.out.println("Usted se encuentra con " + clasificarIMC(imc) + ".");
        System.out.println("Su edad es: " + edad);
        if (esMayorDeEdad()) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }
        System.out.println("--------------------------");
    }
}
