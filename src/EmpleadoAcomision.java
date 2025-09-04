public class EmpleadoAcomision extends Empleado{

    private int cantidadDeClientes;
    private double comisionPorCliente;
    private double cantidadObjetivo = 800000;


    public EmpleadoAcomision(String nombre, int cantidadDeClientes, double comisionPorCliente) {
        super(nombre);
        this.cantidadDeClientes = cantidadDeClientes;
        this.comisionPorCliente = comisionPorCliente;
    }

    public EmpleadoAcomision() {
    }

    public int getCantidadDeClientes() {
        return cantidadDeClientes;
    }

    public void setCantidadDeClientes(int cantidadDeClientes) {
        this.cantidadDeClientes = cantidadDeClientes;
    }

    public double getComisionPorCliente() {
        return comisionPorCliente;
    }

    public void setComisionPorCliente(double comisionPorCliente) {
        this.comisionPorCliente = comisionPorCliente;
    }

    public double getCantidadObjetivo() {
        return cantidadObjetivo;
    }

    public void setCantidadObjetivo(double cantidadObjetivo) {
        this.cantidadObjetivo = cantidadObjetivo;
    }

    @Override
    public double calcularPago() {

        if (cantidadDeClientes*comisionPorCliente >= cantidadObjetivo){
            return cantidadDeClientes*comisionPorCliente;
        }else {
            return cantidadObjetivo;
        }

    }
}
