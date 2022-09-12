package ejercico1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		String Dni = JOptionPane.showInputDialog("Ingrese el DNI:");
		
		try 
		{
			DNI.verificarDniInvalido(Dni);
			System.out.println("DNI es Valido");
		}
		catch (DniInvalido e) 
		{
			e.printStackTrace();
			System.out.println("DNI NO ES VALIDO");
		}

	}

}
