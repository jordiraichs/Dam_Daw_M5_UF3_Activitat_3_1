package local.damw;

public class Camio extends Automobil {
    private float pes_maxim; // Pes màxim autoritzat

    // constructor per defecte
    public Camio(){Automobil.totalAutos ++ ;}

    // constructor
    public Camio(String marca, String model, String matricula,float km ,float pes_maxim){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.km = km;
        this.pes_maxim = pes_maxim;
        Automobil.totalAutos ++ ;
    }
    
    // sobrecarreguem el mètode mostrarDades() de la clase pare 
    @Override
    public String mostrarDades(){
        return super.mostrarDades() + "\n pes maxim :" + this.pes_maxim ;    
    }

    // implementem consumBenzina
    @Override
    public float consumBenzina(float litresX100) {
       return (this.km * litresX100)/100;
    }


}
