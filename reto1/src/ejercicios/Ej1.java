package ejercicios;

import clases.Puerto;
import clases.Motor;
import clases.Yate;

import java.util.ArrayList;

import clases.Barco;
import clases.Catamaran;

public class Ej1 {

	public static void main(String[] args) {

		Puerto p1 = new Puerto("marina");

		Motor m1 = new Motor("Motor1", 500, 8.5);
		Motor m2 = new Motor("Motor2", 500, 8.5);
		Motor m3 = new Motor("Motor3", 500, 8.5);

		Yate y1 = new Yate("Yate1", m2, 750, 6);
		Yate y2 = new Yate("Yate2", m2, 750, 6);

		Catamaran c1 = new Catamaran("Catamaran1", m1, 1000, m3);
		Catamaran c2 = new Catamaran("Catamaran2", m1, 1000, m3);

		ArrayList<Barco> lista = new ArrayList<Barco>();
		lista.add(y1);
		lista.add(y2);
		lista.add(c2);
		lista.add(c2);

		for (Barco barco : lista) {
			System.out.println(barco);
		}

	}
}