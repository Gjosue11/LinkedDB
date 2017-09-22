package Data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class asignador {
	/**
	 * Metodo que mapea el Json
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static List<String> put() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> Object = mapper.readValue(new File("src\\Estudiantes"), new TypeReference<List<HashMap<String, String>>>(){});
		return asignador.value(Object);
	}
	/**
	 * Metodo que obtiene los atributos de un json referenciados a otro
	 * @param object
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static List<String> value(List<HashMap<String, String>> object) throws JsonParseException, JsonMappingException, IOException {
		int indice1 = 0;
		List<String> atributos = obtener.extract();
		List<HashMap<String,String>> hashmaps = sacadatos.reader();
		List<String> data = new ArrayList<String>();
		while(indice1 != hashmaps.size()){
			List<String> datos = new ArrayList<String>();
			int indice2 = 0;
			while(indice2 != atributos.size()){
				datos.add(hashmaps.get(indice1).get(atributos.get(indice2)));
				indice2 ++;
			}
			indice1 ++;
			data.addAll(datos);
		}
		System.out.println(data);
		return data;
		
	}
}
