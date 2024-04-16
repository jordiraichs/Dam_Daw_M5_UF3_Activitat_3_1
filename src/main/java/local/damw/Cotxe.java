package local.damw;

public class Cotxe extends Automobil {
    String combustible; // Diesel, Gasolina, Hybrid, Elèctric

    // constructor per defecte
    public Cotxe(){Automobil.totalAutos ++ ;}

    // constructor
    public Cotxe(String marca, String model, String matricula,float km ,String combustible){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.km = km;
        this.combustible = combustible;
        Automobil.totalAutos ++ ;
    }
    
    // sobrecarreguem el mètode mostrarDades() de la clase pare 
    @Override
    public String mostrarDades(){
        return super.mostrarDades() + "\n combustible : " + this.combustible;
    }

    // implementem el mètode ABSTRACTE 
    @Override
    public float consumBenzina(float litresX100){
        float consum = 0;
        if(this.combustible == "Diesel" || this.combustible == "Gasolina"){
            consum = (this.km * litresX100)/100;
        } else if (this.combustible == "Hybrid"){
            consum = (float) ((this.km * litresX100 * 0.5)/100); // consumeixen la meitat
        } else{
            consum = 0;
        }
        return consum;
    }

}