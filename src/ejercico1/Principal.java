package ejercico1;

import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Archivo arc = new Archivo();
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
		
		List<String> prueba = arc.lee_lineas();
		for(int i = 0 ; i< prueba.size();i++) {
			System.out.println(prueba.get(i));
		}
	}

}
