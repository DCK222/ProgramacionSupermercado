package ControlProgramacion;

public class Aves {

	private int longitudPico;
	
	private boolean rapaces;
	
	
	public Aves(int longitudPico, boolean rapaces) {
		super();
		this.longitudPico = longitudPico;
		this.rapaces = rapaces;
	}

	public int getLongitudPico() {
		return longitudPico;
	}

	public void setLongitudPico(int longitudPico) {
		this.longitudPico = longitudPico;
	}

	public boolean isRapaces() {
		return rapaces;
	}

	public void setRapaces(boolean rapaces) {
		this.rapaces = rapaces;
	}

	@Override
	public String toString() {
		return "Aves [longitudPico=" + longitudPico + ", rapaces=" + rapaces + "]";
	}

	
}
