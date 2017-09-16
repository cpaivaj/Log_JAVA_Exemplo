import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogArquivo {
	public void EscreverArquivo(String file, String dados) throws IOException
	{
		boolean anexar = false; 
        File arquivo = new File(file);
        
        if (arquivo.length() != 0L)
        {
        	anexar = true;
        }
        
        FileWriter writer = new FileWriter(new File(file), anexar);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        
        bufferedWriter.write(dados);
        
        bufferedWriter.flush();
        writer.close();
        bufferedWriter.close();
    }
}
