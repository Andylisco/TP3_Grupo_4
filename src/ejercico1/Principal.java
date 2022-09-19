package ejercico1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import Ejercicio3.Edificio;



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
		/*ArrayList<Persona> listPersonas = (ArrayList<Persona>) archivo.lee_Archivo();
		/*Persona nueva = new Persona(); */
		for(int i = 0 ; i< prueba.size();i++) {
			System.out.println(prueba.get(i));
		}
		/*
			int cont=0;
			
				if(prueba.get(i).charAt(i) == '-') {
					cont++;
				}else {
					if(cont == 0) {
						nueva.Nombre += prueba.get(i).charAt(i);
						
					}
					if(cont == 1) {
						nueva.Apellido += prueba.get(i).charAt(i);
						
					}
					if(cont == 2) {
						nueva.Dni += prueba.get(i).charAt(i);				
					}
				}
				if(prueba.get(i).charAt(i) == '\n') {
					cont = 0;
					listPersonas.add(nueva);
					nueva = new Persona(); 
				}		
			
		}
		
		
        ListIterator<Persona> IListPer =  listPersonas.listIterator();
		
		while (IListPer.hasNext())
		{
			Persona Edif = IListPer.next();
			System.out.println(Edif.toString());
		}
		*/
		
		String Dni = JOptionPane.showInputDialog("Ingrese el DNI:");
		
		try 
		{
		    Persona.VerificarDniInvalido(Dni);
			System.out.println("DNI es Valido");
		}
		catch (DniInvalido e) 
		{
			e.printStackTrace();
			System.out.println("DNI NO ES VALIDO");
		}
		
		
		
		//Punto C
		
		Archivo resultado = new Archivo();
		resultado.setRuta("Resultado.txt");
		
		
		if(resultado.existe())
		{
			System.out.println("Existe archivo");
		}
		else
		{
			System.out.println("No existe archivo entonces lo creo");
			resultado.creaArchivo();
		}
		
		
	}

}
