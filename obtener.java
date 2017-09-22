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

public class obtener{
	/**
	 * Metodo que mapea un Json
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static List<String> extract() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		List<datos> Object = mapper.readValue(new File("src\\Json"), new TypeReference<List<datos>>(){});
		return obtener.out(Object);
	}
	/**
	 * Metodo que recorre los datos del Json
	 * @param object
	 * @return
	 */
	public static List<String> out(List<datos> object){
		int i = 0;
		List<String> atributos = new ArrayList<String>();
		obtener.atributos(atributos,object.get(i).columnas);
		return atributos;
	}
	/**
	 * Metodo que extrae atributos especificos de un Json
	 * @param atributos
	 * @param columnas
	 */
	private static void atributos(List<String> atributos, ArrayList<HashMap<String, String>> columnas){
		int i = 0;
		while(i != columnas.size()){
			atributos.add(columnas.get(i).get("info"));
			i ++;
		}
		
	}
}
