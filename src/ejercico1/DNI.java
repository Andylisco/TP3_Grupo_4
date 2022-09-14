package ejercico1;


public class DNI{


	public static void verificarDniInvalido(String dni)  throws DniInvalido 
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
	
}
