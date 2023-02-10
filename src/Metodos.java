import libreria.EntradaSalida;

public class Metodos {
    public static final String  Suma  = "+";
    public static final   String  Resta  = "-";
    public static final   String  Multiplicacion  = "*";

    public static final   String  Division  = "/";
    public static Float   total  = null;

    /**
     * Creo un metodo privado de operacionesBasicas que recibe parametros.
     * @param   operacion   que realizará suma,resta,multiplicación y division.
     * @return El método que recibe dos numeros  y devuelve el total.

     */

    private float operacionesBasicas(float numero1 , float numero2, String operacion) {

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
                try {
                    total = numero1 / numero2;
                    break;
                }catch (Exception ex){
                    System.out.println("Error al dividir");
                }
        }
        return total;
    }

    }







