public class Bijuteria extends Loja{
    double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;        
    }
    
    public double getMetaVendas(){
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    public String toString(){
        return String.format(
        "Nome da loja: "+this.getNome()+"\nQuantidade de Funcionarios: "+this.getQuantidadeFuncionarios()+"\nO salario base é: "+this.getSalarioBaseFuncionario()+"\nO endereço da loja é: "
        +this.getEndereco()+"\nA data de fundação é: "+this.getDataFundacao()+"\nA meta de venda é: "+this.getMetaVendas());       
    }
    
}