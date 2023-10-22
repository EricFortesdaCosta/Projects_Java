public class Principal{
    public static void main(String[] args){
        int menu = Teclado.leInt("Digite: \n(1) Criar Loja\n(2) Criar Produto\n (3)Sair\n");
        if (menu == 1){
            //Classe Loja.            
            String nomeLoja = Teclado.leString("Digite o nome da Loja: ");
            int quantiFunLoja = Teclado.leInt("Digite a quantidade de Funcionarios: ");
            double salaBaseLoj = Teclado.leDouble("Digite a base dos Salarios");
            
            // Criando o Endereço da Loja.
            Endereco enderecoloja = new Endereco(Teclado.leString("Digite nome da Rua: "),
            Teclado.leString("Digite a Cidade em que se encontra: "),
            Teclado.leString("Qual o Estado que se encontra: "),
            Teclado.leString("Digite o Pais: "),
            Teclado.leString("Digite o CEP da Loja: "),
            Teclado.leString("Digite o numero da Loja: "),
            Teclado.leString("Se houver digite o Complemento: "));
            
            Data dataLoja = new Data (Teclado.leInt("Digia o dia da Inauguração da loja: "),
            Teclado.leInt("Digite o Mes da Inauguração da loja: "),
            Teclado.leInt("Digite o Ano de Inauguração da loja: "));
            
        }
        else if (menu == 2){
            //Criação do objeto produto.
            String nomeProdu = Teclado.leString("Digite o nome do novo produto: ");
            double precoProdu = Teclado.leDouble("Digite o Preço do novo produto: ");
            
            //Data do produto.
            System.out.println("%% DATA DE VALIADE DO PRODUTO %%");
            Data dataValiUm = new Data (Teclado.leInt("Dia: "),
            Teclado.leInt("Mês: "),
            Teclado.leInt("Ano: "));
            
            Produto produtoUm = new Produto(nomeProdu, precoProdu, dataValiUm);
            if (  produtoUm.getDataValidade().getDia() ==20){
                if( produtoUm.getDataValidade().getMes() == 10 && produtoUm.getDataValidade().getAno() == 23){
                    System.out.println("O produto está vencido");
                }
            }else{
                System.out.println("O produto está no prazo de valida");
            }
        }else if (menu == 3){
            System.out.println("Certo\nO programa será fechado");
        }else{
            System.out.println("OPÇÃO INVALIDA");
        }
    }
}