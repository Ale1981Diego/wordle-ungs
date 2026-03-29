package entidades;

public class Usuario 
{
	private String nombre;
	private int punto;
	
	public Usuario()
	{
		this.nombre = "";
		this.punto = 0;
	}
	
	public Usuario(String nombre)
	{
		this.nombre = nombre;
		this.punto = 0;
	}


	public int sumaPuntoLetraCoincideEnLugar()
	{
		return this.punto += 3;
	}
	
	public int sumaPuntoLetraExiste()
	{
		return this.punto += 1;
	}
	
	public int restaPuntoLetraNoCoincide()
	{
		return this.punto -= 1;
	}
	

	public String retornarNombre() 
	{
		return this.nombre;
	}
	
	public int retornarPuntos()
	{
		return this.punto;
	}
	
}
