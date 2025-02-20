import java.util.ArrayList;

public class FuncionalidadCalculadora {
    double resultado = 0;
    boolean cambioSimbolo = false;
    ArrayList<Double> numeros = new ArrayList<>();
    ArrayList<String> operadores = new ArrayList<>();

    public double suma(double N1, double N2) {
        return N1 + N2;
    }

    public double resta(double N1, double N2) {
        return N1 - N2;
    }

    public double multi(double N1, double N2) {
        return N1 * N2;
    }

    public double div(double N1, double N2) {
        if (N2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return N1 / N2;
    }
    

    public double HacerOperacion() {
        // Reiniciar el resultado antes de comenzar la operación
        resultado = numeros.get(0); // Inicializa el resultado con el primer número

        // Realizar las operaciones en el orden correcto
        for (int i = 1; i < numeros.size(); i++) {
            String oper = operadores.get(i - 1);
            double num = numeros.get(i);
            switch (oper) {
                case "+":
                    resultado = suma(resultado, num);
                    break;
                case "-":
                    resultado = resta(resultado, num);
                    break;
                case "*":
                    resultado = multi(resultado, num);
                    break;
                case "/":
                    resultado = div(resultado, num);
                    break;
                default:
                    throw new IllegalArgumentException("Operador no válido: " + oper);
            }
        }
        if (cambioSimbolo){
            resultado = resultado * -1;
        }
        return resultado;
    }

    public void leeroperaci(String operacion) {
        // Limpiar las listas antes de procesar una nueva operación
        numeros.clear();
        operadores.clear();

        String operacio = "";
        for (int i = 0; i < operacion.length(); i++) {
            char nn = operacion.charAt(i);
            String nm = String.valueOf(nn);

            // Si es un dígito, un punto decimal o un signo negativo al inicio
            if (nm.matches("[0-9]") || nm.equals(".") || (nm.equals("-") && (i == 0 || operadores.size() > 0))) {
                operacio = operacio + nm;
            }
            // Si es un operador
            else {
                // Si hay un número en construcción, convertirlo a double y agregarlo a la lista
                if (!operacio.isEmpty()) {
                    try {
                        double num = Double.parseDouble(operacio);
                        numeros.add(num);
                        operacio = ""; // Reiniciar la cadena para el próximo número
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Número no válido: " + operacio);
                    }
                }
                // Agregar el operador a la lista
                operadores.add(nm);
            }
        }

        // Agregar el último número si la cadena no está vacía
        if (!operacio.isEmpty()) {
            try {
                double num = Double.parseDouble(operacio);
                numeros.add(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Número no válido: " + operacio);
            }
        }
    }
}