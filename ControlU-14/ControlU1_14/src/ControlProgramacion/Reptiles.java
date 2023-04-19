package ControlProgramacion;

public class Reptiles {

	private String color;

	
	
	public Reptiles(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Reptiles [color=" + color + "]";
	}
	
	
	
}
