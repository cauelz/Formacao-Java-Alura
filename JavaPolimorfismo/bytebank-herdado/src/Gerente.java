
public class Gerente extends Funcionario {

	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}


	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); //super faz uma referencia à classe superior, no caso, funcionario
	}
	
	
}
