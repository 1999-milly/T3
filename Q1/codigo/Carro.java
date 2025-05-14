package Carro;
public class Carro{
    private String descricao;

    public Carro(String descricao){
        this.descricao=descricao;
        System.out.println("Descricao do carro: "+descricao);
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
