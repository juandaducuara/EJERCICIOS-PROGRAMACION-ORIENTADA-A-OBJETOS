package Principal;
import java.util.Scanner;
import Salud.*;


public class Inicio 
{
    
    public static void main(String[]args)
    {
        int op;
        Scanner lectura= new Scanner(System.in);        
        Empleado empleado = new Empleado();
        do
        {
        System.out.println("\nBienvenido al menu de inicio\nelija una de las siguentes opcion\ningrese 1 si desea ingresar datos\nIngrese 2 si desea ver la informacion del usuario\nIngrese 3 si desea calcular su peso Actual\nIngrese 4 si desea Determinar si es mayor de edad\nIngrese 5 datos para calculo\nElija 6 si desea mostrar datos con calculo\nIngrese 7 para salir \n");
        op= lectura.nextInt();
        switch (op) {
            case 1:
             empleado.pedirDatos();
                break;
            case 2:
                empleado.mostraPersona();
                break;
            case 3:
                empleado.calcularmc();
                break;
            case 4:
                empleado.mayoredad();
                break;
            case 5:
                empleado.calcularHonorarios();
                break;
            case 7:
                System.out.println("Saliendo del programa");;
                break;       
        
            default:
             System.out.println("Dato invalido");
                break;
        }        
        }while(op!=7);
        lectura.close();
    }
    
    
}
