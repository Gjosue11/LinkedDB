package Config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Data.Reader;
import Data.asignador;
import Data.obtener;
import Data.sacadatos;
import Lists.CircularDouble;
import Lists.DoublyLinked;
import Lists.LinkedList;

public class Execute {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		Reader.read();
		System.out.println();
		obtener.extract();
		sacadatos.reader();
		asignador.put();
	}
}
