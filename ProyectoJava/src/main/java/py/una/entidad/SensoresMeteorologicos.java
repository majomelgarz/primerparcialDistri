package py.una.entidad;
import java.util.ArrayList;
import java.util.List;

public class SensoresMeteorologicos {

	String id_estacion;
        String ciudad;
	
	List<String> datos_meteorologicos;
	
	public SensoresMeteorologicos(){
		datos_meteorologicos = new ArrayList<String>();
	}

	public SensoresMeteorologicos(String id_estacion, String ciudad){
		this.id_estacion = id_estacion;
		this.ciudad = ciudad;
		
		datos_meteorologicos = new ArrayList<String>();
	}
	
	

	public String getId_estacion() {
		return id_estacion;
	}

	public void setId_estacion(String id_estacion) {
		this.id_estacion = id_estacion;
	}
        public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.id_estacion = ciudad;
	}

	public List<String> getDatosMeteorologicos() {
		return datos_meteorologicos;
	}

	public void setDatosMeteorologicos(List<String> datosmeteorologicos) {
		this.datos_meteorologicos = datosmeteorologicos;
	}
}
