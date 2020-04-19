package COVID19;

import COVID19.Entidades.EmpleadoData;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class IdentificaEmpleadosEnRiesgoTest {

    @Test
    public void getListaEmpleadoEnRiesgo() throws IOException {
        IdentificaEmpleadosEnRiesgo identificaEmpleadosEnRiesgo = new IdentificaEmpleadosEnRiesgo();
        List<EmpleadoData> empleadoDataLista = identificaEmpleadosEnRiesgo.getListaEmpleadoEnRiesgo();
        Assert.assertTrue(empleadoDataLista.size()>0);


        for (EmpleadoData empleado: empleadoDataLista) {
            System.out.println(empleado.getEmployeeName() + "==>Age:"+empleado.getEmployeeAge());
        }



    }
}