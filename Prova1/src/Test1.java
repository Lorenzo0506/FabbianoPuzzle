/**
 * <U> Classe Test1 </U>
 * <Mark> @author Lorenzo <Mark>
 *
 */
public class Test1 {
	private String nome;
	public Test1(String nome) {
		this.nome=nome;
	}
	@Override
	public String toString() {
		return "Test1 [nome=" + nome + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
