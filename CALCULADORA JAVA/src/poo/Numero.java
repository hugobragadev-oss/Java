package poo;

public class Numero {
    //Atributos
    private double x;

    //Métodos

     public double soma(double x, double y){
        setX(x + y);
        return getX();
    }
     public double subtracao(double x, double y){
        setX(x - y);
        return getX();
    }
     public double divisao(double x, double y){
        setX(x / y);
        return getX();
    }
     public double multiplicacao(double x, double y){
        setX(x * y);
        return getX();
    }

    //Métodos especiais
      private double getX() {
        return x;
      }

      private void setX(double x) {
        this.x = x;
      }

}
