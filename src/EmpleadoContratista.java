public class EmpleadoContratista extends Empleado{

    private int horasTrabajadas;
    private double precioPorHoraProyecto;

    public EmpleadoContratista(String nombre, int horasTrabajadas, double precioPorHoraProyecto) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHoraProyecto = precioPorHoraProyecto;
    }

    public EmpleadoContratista() {
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioPorHoraProyecto() {
        return precioPorHoraProyecto;
    }

    public void setPrecioPorHoraProyecto(double precioPorHoraProyecto) {
        this.precioPorHoraProyecto = precioPorHoraProyecto;
    }

    @Override
    public double calcularPago() {

        return horasTrabajadas*precioPorHoraProyecto;

    }

}
