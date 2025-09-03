public class EmpleadoPorHoras extends Empleado {

    public EmpleadoPorHoras(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPago(int horasTrabajadas, double precioPorHora)
    {

        return horasTrabajadas*precioPorHora;
    }
}
