// para funcionar o c.deposita(), precisamos lan�ar a excecao.
// podemos lan�ar a excecao adicionando throws MinhaException na assinatura do metodo
// ou podemos incluir um try-catch na execucao do codigo


public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch (MinhaException ex) {
			System.out.println("tratamento...");
		}

	}

}
