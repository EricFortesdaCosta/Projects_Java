public class Cosmetico extends Loja{
    double taxaComercializacao; 
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, double taxaComercializacao){
        super(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public String toString(){
        return String.format(
        "Nome da loja: "+this.getNome()+"\nQuantidade de Funcionarios: "+this.getQuantidadeFuncionarios()+"\nO salario base é: "+this.getSalarioBaseFuncionario()+"\nO endereço da loja é: "
        +this.getEndereco()+"\nA data de fundação é: "+this.getDataFundacao()+"E Com uma taixa de Comercializacão de: "+this.getTaxaComercializacao());       
    }
}  
