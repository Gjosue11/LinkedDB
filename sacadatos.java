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

public class sacadatos {
	/**
	 * Metodo que mapea el Json
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static List<HashMap<String, String>> reader() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper map = new ObjectMapper();
		List<HashMap<String,String>> Objects = map.readValue(new File("src\\Estudiantes"), new TypeReference<List<HashMap<String, String>>>(){});
		return sacadatos.out(Objects);
	}
	/**
	 * Metodo que saca los elementos del Json
	 * @param objects
	 * @return
	 */
	public static List<HashMap<String, String>> out(List<HashMap<String, String>> objects){
		List<HashMap<String,String>> partes = new ArrayList<HashMap<String, String>>();
		int indice = 0;
		int large = objects.size();
		while(indice != large){
			partes.add(objects.get(indice));
			indice ++;
		}
		return partes;
	}
}
