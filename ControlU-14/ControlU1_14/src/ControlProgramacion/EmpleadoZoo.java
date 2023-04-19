package ControlProgramacion;

public class EmpleadoZoo extends Cuidador {

	private int codigoempleado;
	private String nombre;
	private String apellidos;
	private int salario;
	
	
	
	
	
	public EmpleadoZoo(int codigoempleado, String nombre, String apellidos, int salario) {
		super();
		this.codigoempleado = codigoempleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	public int getCodigoempleado() {
		return codigoempleado;
	}
	public void setCodigoempleado(int codigoempleado) {
		this.codigoempleado = codigoempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "EmpleadoZoo [codigoempleado=" + codigoempleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", salario=" + salario + "]";
	}
	
	
	
}
