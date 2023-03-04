package examen._1_v3;

import java.io.IOException;
import java.util.Scanner;



public class Examen_1_v3 {


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
        Scanner ss = new Scanner(System.in);
        
        int opcion;
        
        Narluga a1 = new Narluga();
        Ligre a2 = new Ligre();
        Tigón a3 = new Tigón();
        Cebrallo a4 = new Cebrallo();
        Cebrasno a5 = new Cebrasno();
        
    do{    
        
        System.out.println("----BIENVENIDO AL ZOOLOGICO----");
        System.out.println("Seleccione de cual animal quiere ver informacion");
        System.out.println("1- Narluga");
        System.out.println("2- Ligre");
        System.out.println("3- Tigon");
        System.out.println("4-Cebrallo");
        System.out.println("5- Cebrasno");
        System.out.println("6- Salir");
        
//        String answ1 = ss.nextLine(); //Obtengo Texto

        opcion = ss.nextInt();
        
        
        switch(opcion){
            
            case 1:
                
                a1.nombre();
                System.out.println("");
                a1.caracteristica();
                System.out.println("");
                a1.padres();
                System.out.println("");
                a1.esAnimalia();
                System.out.println("");
                a1.esChordata();
                System.out.println("");
                a1.esMamifero();
                System.out.println("");
                a1.esArtiodactyla();
                System.out.println("");
                a1.esMonodontidae();
                System.out.println("");
                
            break;
            
            case 2:
                a2.nombre();
                System.out.println("");
                a2.caracteristica();
                System.out.println("");
                a2.padres();
                System.out.println("");
                a2.esAnimalia();
                System.out.println("");
                a2.esChordata();
                System.out.println("");
                a2.esMamifero();
                System.out.println("");
                a2.esCarnivoro();
                System.out.println("");
                a2.esFelino();
                System.out.println("");
                
                
            break;
            
            case 3:
                
                a3.nombre();
                System.out.println("");
                a3.caracteristica();
                System.out.println("");
                a3.padres();
                System.out.println("");
                a3.esAnimalia();
                System.out.println("");
                a3.esChordata();
                System.out.println("");
                a3.esMamifero();
                System.out.println("");
                a3.esCarnivoro();
                System.out.println("");
                a3.esFelino();
                System.out.println("");
                
            break;
            
            case 4:
                
                a4.nombre();
                System.out.println("");
                a4.caracteristica();
                System.out.println("");
                a4.padres();
                System.out.println("");
                a4.esAnimalia();
                System.out.println("");
                a4.esChordata();
                System.out.println("");
                a4.esMamifero();
                System.out.println("");
                a4.esPerissodactyla();
                System.out.println("");
                a4.esEquidae();
                System.out.println("");
                
            break;
            
            case 5:
                
                a5.nombre();
                System.out.println("");
                a5.caracteristica();
                System.out.println("");
                a5.padres();
                System.out.println("");
                a5.esAnimalia();
                System.out.println("");
                a5.esChordata();
                System.out.println("");
                a5.esMamifero();
                System.out.println("");
                a5.esPerissodactyla();
                System.out.println("");
                a5.esEquidae();
                System.out.println("");
                
                
            break;
           
            case 6: 
            System.out.println("Exiting Program...");
            System.exit(0);
            break;
            
            
            default :
            System.out.println("This is not a valid Menu Option! Please Select Another");
            break;
      
        }
        
        
    }while(true);
        
        
        
        
    }
    
}
