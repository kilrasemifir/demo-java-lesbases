package fr.kira.formation.java;

public class Main {

    /**
     * Fonction qui affiche des mesages dans la console celon les regles suivantes:
     *  Pour chaque entier i allant de 1 a nombre:
     *      si i est multiple de fizz, alors affiche fizz
     *      si i est multiple de buzz, alors afiche buzz
     *      si i est multiple de fizz et de buzz affiche fizzBuzz
     *      sinon affiche i
     * @param fizz valeur de fizz
     * @param buzz valeur de buzz
     * @param nombre borne maximum pour l'iteration
     */
    public static void fizzBuzz(int fizz, int buzz, int nombre){
        for (int i = 1; i <= nombre; i++) {
            if(i % fizz == 0 && i % buzz == 0){
                System.out.println("fizzBuzz");
            }else if(i % fizz == 0){
                System.out.println("fizz");
            }else if(i % buzz == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz(int nombre){
        fizzBuzz(3, 5, nombre);
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature(273.15f);
        System.out.println("Kelvin: " + temperature.getKelvin());
        System.out.println("Celsius: " + temperature.getCelsius());
        System.out.println("Fahrenheit: " + temperature.getFahrenheit());
    }
}