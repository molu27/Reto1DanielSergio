package clases;

public class Catamaran extends Barco {
protected Motor motorSecundario;

public Catamaran(String nombre, Motor motor, int capacidadCombustible, Motor motorSecundario) {
	super(nombre, motor, capacidadCombustible);
	this.motorSecundario = motorSecundario;
}



@Override
public double calcularAutonomia() {
	// TODO Auto-generated method stub
	return (capacidadCombustible/motor.consumo) + (capacidadCombustible/motorSecundario.consumo) / 2;
}



public Motor getMotorSecundario() {
	return motorSecundario;
}

public void setMotorSecundario(Motor motorSecundario) {
	this.motorSecundario = motorSecundario;
}

@Override
public String toString() {
	return "Catamaran [motorSecundario=" + motorSecundario + ", toString()=" + super.toString() + "]";
}

}
