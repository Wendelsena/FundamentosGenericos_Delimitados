package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] filds = line.split(","); // justificando a virgula
				list.add(new Product(filds[0], Double.parseDouble(filds[1]))); // pegando os valores por linha.
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("MAX: " + x);

		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}
