import cuentas.CCuentaData;

public class CCuenta {


    private CCuentaData data = new CCuentaData();

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        data.setNombre(nom);
        data.setCuenta(cue);
        data.saldo=sal;
    }

    public double estado()
    {
        return data.saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        data.saldo = data.saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        data.saldo = data.saldo - cantidad;
    }
}
