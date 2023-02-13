package hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Hotel {

	public static void main(String args[]) 
	{
		
		Scanner input = new Scanner(System.in);
		int i,v, opc;
		int quartos[];
		quartos = new int[20];
		

		Quarto suiteFamilia = new Quarto();	
		suiteFamilia.setDescricaoQuarto("Acomoda��o Familiar");
		suiteFamilia.setNomeQuarto("Suite Familia");
		suiteFamilia.qtdQuartos(10);
		suiteFamilia.setValorDiaria(350.00);
		suiteFamilia.setTamanho(60.2);
		
		Quarto suiteMaster = new Quarto();	
		suiteMaster.setDescricaoQuarto("Acomoda��o Familiar");
		suiteMaster.setNomeQuarto("Suite familia");
		suiteMaster.qtdQuartos(10);
		suiteMaster.setValorDiaria(250.00);
		suiteMaster.setTamanho(60.2);
		
		Quarto suitePremium = new Quarto();	
		suitePremium.setDescricaoQuarto("Acomoda��o Familiar");
		suitePremium.setNomeQuarto("Suite familia");
		suitePremium.qtdQuartos(10);
		suitePremium.setValorDiaria(450.00);
		suitePremium.setTamanho(60.2);
		
		System.out.println("Escolha sua Su�te");
		System.out.println("Op��o 1 - Suite Familia");
		System.out.println("OP��o 2 - Suite Master");
		System.out.println("Op��o 3 - Suite Premium");
		int opcao = input.nextInt();
//		

		switch (opcao) {
		case 1:
			System.out.print(suiteFamilia.toString());
			break;
		
		case 2:
			System.out.print(suiteMaster.toString());
			break;
		
		case 3:
			System.out.print(suitePremium.toString());
			break;
			
		default:
			System.out.print("\nOp��o Inv�lida!");
			break;
			
		case 4:
			System.out.print("\nAt� logo!");
			input.close();
			break;
		}
	
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		Reserva reserva = new Reserva();	
		System.out.println("\n");
	
		Cliente hospedes = new Cliente();
		
		do  
		{
			
			System.out.println("\n1- CADASTRAR");
			System.out.println("2- REMOVER");
			System.out.println("3- REMOVER TODOS");
			System.out.println("4- IMPRIMIR");
			System.out.println("5- Sair");
			System.out.println("");
			System.out.println("Escolha a operacao desejada:");
			opc = input.nextInt();

			switch(opc)
			{
				
			case 1: 
				System.out.println("Suite Escolhida: " + opcao + "Digite o numero do Quarto" );
				i= input.nextInt();
				if (i<20)
				{
					
				if (quartos[i]== 0) 
					{
					
						System.out.println("Digite o Nome do Hospede:");
						hospedes.setNome(input.next());
						System.out.println("Digite o Sobrenome");
						hospedes.setSobrenome(input.next());
						System.out.println("Digite o CPF");
						hospedes.setCpf(input.nextLong());
						System.out.println("Digite a data de Entrada dd/MM/yyy");
						reserva.setCheckIn(input.next());
						System.out.println("Digite a data de Sa�da dd/MM/yyy");
						reserva.setCheckOut(input.next());
						System.out.printf("Hospede registrado com sucesso no quarto %d\n", i); 
						
					
						
						System.out.println("O valor da Reserva  Ficou em R$: "  );

						System.out.println("Qual a forma de Pagamento: ");
						System.out.println(" 1 - D�bito ");
						System.out.println(" 2 - Cr�dito ");
						System.out.println(" 3 - Dinheiro ");
						
								
						int pgto = input.nextInt();
						switch (pgto) {
						case 1:
							System.out.print("Pagamento ser� efetuado diretamente no Hotel");
							break;
						case 2:
							System.out.print("Digite o numero do seu cart�o");
							Pagamento pagamento = new Pagamento();
							pagamento.setNumeroCartao(input.nextLong());
							System.out.println("Digite o nome Impresso no Cart�o");
							pagamento.setNomeImpresso(input.nextLine());
							System.out.println("Digite o numero de Seguran�a");
							pagamento.setControle(input.nextInt());
							System.out.println("Digite a Data de Validade");
							pagamento.setValidade(input.next());
							break;
						
						case 3:
							System.out.print("Pagamento ser� efetuado diretamente com o hotel ");
							break;
							
						default:
							System.out.print("\nOp��o Inv�lida!");
							break;
							
						case 4:
							System.out.print("\nAt� logo!");
							break;
						}
						
						
					}else
					{
						System.out.println("Quarto Ocupado!"); 
					}
				}else
				{
					System.out.println("Quarto inexistente");
				}
				break;
			case 2:
				System.out.println("Escolha o quarto"); 
				i= input.nextInt();
				if (quartos[i]== 0)
				{
					System.out.printf("Quarto %d encontra-se vazio no momento!\n", i);
											
				}else // senao
				{
					System.out.println("H�spede removido do quarto com sucesso!"); 
					quartos[i]= 0; // 
				}
				break;
			case 3:
				System.out.println("Todos h�spedes removidos com sucesso"); 
				for(v=0;v<20;v++)
				{
					quartos[v]= 0; 
				}
				break;
			case 4:
				System.out.println("Listagem de quartos!"); 
				for (i=0;i<quartos.length;i++)
				{
					if (quartos[i]==0) 
					{ 
						System.out.printf("Quarto: %d: ----Livre\n",i);
					}else
					{
						System.out.printf("Quarto: %d: ----Ocupado\n",i); 
					}
				}
				break;
			
			default:
				System.out.println("Opcao invalida"); 
			}

			
		}while(opc!=5); 
		
			}
}
