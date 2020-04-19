package calculadora;

public class CalculadoraTransacionesBancarias extends CalculadoraAbstracta {
    /**
     * Operacion de 2 enteros positivos
     *
     * @param a primer entero positivo
     * @param b segundo entero positivo
     * @return
     */
    @Override
    public int getOperation(int a, int b) throws Exception {
        this.validacionDeParametros(a,b);
        Thread.sleep(10000);
        return 12345;
    }
}
