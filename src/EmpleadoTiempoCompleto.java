public class EmpleadoTiempoCompleto extends Empleado {

    private int antiguedad;
    private double sueldoBasico;

    public EmpleadoTiempoCompleto(String nombre, int antiguedad, double sueldoBasico) {
        super(nombre);
        this.antiguedad = antiguedad;
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularPago() {

        if (antiguedad >= 2 && antiguedad <= 5)
        {
            sueldoBasico = sueldoBasico + sueldoBasico*0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10)
        {
            sueldoBasico = sueldoBasico + sueldoBasico*0.1;

        }else if (antiguedad >= 11 && antiguedad <= 15){

            sueldoBasico = sueldoBasico + sueldoBasico*0.15;
        }else if(antiguedad > 15){

            sueldoBasico = sueldoBasico+sueldoBasico*0.2;
        }

        return sueldoBasico;
    }
}
