import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		pessoas.add(new Pessoa("Demerval","12345678"));
		pessoas.add(new Pessoa("Janayna","1234448"));
		pessoas.add(new Pessoa("Wesley","12345228"));
		pessoas.add(new Pessoa("Ricardo","12346678"));
		
		pessoas.removeIf(p ->p.getNome().equals("Demerval"));
		
		pessoas.forEach(System.out::println);
		
	}

}
