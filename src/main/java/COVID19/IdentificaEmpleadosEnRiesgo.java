package COVID19;

import COVID19.Entidades.EmpleadoData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Identifica los pacientes con mayor riesgo en caso de COVID19
 * Atencion :
 * Esta identificacion se basa unicamente en la edad del empleado, no toma en cuenta otros parametros
 */
public class IdentificaEmpleadosEnRiesgo {
    private LeeInformacionDeServidorExterno leeInformacionDeServidorExterno;
    private TriajeDeCadaPaciente triajeDeCadaPaciente;
    private List<EmpleadoData> empleadoDataList ;


    /**
     * Identifica los pacientes con mayor riesgo en caso de COVID19
     * Atencion :
     * Esta identificacion se basa unicamente en la edad del empleado, no toma en cuenta otros parametros
     */
    public IdentificaEmpleadosEnRiesgo() throws IOException {
        leeInformacionDeServidorExterno = new LeeInformacionDeServidorExterno();
        triajeDeCadaPaciente = new TriajeDeCadaPaciente();
        empleadoDataList = leeInformacionDeServidorExterno.getListaEmpleados();
    }


    /**
     * List de empleados con mayor riesgo de complicaciones si tienen COVID19
     * @return
     */
    public List<EmpleadoData> getListaEmpleadoEnRiesgo() {
        List<EmpleadoData> empleadosConMayorRiesgo = new ArrayList<>();
        for (EmpleadoData empleado: this.empleadoDataList) {
            if(triajeDeCadaPaciente.esPersonaEnRiesgo(empleado))
                empleadosConMayorRiesgo.add(empleado);
        }
        return  empleadosConMayorRiesgo;
    }
}
