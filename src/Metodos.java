import libreria.EntradaSalida;

public class Metodos {
    /**
     * Creo un atributo privado static final de Suma = "+".
     */
    private static final String Suma = "+";
    /**
     * Creo un atributo privado static final de Resta = "-".
     */
    private static final String Resta = "-";
    /**
     * Creo un atributo privado static final de Multiplicacion = "*".
     */
    private static final String Multiplicacion = "*";
    /**
     * Creo un atributo privado static final de Divison  = "/".
     */
    private static final String Division = "/";
    /**
     * Creo un atributo privado static  de total en donde guardar los resultados .
     */
    private static Float total = null;

    /**
     * Creo un método privado de operacionesBasicas que recibe tres parametros, float numero1, float numero2, String operacion
     *
     * @param operacion tendra varias opciones, sumar,restar,multiplicar o dividir.
     * En  la division realizon un throw  Exception para capturar el error de la division entre 0.
     * @return un total.
     */

    private static float operacionesBasicas(float numero1, float numero2, String operacion) throws Exception {

        switch (operacion) {
            case Suma:
                total = numero1 + numero2;
                break;

            case Resta:
                total = numero1 - numero2;
                break;

            case Multiplicacion:
                total = numero1 * numero2;
                break;

            case Division:
                if (numero2 == 0) {
                    throw new Exception("No se puede dividir entre 0");
                }
                total = numero1 / numero2;
                break;

        }
        return total;
    }

    /**
     * En el metodo realizarOperacion  no recibe nada y no devuelve nada.
     * Istacion el objeto Métodos, solicito que introduzca qué operación quiere realizar.
     * Luego pido a y b, realizó un try catch para tener el control de la división.
     */

    public void realizarOperacionBasicas() {
        Metodos obx = new Metodos();

        String operacionab = EntradaSalida.entradaString("Que operacion quieres hacer " + "( \"+\" = Suma , \"-\" = Resta , \"*\" " + "= Multiplicacion , \"/\" = Division");

        float a = EntradaSalida.recibefloat("Introduce un numero");
        float b = EntradaSalida.recibefloat("Introduce un numero");

        try {
            float resultado = obx.operacionesBasicas(a, b, operacionab);
            EntradaSalida.salida("El resulta es " + resultado, EntradaSalida.SALIDA_CONSOLA);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}









