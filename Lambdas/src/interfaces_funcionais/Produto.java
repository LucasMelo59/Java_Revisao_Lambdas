package interfaces_funcionais;

public class Produto {

    public String nome;
    public double price;
    public double desconto;

    public Produto(String nome, double price, double desconto) {
        this.nome = nome;
        this.price = price;
        this.desconto = desconto;
    }

    public String toString(){
        double precoTotal = price * (1 - desconto);
        return "Nome: " +  nome + " tem preco de R$ " + precoTotal;
    }
}
