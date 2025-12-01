package classesExecutaveis;

import java.util.Arrays;
import java.util.List;

public class SplityArray {

	public static void main(String[] args) {
		String valores = "Alex, JDEV, 80, 70, 90, 60";
		// TRANSFORMAR STRING EM ARRAY
		String[] arrayValores = valores.split(",");
		
		System.out.println(arrayValores);
		
		//TRANSFORMAR ARRAY EM LISTA
		List<String> list = Arrays.asList(arrayValores);
		
		//CONVERTER LISTA EM ARRAY
		String[] arrayConvert = list.toArray(new String[6]);
		
		System.out.println(arrayConvert);

	}

}
