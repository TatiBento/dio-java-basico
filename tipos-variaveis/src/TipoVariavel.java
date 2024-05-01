public class TipoVariavel {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);
        // sem o final altera o valor da variável
    }
}
