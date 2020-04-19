package calculadora;

/**
 * Abstraction de las operaciones de una calculadora
 */
public abstract class CalculadoraAbstracta {
    /**
     * Operacion de 2 enteros positivos
     * @param a primer entero positivo
     * @param b segundo entero positivo
     * @return
     */
    public abstract int getOperation(int a, int b) throws Exception;


    protected void validacionDeParametros(int a, int b) throws Exception {
        if (a < 0)
            throw new Exception("Un valor proporcionado del primer parametro es negativo");
        if (b < 0)
            throw new Exception("Un valor proporcionado del segundo parametro es negativo");
    }
}
