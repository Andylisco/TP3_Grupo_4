package ejercico1;

import java.util.List;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existe())
		{
			System.out.println("Existe archivo");
		}
		else
		{
			System.out.println("No existe archivo entonces lo creo");
			archivo.creaArchivo();
		}
		
		List<String> prueba = archivo.lee_lineas();
		for(int i = 0 ; i< prueba.size();i++) {
			System.out.println(prueba.get(i));
		}
		
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
