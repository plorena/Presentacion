package calculadora;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculadoraTest {
    @Test
    public void sumaTest() throws Exception {
        CalculadoraAbstracta calculadora = new Suma();
        int resultado = calculadora.getOperation(3, 5);
        Assert.assertTrue(8== resultado);
    }

    @Test
    public void restaTest() throws Exception {
        CalculadoraAbstracta calculadora = new Resta();
        int resultado = calculadora.getOperation(30, 5);
        Assert.assertTrue(25== resultado);
    }
    @Test
    public void multiplicationTest() throws Exception {
        CalculadoraAbstracta calculadora = new Multiplication();
        int resultado = calculadora.getOperation(3, 5);
        Assert.assertTrue(15== resultado);
    }
    @Test
    public void divisionTest() throws Exception {
        CalculadoraAbstracta calculadora = new Division();
        int resultado = calculadora.getOperation(30, 5);
        Assert.assertTrue(6== resultado);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    //Aumentar la calidad mi test
    @Test
    public void sumaTest_NegativoA() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del primer parametro es negativo");

        CalculadoraAbstracta calculadora = new Suma();
        int resultado = calculadora.getOperation(-3, 5);
    }

    @Test
    public void sumaTest_NegativoB() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del segundo parametro es negativo");

        CalculadoraAbstracta calculadora = new Suma();
        int resultado = calculadora.getOperation(3, -5);
    }

    //Aumentar la calidad mi test
    @Test
    public void restaTest_NegativoA() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del primer parametro es negativo");

        CalculadoraAbstracta calculadora = new Resta();
        int resultado = calculadora.getOperation(-3, 5);
    }

    @Test
    public void restaTest_NegativoB() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del segundo parametro es negativo");

        CalculadoraAbstracta calculadora = new Resta();
        int resultado = calculadora.getOperation(3, -5);
    }

    @Test
    public void multiplicacionTest_NegativoA() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del primer parametro es negativo");

        CalculadoraAbstracta calculadora = new Multiplication();
        int resultado = calculadora.getOperation(-3, 5);
    }

    @Test
    public void multiplicacionTest_NegativoB() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del segundo parametro es negativo");

        CalculadoraAbstracta calculadora = new Multiplication();
        int resultado = calculadora.getOperation(3, -5);
    }

    @Test
    public void divisionTest_NegativoA() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del primer parametro es negativo");

        CalculadoraAbstracta calculadora = new Division();
        int resultado = calculadora.getOperation(-3, 5);
    }

    @Test
    public void divisionTest_NegativoB() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Un valor proporcionado del segundo parametro es negativo");

        CalculadoraAbstracta calculadora = new Division();
        int resultado = calculadora.getOperation(3, -5);
    }

    @Test
    public void getOperacionOperarionesBancariasLosUltimos4Anos() throws Exception {
        CalculadoraAbstracta calculadora = new CalculadoraTransacionesBancarias();
        int resultado = calculadora.getOperation(5, 1500);
        Assert.assertTrue(resultado==12345);
    }


    @Test
    public void getOperacionOperarionesBancariasLosUltimos4Anos_Mock() throws Exception {
        CalculadoraAbstracta calculadora = new CalculadoraTransacionesBancariasMock();
        int resultado = calculadora.getOperation(5, 1500);
        Assert.assertTrue(resultado==11111);
    }



}
