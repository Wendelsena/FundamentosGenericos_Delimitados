package services;

import java.util.List;

public class CalculationService {

	// método que acha o maior em uma lista de produtos.
	public static <T extends Comparable<T>> T max(List<T> list) { // esse método trabalha com qualquer tipo T, desde que
																	// o T seja qualquer tipo de comparable T.
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { // se item item comparado com max for superior a 0.
				max = item; // pega valor maximo de item.
			}
		}
		return max;
	}
}
