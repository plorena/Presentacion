package COVID19;

import COVID19.Entidades.EmpleadoData;
import org.junit.Assert;
import org.junit.Test;

public class TriajeDeCadaPacienteTest {

    @Test
    public void esPersonaEnRiesgo_FueraDeRiesgo() {
        EmpleadoData empleadoData = new EmpleadoData();
        empleadoData.setEmployeeAge("20");
        TriajeDeCadaPaciente triajeDeCadaPaciente = new TriajeDeCadaPaciente();
        boolean personaEnRiesgo = triajeDeCadaPaciente.esPersonaEnRiesgo(empleadoData);
        Assert.assertFalse(personaEnRiesgo);
    }


    @Test
    public void esPersonaEnRiesgo_EnRiesgo() {
        EmpleadoData empleadoData = new EmpleadoData();
        empleadoData.setEmployeeAge("34");
        TriajeDeCadaPaciente triajeDeCadaPaciente = new TriajeDeCadaPaciente();
        boolean personaEnRiesgo = triajeDeCadaPaciente.esPersonaEnRiesgo(empleadoData);
        Assert.assertTrue(personaEnRiesgo);
    }


    @Test
    public void esPersonaEnRiesgo_EnRiesgo_Limite() {
        EmpleadoData empleadoData = new EmpleadoData();
        empleadoData.setEmployeeAge("65");

        TriajeDeCadaPaciente triajeDeCadaPaciente = new TriajeDeCadaPaciente();


        boolean personaEnRiesgo = triajeDeCadaPaciente.esPersonaEnRiesgo(empleadoData);
        Assert.assertTrue(personaEnRiesgo);
    }

}