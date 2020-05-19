package depositar;

public class Tarjeta {

	private int numeroDeTarjeta;
	private int pin;

	public Tarjeta(int numeroDeTarjeta, int pin) {

		this.numeroDeTarjeta = numeroDeTarjeta;
		this.pin = pin;
	}

	public int getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public int getPin() {
		return pin;
	}

}
