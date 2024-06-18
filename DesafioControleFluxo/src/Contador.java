import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		scanner.close();

		try {
			contar ( parametroUm, parametroDois);
			System.out.println();
		
		}catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	
		if(parametroUm > parametroDois ) 
            throw new ParametrosInvalidosException();
		
		int contagem ;
			
			for (contagem = parametroDois - parametroUm ; contagem <= parametroDois ; contagem ++ ){
				
				
				System.out.println("imprimindo numero " + contagem);}
				
				
		
	}
}