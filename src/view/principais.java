package view;

import javax.swing.JOptionPane;

import Controller.Linux;

public class principais {
	 public static void main(String[] args) {
	     String nome;
	     String sistema;
	     sistema = os();
	     if(sistema.contains("Linux")) {
	    	 for(int i= 0; i<3;i++) {
	    		 nome = JOptionPane.showInputDialog("Digite o nome do site desejado.ex: www.google.com.br, www.uol.com.br");
	    		 Thread com = new Linux(nome);
	    	 	 com.start();
		     }
	     }else {
	    	 System.out.println("Esse programa nao funcina no " + sistema + ", utilize no Linux.");
	     }
	 }
	 private static String os() {
		String os = System.getProperty("os.name");
		return os;
	}
}
