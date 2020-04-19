package COVID19;

import COVID19.Entidades.EmpleadoData;

/**
 * El triaje, trillaje o cribado (del francés triage...)
 * o protocolo de intervención es un método de selección y clasificación de pacientes
 * empleado en la medicina de emergencias y desastres.
 * Fuente : https://es.wikipedia.org/wiki/Triaje
 */
public class TriajeDeCadaPaciente
{
    private int EDADCRITICA = 40;

    /**
     * Es un empleado con riesgo de tener complicaciones en caso de contraer COVID19
     * En este caso, el criterio del triaje es determinar si la edad del paciente es igual o mayor a 65 años
     * @param empleadoData Informacion del empleado
     * @return
     */
    public boolean esPersonaEnRiesgo(EmpleadoData empleadoData)
    {
        return Integer.parseInt(empleadoData.getEmployeeAge())>=EDADCRITICA;
    }
}
