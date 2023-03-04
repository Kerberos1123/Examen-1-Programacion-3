
package examen._1_v3;


public class Cebrallo implements Animal,Animalia, Chordata, Mammalia, Perissodactyla, Equidae{

    @Override
    public void nombre() {
     
     System.out.println("\nNombre: Cebrallo");
    }

    @Override
    public void caracteristica() {
        
          System.out.println("El cebrallo es más pequeño que un caballo, con una crin escasa y rígida. Sobre el pelaje, con fondo\n" +
         "de distintos colores, se observan las rayas típicas de las cebras");
       }

    @Override
    public void padres() {
       System.out.println("El Cebrasno es el híbrido entre una cebra y un caballo");
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
