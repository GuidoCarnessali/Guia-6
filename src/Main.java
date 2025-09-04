import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5)
        {
            System.out.println();
            System.out.println("Bienvenido: ");
            System.out.println("1. Empleado a tiempo completo");
            System.out.println("2. Empleado por horas");
            System.out.println("3. Empleado contratista");
            System.out.println("4. Empleado a comision");
            System.out.println("5. Finalizar programa");
            System.out.println();
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion)
            {

                case 1:

                    EmpleadoTiempoCompleto a = new EmpleadoTiempoCompleto();
                    System.out.println("Ingrese el nombre: ");
                    a.setNombre(scan.nextLine());
                    System.out.println("Ingrese su antiguedad: ");
                    a.setAntiguedad(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Ingrese su sueldo: ");
                    a.setSueldoBasico(scan.nextDouble());
                    System.out.println("La paga es de: " + a.calcularPago());

                    ;


                    break;

                case 2:

                    EmpleadoPorHoras b = new EmpleadoPorHoras();
                    System.out.println("Ingrese el nombre: ");
                    b.setNombre(scan.nextLine());
                    System.out.println("Ingrese cuantas horas trabajo: ");
                    b.setHorasTrabajadas(scan.nextInt());
                    System.out.println("Ingrese la paga por hora: ");
                    b.setPrecioPorHora(scan.nextDouble());
                    System.out.println("La paga es de: " + b.calcularPago());

                    break;

                case 3:

                    EmpleadoContratista c = new EmpleadoContratista();
                    System.out.println("Ingrese su nombre");
                    c.setNombre(scan.nextLine());
                    System.out.println("Ingrese las horas trabajadas: ");
                    c.setHorasTrabajadas(scan.nextInt());
                    System.out.println("Precio por hora trabajada: ");
                    c.setPrecioPorHoraProyecto(scan.nextDouble());
                    System.out.println("La paga es de: " + c.calcularPago());

                    break;

                case 4:


                    EmpleadoAcomision d = new EmpleadoAcomision();
                    System.out.println("Ingrese el nombre: ");
                    d.setNombre(scan.nextLine());
                    System.out.println("Ingrese la cantidad de clientes atraidos o captados: ");
                    d.setCantidadDeClientes(scan.nextInt());
                    System.out.println("Ingrese la cantidad por cliente: ");
                    d.setComisionPorCliente(scan.nextDouble());
                    System.out.println("La paga es de: " + d.calcularPago());

                    break;

            }


        }

        System.out.println("Programa finalizado con exito. ");


    }
}