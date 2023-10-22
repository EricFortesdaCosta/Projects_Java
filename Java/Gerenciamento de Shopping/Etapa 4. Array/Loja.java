public class Loja{
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    Endereco endereco;
    Data dataFundacao;
    
    //Dois Contrutores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
     }
    
    public Loja(String nome, int quantidadeFuncionarios,Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }
     
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
         this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public double gastosComSalario(){
        if (this.salarioBaseFuncionario == -1){
            return -1;
        } else {
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
    }
    
    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios < 10)
            return 'P';
        else if (this.quantidadeFuncionarios >= 10 || this.quantidadeFuncionarios <= 30)
            return 'M';
        else if (this.quantidadeFuncionarios > 30)
            return 'G';
        else
            return 'X';
    }
    
    public String toString(){
        return String.format(
        "Nome da loja: "+this.getNome()+"\nQuantidade de Funcionarios: "+this.getQuantidadeFuncionarios()+"\nO salario base é: "+this.getSalarioBaseFuncionario()+"\nO endereço da loja é: "
        +this.getEndereco()+"\nA data de fundação é: "+this.getDataFundacao());       
    }
    }

