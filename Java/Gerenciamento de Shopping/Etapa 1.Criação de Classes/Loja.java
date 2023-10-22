public class Loja
{
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;           
     }
    
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
    }

