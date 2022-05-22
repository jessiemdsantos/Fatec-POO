
import fatec.poo.model.Corretor;
import fatec.poo.model.Locatario;
import java.text.DecimalFormat;

public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
       
       	//instanciando o corretor
    		Corretor objCorretor = new Corretor(100, "Carlos Silva", 0.05); 
    		//adicionar os aluguéis
    		objCorretor.addLocacao(780.00);
    		objCorretor.addLocacao(1500.00);
    		objCorretor.addLocacao(650.00);      
        
        
        //instanciando 2 locatários 
        Locatario objLocatario1 = new Locatario(111, "Amelida Souza");
        Locatario objLocatario2 = new Locatario(222, "Antonio Vieira");
        
        objLocatario1.addAluguel(780.00, objCorretor.getTaxaLocacao());
        objLocatario2.addAluguel(1500.00, objCorretor.getTaxaLocacao());
        objLocatario2.addAluguel(650.00, objCorretor.getTaxaLocacao());
        
        //imprimindo dados do corretor
        System.out.println("\nCódigo: " + objCorretor.getCodigo()
                + "\nNome: " + objCorretor.getNome() + 
                "\nTaxa de Locação: " + objCorretor.getTaxaLocacao()*100 + "%" + 
                "\nValor da Comissão: " + df.format(objCorretor.calcValorComissaoLocacao()));
                
         //imprimindo os dados dos locatários
        System.out.print(
            "\nCodigo:" + objLocatario1.getCodigo() +
            "\nNome:" + objLocatario1.getNome() +
            "\nTotal dos Aluguéis:\t" + df.format(objLocatario1.getTotalAluguel()));
            
       System.out.print(
            "\n\nCodigo:" + objLocatario2.getCodigo() +
            "\nNome:" + objLocatario2.getNome() +
            "\nTotal dos Aluguéis:\t" + df.format(objLocatario2.getTotalAluguel()));  
      
    }
    
}
