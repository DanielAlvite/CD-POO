package com.campusdual;

public class Exercise3 {
        public static int suma(int num1, int num2) {
            int resultado = num1 + num2;
            return resultado;
        }

        //ejemplo de metodo / función
        public static void main(String[] args) {
            int numero1 = 5;
            int numero2 = 7;

            int resultadoSuma = suma(numero1, numero2);

            System.out.println("La suma es: " + resultadoSuma);
        }

        //ejemplo de procedimiento

        public static void imprimirMensaje() {
        System.out.println("Este es un mensaje desde el procedimiento.");
    }

    public static void imprime(){
        imprimirMensaje();
    }

}
