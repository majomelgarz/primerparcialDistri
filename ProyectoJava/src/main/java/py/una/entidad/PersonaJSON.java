package py.una.entidad;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SensoresMeteorologicosJSONpackage py.una.entidad;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SensoresMeteorologicosJSON() {


    public static void main(String[] args) throws Exception {
    	SensoresMeteorologicosJSON representacion = new SensoresMeteorologicosJSON();
    	
    	System.out.println("Ejemplo de uso 1: pasar de objeto a string");
    	SensoresMeteologicosJSON sensor = new SensoresMeteorologicos();
    	sensor.setIdEstacion(id_estacion);
    	sensor.setCiudad(ciudad);
    	sensor.getDatosMeterologicos().add(datos);
 
        String r1 = representacion.objetoString(sensor);
    	System.out.println(sensor);
    	
    	
    	System.out.println("\n*************************************************************************");
    	System.out.println("\nEjemplo de uso 2: pasar de string a objeto");
    	String un_string = "{\"cedula\":123123,\"nombre\":\"Ana\",\"apellido\":\"Perez\",\"asignaturas\":[\"Sistemas Distribuidos\",\"Fisica\",\"Inteligencia Artificial\"]}";
    	
    	SensoresMeterologicos r2 = representacion.stringObjeto(un_string);
    	System.out.println(r2.id_estacion + " " + r2.ciudad);
        }
    }
    
    public static String objetoString(Persona p) {	
    	
		JSONObject obj = new JSONObject();
        obj.put("cedula", p.getCedula());
        obj.put("nombre", p.getNombre());
        obj.put("apellido", p.getApellido());

        JSONArray list = new JSONArray();
        
        for(String temp: p.getAsignaturas()){
        	list.add(temp);
        }
       // if(list.size() > 0) {
        	obj.put("asignaturas", list);
        //}
        

        return obj.toJSONString();
    }
    
    
    public static Persona stringObjeto(String str) throws Exception {
    	Persona p = new Persona();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        Long cedula = (Long) jsonObject.get("cedula");
        p.setCedula(cedula);
        p.setNombre((String)jsonObject.get("nombre"));
        p.setApellido((String)jsonObject.get("apellido"));
        
        JSONArray msg = (JSONArray) jsonObject.get("asignaturas");
        Iterator<String> iterator = msg.iterator();
        while (iterator.hasNext()) {
        	p.getAsignaturas().add(iterator.next());
        }
        return p;
	}

}
