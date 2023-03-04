
package examen._1_v3;


public class Tigón implements Animal, Animalia,Chordata, Mammalia, Carnivora, Felidae{

    @Override
    public void nombre() {
        System.out.println("\nNombre: Tigon");
    }

    @Override
    public void caracteristica() {
     System.out.println("el tigón es más pequeño que sus\n" +
     "progenitores y tiene la apariencia de un león con el pelaje rayado");
     
    }

    @Override
    public void padres() {
       System.out.println("El tidon es el híbrido entre un leon hembra y un tigre macho");
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
