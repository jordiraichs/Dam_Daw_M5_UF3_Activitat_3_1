package local.damw;

public class Main {
    public static void main(String[] args) {
      
        Cotxe a1 = new Cotxe("Audi", "Q3","1232HLZ",10000,"Hybrid");
        System.out.println(a1.mostrarDades());  // crida a mostrar cotxe
        System.out.println(" Litres consumits : " + a1.consumBenzina(7));

    }
}