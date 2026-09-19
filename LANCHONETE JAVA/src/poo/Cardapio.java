package poo;

public class Cardapio {
    //Atributos
    public String descricao;
    public double valor;
    public int codigo;
    public char tamanho;

    //Métodos
    public void Pizzas(){

    }
    public void Sanduiches(){

    }
    public void Bebidas(){

    }

    //Métodos especiais
      //Construtor
    public Cardapio(String descricao, double valor, int codigo, char tamanho) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
        this.tamanho = tamanho;
    }
      //Geters & Seters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

 

}
