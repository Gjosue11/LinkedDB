package Data;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Lists.DoublyLinked;

public class Reader {
	/**
	 * Metodo que lee un Json
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static void read() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper map = new ObjectMapper();
		List<datos> Objects = map.readValue(new File("src\\Json"), new TypeReference<List<datos>>(){});
		Reader.converter(Objects);
	}
	/**
	 * Metodo que guardar el Json en una lista
	 * @param lista
	 */
	public static void converter(List<datos> lista){
		int i = 0;
		DoublyLinked<datos> json = new DoublyLinked<datos>();
		int large = lista.size();
		while(i != large){
			json.add(lista.get(i));
			i ++;
		}
		System.out.println(json.getHead().getDato().columnas);
	}
}