public class Produto{
    String nome;
    double preco;
    Data dataValidade;
    
    //Contrutores do Produto
    public Produto(String nome, double preco,Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    //Metodos de Acesso 
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    //Metodo que define se está ou não Vencido
    public boolean estaVencido(Data data){
        if (data.getAno() > this.dataValidade.getAno()) {
            return true;          
        }
        else if(data.getAno() == this.dataValidade.getAno() && data.getMes() > this.dataValidade.getMes()){          
            return true;
        }        
            
        else if(data.getMes() == this.dataValidade.getMes() && data.getDia() >= this.dataValidade.getDia()){
            return true;
        }
        else {
            return false;
        }
    }
    
    //Metodo de Formatação
    public String toString(){
        return String.format(
        "Nome do Produto: "+this.nome+"Preço: "+this.preco+"\nValidade:"+this.getDataValidade());
    }
}
