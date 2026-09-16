package aula13;

public class Mamifero extends Animal{
    
   //Atributos 
    protected String corPelo;
    
    
    
    
   //Métodos Abstratos
    @Override
    public void EmitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    
}
