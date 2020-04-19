package COVID19;

import COVID19.Entidades.EmpleadoData;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LeeInformacionDeServidorExternoTest {

    @Test
    public void getListaEmpleados() throws IOException {
        LeeInformacionDeServidorExterno proxy = new LeeInformacionDeServidorExterno();
        List<EmpleadoData> empleadoCollections;
        empleadoCollections = proxy.getListaEmpleados();
        Assert.assertTrue(empleadoCollections.size()>0);
    }

}