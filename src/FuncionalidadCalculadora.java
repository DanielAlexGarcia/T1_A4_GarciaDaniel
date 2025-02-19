import java.util.ArrayList;

public class FuncionalidadCalculadora {
    double resultado = 0;
    ArrayList<Double> numeros = new ArrayList<Double>();
    ArrayList<String> operadores = new ArrayList<String>();


    public double suma(double N1, double N2){
        double r= N1 + N2;
        return r;
    }
    public double resta (double N1, double N2){
        return (N1 - N2);
    }
    public double multi (double N1, double N2){
        return (N1 * N2);
    }
    public double div (double N1, double N2){
        return (N1 / N2);
    }
    
    public double HacerOperacion (){
        int posNums = numeros.size()-1;
        int posOper = operadores.size()-1;


        for (int i = numeros.size()-1; i>=0; i--){
            double num = numeros.get(i);
            
            String oper = operadores.get(posOper);
            posOper--;
            if (oper.equalsIgnoreCase("+")){
                resultado = suma(resultado, num);
            }
            else if (oper.equalsIgnoreCase("-")){
                resultado = resta(resultado, num);
            }
            else if ( oper.equalsIgnoreCase("*")){
                resultado = multi(resultado, num);
            }
            else if(oper.equalsIgnoreCase("/")){
                resultado = div(resultado, num);
            }
            
        }

        return resultado;
    }
    public void leeroperaci(String operacion){
        String operacio = "";
        for (int i = operacion.length()-1; i >= 0; i--){
            char nn = operacion.charAt(i);
            String nm = String.valueOf(nn);
            try {
                if (nm.equalsIgnoreCase(".")){
                    operacio = operacio + nm;
                }
                double n = Double.parseDouble(nm);
                operacio = operacio + n;
            } catch (Exception e) {
                double num = Double.parseDouble(operacio);
                numeros.add(num);
                operadores.add(nm);
            }
        }
    }
}
