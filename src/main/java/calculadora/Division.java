package calculadora;

public class Division extends CalculadoraAbstracta {
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
        return a/b;
    }
}
