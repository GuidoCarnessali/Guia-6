public class EmpleadoPorHoras extends Empleado {


    private int horasTrabajadas;
    private double precioPorHora;


    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public EmpleadoPorHoras() {
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public double calcularPago()
    {

        return horasTrabajadas*precioPorHora;
    }
}
