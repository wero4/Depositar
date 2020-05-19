package depositar;

import java.math.BigDecimal;

public class DepositarDemo {

	public static void main(String[] args) {
		
		CajaDeAhorroPesos ca1 = new CajaDeAhorroPesos("calabaza");
		Depositar depo = new Depositar(ca1);
		BigDecimal d = new BigDecimal("100");
		
		depo.depositarPesos(d);
		
		d = new BigDecimal("500");
		depo.depositarPesos(d);
		
		ca1.consultarMovimientos();
		System.out.println(ca1.consultarSaldo());
	}

}
