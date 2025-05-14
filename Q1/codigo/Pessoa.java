package Carro;
public class Pessoa{
    private String nome;

    public Pessoa(String nome){
        this.nome=nome;
        System.out.println("Nome da pessoa: "+nome);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void usarCarro(Carro carro){
        System.out.println("Carro "+carro.getDescricao()+" sendo usado pela pessoa "+nome);
    }
}
