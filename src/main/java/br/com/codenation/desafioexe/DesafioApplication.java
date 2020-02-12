package br.com.codenation.desafioexe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static int fibonacci(int number){
		if (number == 0 || number == 1){
			return number;
		} else {
			return fibonacci(number-1)+fibonacci(number-2);
		}
	}

	public static List<Integer> fibonacci() {

		ArrayList<Integer> listFibonacci = new ArrayList<>();

		int i = 0;

		while (fibonacci(i) < 400) {
			listFibonacci.add(fibonacci(i));
			i++;
		}

		return listFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		int i = 0;
		while (fibonacci(i) <= a){
			//System.out.println(fibonacci(i));
			if (fibonacci(i) == a){
				return true;
			}
			i++;
		}

		return false;
	}

}