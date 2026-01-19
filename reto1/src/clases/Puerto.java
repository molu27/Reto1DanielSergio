package clases;

import java.util.ArrayList;


public class Puerto {
	
	protected ArrayList<Barco> barcos;

	public Puerto(String nombre) {
		super();
		this.barcos = new ArrayList<Barco>();
	}

	public ArrayList<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}

	@Override
	public String toString() {
		return "Puerto [barcos=" + barcos + ", toString()=" + super.toString() + "]";
	}

	public boolean entrarBarco(Barco b) {
		if (barcos.size() < 4) {
			return barcos.add(b);
		}

		else {
			return false;
		}
	}

	public boolean salirBarco(String nombre) {
		for (int i = 0; i < barcos.size(); i++) {
			if (barcos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				barcos.remove(i);
				return true;

			}
		}
		return false;
	}

	public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
		if (b.calcularAutonomia() < horas) {
			return -1;
		} else {
			return horas * b.getMotor().getConsumo() * precioCombustible;
		}
	}

}