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
        data.setSaldo(sal);
    }

    public double estado()
    {
        return data.getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        data.setSaldo(data.getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        data.setSaldo(data.getSaldo() - cantidad);
    }
}
