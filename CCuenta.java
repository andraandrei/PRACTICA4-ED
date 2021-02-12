// Comentarios 

/* @author Andra Ioana Andrei
 * @version 2020-12
 */

public class CCuenta {

// atributos de la clase

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterÃ©s;

    public CCuenta()
    {
    	
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
    	// cuerpo de la clase
    	
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
    	// @return Cuerpo de método con un sentencia de retorno
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
    	/* 
    	 * @param  De tipo double. Devuelve la cantidad
    	 * @exception No se puede ingresar cantidad negativa
    	 */
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
    	/* 
    	 * @return Devuelve cantidad de tipo double
    	 * @exception No se puede retirar cantidad negativa
    	 */
    	
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
