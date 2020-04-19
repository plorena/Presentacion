package COVID19;

import COVID19.Entidades.EmpleadoCollection;
import COVID19.Entidades.EmpleadoData;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

/**
 * Recupera la lista completa de todos los empleados del servicio ==> "http://dummy.restapiexample.com/api/v1/employees"
 */
public class LeeInformacionDeServidorExterno {


    private  String URL_SERVIDOR_EXTERNO = "http://dummy.restapiexample.com/api/v1/employees";

    /**
     * Recupera la lista completa de todos los empleados del servicio ==> "http://dummy.restapiexample.com/api/v1/employees"
     * @return
     * @throws IOException
     */
    public List<EmpleadoData> getListaEmpleados() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(URL_SERVIDOR_EXTERNO)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        EmpleadoCollection empleadoCollection = new Gson().fromJson(json, EmpleadoCollection.class);

        return empleadoCollection.getListaEmpleados();
    }
}
