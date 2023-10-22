public class Alimentacao extends Loja{
    Data dataAlvara;
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    public String toString(){
        return String.format(
        "Nome da loja: "+this.getNome()+"\nQuantidade de Funcionarios: "+this.getQuantidadeFuncionarios()+"\nO salario base é: "+this.getSalarioBaseFuncionario()+"\nO endereço da loja é: "
        +this.getEndereco()+"\nA data de fundação é: "+this.getDataFundacao()+"E a data do alvara é: "+this.getDataAlvara());       
    }
}