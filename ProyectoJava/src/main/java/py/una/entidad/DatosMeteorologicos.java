/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.entidad;

/**
 *
 * @author MaríaJosé
 */
public class DatosMeteorologicos {

        String porcentaje_humedad;
        Double temperatura;
        Double velocidad_viento;
        String Fecha;
        String Hora;
        
        public DatosMeteorologicos(
            String porcentaje_humedad,
            Double temperatura,
            Double velocidad_viento,
            String Fecha,
            String Hora
        ){
        this.porcentaje_humedad = porcentaje_humedad;
        this.temperatura = temperatura;
        this.velocidad_viento = velocidad_viento;
        this.Fecha = Fecha;
        this.Hora = Hora;  
        }
        public String getPorcentaje_Humedad() {
		return porcentaje_humedad;
	}

	public void setPorcentaje_Humedad(String Porcentaje_Humedad) {
		this.porcentaje_humedad = porcentaje_humedad;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
        
        public Double getVelocidad_Viento() {
		return velocidad_viento;
	}

	public void setVelocidad_Viento(Double Veocidad_Viento) {
		this.velocidad_viento = velocidad_viento;
	}
        public String getFecha() {
		return Fecha;
	}

	public void setFecha(String Fecha) {
		this.Fecha = Fecha;
	}
        public String getHora() {
		return Hora;
	}

	public void setTemperatura(String Hora) {
		this.Hora = Hora;
	}
}

