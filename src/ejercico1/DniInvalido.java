package ejercico1;
import java.io.IOException;

public class DniInvalido extends IOException 
{
	public DniInvalido()
	{
		
	}
	
//SOBRE ESCRIBIMOS EL METODO GETMESSAGE
	@Override
	public String getMessage()
	{
				
		return "Dni Invalido";
	}




}

