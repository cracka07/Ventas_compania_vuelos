package empresa_vuelos;

import java.util.Scanner;

public class Empresa_vuelos {

    public static void main(String[] args) {
        int asientos[][] = new int[6][3];
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        String venta = "";
        int cantAsientos,numDestino,numVuelo;
        int disponible;

       
            for ( int i = 0; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese cantidad de asientos: ");
                       asientos[i][j]=scan.nextInt();

                    }
                }

            

        
        System.out.println("----BIENVENIDO A LA COMPAÑIA DE VUELO SLATANFLY------");
        System.out.println("");

        while (!venta.equals("finish")) {

            System.out.println("Ingrese por favor el número de destino que quiere dirigirse, \n siendo 0-Rio Janeiro, 1-Cancún, 2-Madrid, 3-Roma, 4-Milán, 5-Iguazu");
            numDestino = scan.nextInt();
            System.out.println("Ingrese el número de vuelo, 0-Mañana, 1-Mediodía, 2-Noche: ");
            numVuelo = scan.nextInt();
            System.out.println("Ingrese la cantidad de pasaje que necesita: ");
            cantAsientos = scan.nextInt();
           
            if(numDestino>=0 && numDestino<6){
                if(numVuelo>=0 && numVuelo<3){
                     if(asientos[numDestino][numVuelo]>=cantAsientos){
                disponible=asientos[numDestino][numVuelo]-cantAsientos;
                System.out.println("Su reserva se realizó con exito");
                System.out.println("Quedan disponibles: " + disponible + " asientos");
            } 
                }else{
                    System.out.println("Horarios para vuelo no encontrado, ingrese nuevamente");
                }
            }else{
                System.out.println("Destino no encontrado, ingrese nuevamente");
            }
          

            System.out.println("Desea hacer una reserva? Si desea continuar presione cualquier tecla de lo contrario presione finish : ");
            venta = scan1.nextLine();

        }
    }

}
