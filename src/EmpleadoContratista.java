public class EmpleadoContratista extends Empleado{


    public EmpleadoContratista(String nombre) {
        super(nombre);
    }


    @Override
    public double calcularPago(int horasTrabajadas, double precioPorHoraProyecto) {

        return horasTrabajadas*precioPorHoraProyecto;
    }

}
