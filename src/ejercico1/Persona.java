package ejercico1;

import java.util.TreeSet;
import ejercico1.DniInvalido;
import ejercico1.Persona;

public class Persona implements Comparable<Persona> {

	public Persona() {
		this.Apellido = "";
		this.Nombre = "";
		this.Dni = "";
	}
	
	public Persona(String dni, String nombre, String apellido) {
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
	}

	String Dni;
	String Nombre;
	String Apellido;
	
	public String GetDni() {
		return this.Dni;
	}
	
	
	public String GetApellido() {
		return this.Apellido;
	}
	
	public static void VerificarDniInvalido(String dni) throws DniInvalido 
	{
		 	for (int i = 0; i < dni.length();i++)
		 	{
		 		if(!dni.matches("^[0-9]*$"))
		 		{
		 			DniInvalido MalDni = new DniInvalido();
		 			throw MalDni;
		 		}			
		 	}
	}
	
	@Override
	public String toString() {
		return "Persona: Apellido: " + Apellido +
				", Nombre: " + Nombre + ", Dni: " + Dni;
	}

	@Override
	public int compareTo(Persona obj) {
		// TODO Auto-generated method stub
			return this.GetApellido().compareTo(obj.GetApellido());
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + ((Dni == null) ? 0 : Dni.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (Dni == null) {
			if (other.Dni != null)
				return false;
		} else if (!Dni.equals(other.Dni))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	
	public static TreeSet<Persona> generarListado(String listado, Persona nueva){
		int cont = 0;
		TreeSet<Persona> lista = new TreeSet<Persona>();
		
		for (int i = 0; i < listado.length(); i++) {
			if(listado.charAt(i) == '-') {
				cont++;
			}else {
				if(cont == 0) {
					nueva.Nombre += listado.charAt(i);
					
				}
				if(cont == 1) {
					nueva.Apellido += listado.charAt(i);
					
				}
				if(cont == 2) {
					nueva.Dni += listado.charAt(i);				
				}
			}
			if(listado.charAt(i) == '\n') {
				cont = 0;
				lista.add(nueva);
				nueva = new Persona(); 
			}		
		}
		return lista;		
	}
}
