
/**
 * Escreva uma descrição da classe Cidade aqui.
 * 
 * @author Marcos Vinicius 
 * @version (um número da versão ou uma data)
 */
public class Cidade
{
    private int codigo;
    private String descricao;
    private String uf;
    private int quantidadeDeEstudantes;
    
    public Cidade(int codigo, String descricao, String uf){
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }
    
    public int adicionaNovoEstudante(){
        return quantidadeDeEstudantes += 1;
    }
    
    public void exibeDados(){
        System.out.println("Dados da cidade:");
        System.out.printf("Codigo: %d\n", codigo);
        System.out.printf("Descrição: %s\n", descricao);
        System.out.printf("UF: %s\n", uf);
        System.out.printf("Quantidade de estudantes: %d\n", quantidadeDeEstudantes);
    }
}    
