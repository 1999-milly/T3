package c;
import java.util.ArrayList;
import java.util.List;
public class Computador{
    private String marca,modelo,processador,memoriaRam;
    private List<PlacaMae> placas=new ArrayList<>();

    public Computador(String marca,String modelo,String processador,String memoriaRam){
        this.marca=marca;
        this.modelo=modelo;
        this.processador=processador;
        this.memoriaRam=memoriaRam;
        System.out.println("Marca do computador: "+marca+" | Modelo: "+modelo+" | Processador: "+processador+" | Capacidade da memoria ram: "+memoriaRam);
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void addPlaca(PlacaMae placa){
        this.placas.add(placa);
        System.out.println("Placa-mae "+placa.getChipset()+" adicionada com sucesso");
    }

    public void atualizaPlaca(PlacaMae placa,String novoChipset){
        placa.setChipset(novoChipset);
        System.out.println("Novo chipset da placa igual a: ");
    }
    public void removePlaca(String fabricante,String chipset,String numSlots,String memSuportada){
        this.placas.remove(new PlacaMae(fabricante,chipset,numSlots,memSuportada));
        System.out.println("Placa-mae com shipset "+chipset+" removida com sucesso");
    }
    public void exibeInfo(){
        for(PlacaMae placa:placas){
            System.out.println("Computador "+modelo+" e sua placa-mae com numero de chipset igual a "+placa.getChipset()+" cadastrados");
        }
    }
}
