package parquimetro;

public class Parquimetro {
	private int saldo;

	public Parquimetro() {
		saldo = 0;
	}

	public void insereMoeda(int valor) {
		switch (valor) {
		case 1:
			saldo += valor;
			break;

		case 5:
			saldo += valor;
			break;

		case 10:
			saldo += valor;
			break;

		case 25:
			saldo += valor;
			break;

		case 50:
			saldo += valor;
			break;

		case 100:
			saldo += valor;

			break;
			default:
				throw new IllegalArgumentException();

		}
	}

	public int getSaldo() {
		return (saldo);

	}

	public boolean emiteTicket() {
		if (getSaldo() < 200) {
			return (false);

		}
		saldo -= 200;
		return (true);
	}

	public int devolve() {
		int tmp = saldo;
		saldo = 0;
		return (tmp);

	}
}


}
