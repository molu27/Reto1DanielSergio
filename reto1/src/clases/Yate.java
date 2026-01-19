package clases;



public class Yate extends Barco {

protected int camarotes;

public Yate(String nombre, Motor motor, int capacidadCombustible, int camarotes) {
	super(nombre, motor, capacidadCombustible);
	this.camarotes = camarotes;
}



@Override
public double calcularAutonomia() {
	// TODO Auto-generated method stub
	return super.calcularAutonomia();
}



public int getCamarotes() {
	return camarotes;
}

public void setCamarotes(int camarotes) {
	this.camarotes = camarotes;
}

@Override
public String toString() {
	return "Yate [camarotes=" + camarotes + ", toString()=" + super.toString() + "]";
}

	

}
