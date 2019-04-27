


public class Validacion_datos {

	String User = "Jonnhy";
	String Pass = "12345";
	
	public boolean validacionLogin(String user, String pass)
	{	
		
		if(User.equals(user) && Pass.contentEquals(pass))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
