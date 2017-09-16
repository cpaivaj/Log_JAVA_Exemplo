import java.time.LocalDateTime;

public class Principal {
	public static void main(String[] args){
		try{
			// pega data atual
			LocalDateTime date = LocalDateTime.now();
			LogArquivo log = new LogArquivo();
			
			// variaveis de controle, data e hora
			int day = date.getDayOfMonth();
			int month = date.getMonthValue();
			int year = date.getYear();
			
			int hour = date.getHour();
			int minute = date.getMinute();
			int second = date.getSecond();
			
			log.EscreverArquivo("log.txt", "<Detalhamento do log>");
			log.EscreverArquivo("log.txt", "  DIA    |   HORA ");

			String dados;
			
			// imprime no arquivo
			for (int i = 0; i < 20; i++){
				dados = day + "/" + month + "/" + year + " | " +
						hour + ":" + minute + ":" + second + " - Linha "+(i+1);

				log.EscreverArquivo("log.txt", dados);
			}
		}
		catch(Exception ex){
			System.out.println("Erro na criacao do arquivo");
		}
	}
}
