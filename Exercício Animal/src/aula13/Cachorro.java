
package aula13;

public class Cachorro extends Lobo{
    //Métodos
    public void reagir(String frase){
       if(frase.equals("Toma comida")|| frase.equals("Ola")){
           System.out.println("Abanar e Latir");
           this.EmitirSom();
       }else{
           System.out.println("Rosnar");
       }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
            this.EmitirSom();
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
            this.EmitirSom();
        }
    }
    public void reagir(int idade, float peso){
       if(idade < 5){
           System.out.println("Abanar");
       }else{
           System.out.println("Latir");
           this.EmitirSom();
       }
       
       if(peso < 18){
           System.out.println("Rosnar");
       }else{
           System.out.println("Ignorar");
       }
    }
    // Métodos especiais
    @Override
    public void EmitirSom(){
        System.out.println("Au Au Au Au");
    }
}
