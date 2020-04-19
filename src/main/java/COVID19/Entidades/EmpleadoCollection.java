
package COVID19.Entidades;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmpleadoCollection {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private List<EmpleadoData> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EmpleadoData> getListaEmpleados() {
        return data;
    }

    public void setData(List<EmpleadoData> data) {
        this.data = data;
    }

}
