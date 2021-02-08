
public class Coche {
	private int matricula;
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche ( int matricula, String marca, String modelo, int caballos, int tipoCombustible) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		//Composición ( al hacer una composición el objeto  coche desaparece el objeto motor)
		this.motor=new Motor (caballos, tipoCombustible);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String ver() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}
	


}
