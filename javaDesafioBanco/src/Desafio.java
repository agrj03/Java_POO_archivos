import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //inicializo  variables
        String usuario = "Tony Montana";
        String tipoDeCuenta = "Standar";
        double saldoCuenta = 1599.99;
        double valorARetirar = 0;

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println(String.format("""
                ****************************************
                
                Nombre del cliente: %s
                El tipo de cuenta es: %s
                Su saldo disponible es: $%.2f MXN
                
                ****************************************
                """, usuario, tipoDeCuenta, saldoCuenta));

        String menu = """
                **** Escriba el número de la opción deseada ****
                1.- Consultar saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;

        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(String.format("El saldo actual de la cuenta es de %f", saldoCuenta));
                    break;
                case 2:
                    System.out.println("Monto a retirar: ");
                    valorARetirar = teclado.nextDouble();
                    if (saldoCuenta < valorARetirar){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }else {
                        saldoCuenta = saldoCuenta - valorARetirar;
                        System.out.println("Saldo actualizado.");
                    }
                    break;
                case 3:
                    System.out.println("Dígite el monto a depósitar: ");
                    double valorADepositar = teclado.nextDouble();
                    if (valorADepositar >= 1){
                        saldoCuenta += valorADepositar;
                        System.out.println("Saldo actualizado.");
                    }else {
                        System.out.println("Ingrese un monto correcto.");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por su preferencia.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;

            }//switch
        }

    }//fin main
}
