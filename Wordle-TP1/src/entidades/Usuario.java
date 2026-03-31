package entidades;

public class Usuario 
{
	private String nombre;
	private int punto;
	private int vida;
	
	public Usuario()
	{
		this.nombre = "";
		this.punto = 0;
		this.vida = 0;
	}
	
	public Usuario(String nombre)
	{
		this.nombre = nombre;
		this.punto = 0;
		this.vida = 6;
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
	
	public void descontarVida()
	{
		this.vida -= 1;
	}
	
	public int mostrarVida()
	{
		return this.vida;
	}
	
}
