package Controller;
	import java.io.BufferedReader;
	import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

	public class Linux extends Thread {
	    private String comando;
	    private String serv;
	    public Linux(String serv) {
	        this.serv = serv;
	        this.comando = "ping -4 -c 10 " + serv;
	    }
	    @Override
	    public void run() {
	    	try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	System.out.println(serv);
	        try {
	            Process proc = Runtime.getRuntime().exec(comando);
	            InputStream fluxo = proc.getInputStream(); 
	            InputStreamReader leitor = new InputStreamReader(fluxo);
	            BufferedReader buffer = new BufferedReader(leitor);
	            String linha = buffer.readLine();
	            while (linha != null) {
	            	
	            	
	            	
	            	//	                if (linha.contains("time=")) {
//	                    int indiceInicio = linha.indexOf("time=") + 5;
//	                    int indiceFim = linha.indexOf(" ", indiceInicio);
//	                    String tempoStr = linha.substring(indiceInicio, indiceFim);
//	                    int tempo = Integer.parseInt(tempoStr);
//	                    somaTempo += tempo;
//	                    contador++;
//	                    System.out.println(serv + ": Iteração " + contador + ", Tempo: " + tempo + "ms");
//	                }
	            }
//
//	            int tempoMedio = somaTempo / contador;
//	            System.out.println("Tempo médio para " + serv + ": " + tempoMedio + "ms");

	        } catch (IOException | NumberFormatException e) {
	            e.printStackTrace();
	        }
	    
	    }
}

	   