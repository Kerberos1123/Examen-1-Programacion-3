
package examen._1_v3;


public class Cebrasno implements Animal,Animalia, Chordata, Mammalia, Perissodactyla, Equidae{

    @Override
    public void nombre() {
        System.out.println("\nNombre: Cebrasno");
    
    }

    @Override
    public void caracteristica() {
    System.out.println("El cebrasno tiene una estructura ósea similar a la cebra, pero con pelaje gris, a excepción de las\n" +
    "patas, que presentan el patrón rayado sobre fondo blanco.");    
    }

    @Override
    public void padres() {
     
    System.out.println("El Cebrasno es el híbrido entre una cebra y un asno");
    }


    @Override
    public void esAnimalia() {
       System.out.println("Este animal es del reino Animalia");
    }

    @Override
    public void esChordata() {
       System.out.println("Este animal es de filo Chordata");
    }
    @Override
    public void esMamifero() {
      System.out.println("Este animal es la clase Mamalia");
    }

    @Override
    public void esPerissodactyla() {
    System.out.println("Este animal es de la orden Perissodactyla");
    }

    @Override
    public void esEquidae() {
    System.out.println("Este animal es de la familia Equidae\n\n\n");
    }
    
}
