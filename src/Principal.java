import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Principal {
	public static void main(String[] args){
		try{
			// criacao do arquivo
			FileOutputStream file = new FileOutputStream("log.txt");
			// permite escrever no arquivo
			PrintWriter printer = new PrintWriter(file);			
			
			// pega data atual
			LocalDateTime date = LocalDateTime.now();
			
			// variaveis de controle, data e hora
			int day = date.getDayOfMonth();
			int month = date.getMonthValue();
			int year = date.getYear();
			
			int hour = date.getHour();
			int minute = date.getMinute();
			int second = date.getSecond();
			
			printer.println("<Detalhamento do log>");
			printer.println();
			printer.println("  DIA    |   HORA ");
			
			// imprime no arquivo
			for (int i = 0; i < 20; i++){
				printer.println(day + "/" + month + "/" + year + " | " +
								hour + ":" + minute + ":" + second + " - Linha "+(i+1));
			}
			
			printer.println();
			printer.println("Finalizado!");
			
			// fecha o arquivo
			printer.close();
			file.close();
		}
		catch(Exception ex){
			System.out.println("Erro na criacao do arquivo");
		}
	}
}
