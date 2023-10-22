public class Vestuario extends Loja{
    boolean produtosImportados;
    
    public Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao , boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    public String toString(){
        return String.format(
        "Nome da loja: "+this.getNome()+"\nQuantidade de Funcionarios: "+this.getQuantidadeFuncionarios()+"\nO salario base é: "+this.getSalarioBaseFuncionario()+"\nO endereço da loja é: "
        +this.getEndereco()+"\nA data de fundação é: "+this.getDataFundacao()+"\nO produto é : "+this.getProdutosImportados());       
    }
    
}