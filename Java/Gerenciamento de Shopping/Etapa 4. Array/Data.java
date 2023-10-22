public class Data{
    int dia;
    int mes;
    int ano;
    
    //Contrutores da Data
    public Data(int dia, int mes, int ano){
        if (verificarData(dia, mes, ano)){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } else{
        System.out.println("dataInvalida. Definida para data padrão: 01/01/2000.");{
            this.dia = 01;
            this.mes = 01;
            this.ano = 2000;
        }
    }
    }

    //Metodos de acesso
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    //Metodo que verifica a data
    public boolean verificarData(int dia, int mes, int ano){
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        
        int [] diasPorMes = {0, 31,28, 31,30,31,30,31,31,30,31,30,31};
        
        if(ano % 4 ==0 && (ano % 100 != 0 || ano % 400 ==0 )){
            diasPorMes[2] = 29;
        }
        
        return dia <= diasPorMes[mes];
    }
    
    //Metodo que verifica que o ano é ou não Bissexto
    public boolean verificaAnoBissexto(){
        if( ano % 4 == 0){
            return true;
        } else {
            return false;
        }
        
    }
}