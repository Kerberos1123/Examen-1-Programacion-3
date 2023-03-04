
package examen._1_v3;




public class Narluga implements Animal,Animalia,Chordata,Artiodactyla, Monodontidae,Mammalia{
    
    @Override
    public void nombre() {
        System.out.println("\nNombre: Narluga");
    }


    @Override
    public void caracteristica() {
       System.out.println("Solo se puede observar en las aguas árticas. Este híbrido mide hasta 6 metros de largo\n" +
       "y pesa alrededor de 1600 kg. Presenta una tonalidad bicolor gris y blanco");
    }

    @Override
    public void padres() {
       System.out.println("La Nargula es el híbrido entre un narval y una beluga");
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
    public void esArtiodactyla() {
        
        System.out.println("Este animal es de la orden Artiodactyla");
    }

    @Override
    public void esMonodontidae() {
       
        System.out.println("Este animal es de familia Monodontidae\n\n\n");
    }
    
}
