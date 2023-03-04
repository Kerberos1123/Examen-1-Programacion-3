
package examen._1_v3;


public class Ligre implements Animal,Animalia,Chordata, Mammalia, Carnivora, Felidae{

    @Override
    public void nombre() {
       System.out.println("\nNombre: Ligre");
    }

    @Override
    public void caracteristica() {
      System.out.println("el lomo y las patas suelen tener las rayas de los tigres, mientras\n" +
      "que la cabeza es más similar a la de un león; los machos incluso desarrollan melena");
    }

    @Override
    public void padres() {
     
        System.out.println("El ligre es el híbrido entre un leon macho y una tigresa hembra");
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
    public void esCarnivoro() {
   
        System.out.println("Este animal es de la orden Carnivora");
    }

    @Override
    public void esFelino() {
 
        System.out.println("Este animal es de la familia Felidae\n\n\n");
    }

   
    
}
