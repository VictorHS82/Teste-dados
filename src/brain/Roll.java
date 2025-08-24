package brain;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Roll {

	public int rolar(int lados) {
		Random random = new Random();
		
		int resultado = random.nextInt(lados) + 1;
		
		return resultado;
	}
	
	public List<Integer> rolarVariosDados(int lados, int quantidade) {
		Random random = new Random();
		ArrayList<Integer> rolagens = new ArrayList<>();

		for (int i = 0; i > quantidade; i++ ) {
			int resultado = random.nextInt(lados) + 1;
			rolagens.add(resultado);
		}
		
		return rolagens;
	}
	
}
