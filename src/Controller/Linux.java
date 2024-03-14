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
	        if(serv.contains("google")){
	        	serv = "Google";
	        }else if(serv.contains("uol")){
	        	serv = "UOL";
	        }else if(serv.contains("terra")) {
	        	serv= "Terra";
	        }
	        	try {
	        
	            Process proc = Runtime.getRuntime().exec(comando);
	            InputStream fluxo = proc.getInputStream(); 
	            InputStreamReader leitor = new InputStreamReader(fluxo);
	            BufferedReader buffer = new BufferedReader(leitor);
	            String linha = buffer.readLine();
	            double tempo, total=0 ,media=0;
	            int vezes= 0;
	            while (linha != null) {
	            	if(linha.contains("time=")) {
		            	String[] parts = linha.split("time=");
		            	if ( parts.length> 1) {
		            		String [] num = parts[1].split("\\s+");
		            		tempo = Double.parseDouble(num[0]);
		            		total = total+tempo;
		            		vezes = vezes + 1; 
		            		System.out.println(serv+ " - levou o tempo de " + tempo + "ms, para fazer 1 interação");
		            	}
	            	}
	            }	            
	            media = total /vezes;
	            System.out.println(serv+ " - O tempo medio é de " + media + "ms");
	        } catch (IOException | NumberFormatException e) {
	            e.printStackTrace();
	        }
	    
	    }
}

	   