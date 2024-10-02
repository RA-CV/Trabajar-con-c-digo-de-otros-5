import java.util.Scanner; // Agregado para importar la clase Scanner

public class Codigo5 {

    public static void main(String[] args) { // Agregado para incluir el método main
        Scanner s = new Scanner(System.in); // Corrección: se agregó 'System.in' como argumento
        System.out.print("Introduzca un número: "); // Corrección: cerré la comilla correctamente
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Corrección: se convierte el String a int

        int afo = 0;
        int noAfo = 0;

        while (c > 0) { // Corrección: cambié 'ni' por 'c' para usar el número original
            int digito = c % 10; // Cambié 'ni' por 'c'
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10; // Esta línea estaba mal indentada
        }

        if (afo > noAfo) {
            System.out.println("El " + ni + " es un número afortunado."); // Corrección: 'prinln' a 'println' y uso de 'ni'
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }

        s.close(); // Agregado: cerrar el Scanner
    }
}

