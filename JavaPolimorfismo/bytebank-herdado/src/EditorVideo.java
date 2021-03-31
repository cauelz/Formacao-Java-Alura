
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + 100; //super faz uma referencia à classe superior, no caso, funcionario
	}
	
	
}
