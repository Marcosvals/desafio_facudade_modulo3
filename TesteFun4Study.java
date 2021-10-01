
/**
 * Escreva uma descrição da classe TesteFun4Study aqui.
 * 
 * @author Marcos Vinicius
 * @version (um número da versão ou uma data)
 */


public class TesteFun4Study
{

    public static void main(String[] args){
        
        //Cria um objeto chamado cidade1//
        System.out.println("Por Favor, cadastre a cidade 1:");
        Cidade cidade1 = new Cidade(Teclado.leInt("Codigo: "),
                                    Teclado.leString("Descrição: "),
                                    Teclado.leString("UF:"));
                                    
        //Cria um objeto estundante1 dentro da cidade1//
        System.out.println("Por Favor, cadaste o estudante 1");
        Estudante estudante1 = new Estudante (Teclado.leInt("Codigo: "),
                                              Teclado.leString("Nome:"),
                                              Teclado.leString("Data de Nascimento:"),
                                              Teclado.leString("E-mail: "),
                                              Teclado.leString("Senha: "), cidade1);
        //Atualizar a senha do estudante1//
        String senhaAnterior = Teclado.leString("Informe a senha anterior do estudante 1: ");
        if((estudante1.getSenha()).equals(senhaAnterior)){
            String novaSenha = Teclado.leString("Informe a nova senha: ");
            String repeteNovaSenha = Teclado.leString("Repita a nova senha:");
            if(novaSenha.equals(repeteNovaSenha)){
                estudante1.setSenha(novaSenha);
            }
            else{
                System.out.println("Não foi possivel altera a senha!");
                System.out.println("A senhas digitadas não são iguais!");
            }
        }else{
            System.out.println("Não foi possivel altera a senha!!");
            System.out.println("A senha digitada não é igual a cadastrada!");
        }
        
        //Cria um objeto estudante2 dentro da cidade1//
        System.out.println("Por Favor, cadaste o estudante 2");
        Estudante estudante2 = new Estudante (Teclado.leInt("Codigo: "),
                                              Teclado.leString("Nome:"),
                                              Teclado.leString("Data de Nascimento:"),
                                              Teclado.leString("E-mail: "),
                                              Teclado.leString("Senha: "), cidade1);
                                              
        //Atualizar a senha do estudante2//
        senhaAnterior = Teclado.leString("Informe a senha anterior do estudante 2: ");
        if((estudante2.getSenha()).equals(senhaAnterior)){
            String novaSenha = Teclado.leString("Informe a nova senha: ");
            String repeteNovaSenha = Teclado.leString("Repita a nova senha:");
            if(novaSenha.equals(repeteNovaSenha)){
                System.out.println("Senha alterada com sucesso!!!");
                estudante2.setSenha(novaSenha);
            }
            else{
                System.out.println("Não foi possivel altera a senha!");
                System.out.println("A senhas digitadas não são iguais!");
            }
        }else{
            System.out.println("Não foi possivel altera a senha!!");
            System.out.println("A senha digitada não é igual a cadastrada!");
        }
        
        System.out.println();//Pula uma linha para deixa mais organizado a exibição//
        cidade1.exibeDados();
        System.out.println();
        estudante1.exibeDados();
        System.out.println();
        estudante2.exibeDados();
        System.out.println();
        
        //Cria um objeto chamado cidade2//
        System.out.println("Por Favor, cadastre a cidade 2:");
        Cidade cidade2 = new Cidade(Teclado.leInt("Codigo: "),
                                    Teclado.leString("Descrição: "),
                                    Teclado.leString("UF:"));
        
        //Cria um objeto estudante3 dentro da cidade2//
        System.out.println("Por Favor, cadaste o estudante 3");
        Estudante estudante3 = new Estudante (Teclado.leInt("Codigo: "),
                                              Teclado.leString("Nome:"),
                                              Teclado.leString("Data de Nascimento:"),
                                              Teclado.leString("E-mail: "),
                                              Teclado.leString("Senha: "), cidade2);
        
        //Atualizar a senha do estudante3//
        senhaAnterior = Teclado.leString("Informe a senha anterior do estudante 3: ");
        if((estudante3.getSenha()).equals(senhaAnterior)){
            String novaSenha = Teclado.leString("Informe a nova senha: ");
            String repeteNovaSenha = Teclado.leString("Repita a nova senha:");
            if(novaSenha.equals(repeteNovaSenha)){
                System.out.println("Senha alterada com sucesso!!!");
                estudante3.setSenha(novaSenha);
            }
            else{
                System.out.println("Não foi possivel altera a senha!");
                System.out.println("A senhas digitadas não são iguais!");
            }
        }else{
            System.out.println("Não foi possivel altera a senha!!");
            System.out.println("A senha digitada não é igual a cadastrada!");
        }
        
        //Cria um objeto estudante4 dentro da cidade2//
        System.out.println("Por Favor, cadaste o estudante 4");
        Estudante estudante4 = new Estudante (Teclado.leInt("Codigo: "),
                                              Teclado.leString("Nome:"),
                                              Teclado.leString("Data de Nascimento:"),
                                              Teclado.leString("E-mail: "),
                                              Teclado.leString("Senha: "), cidade2);
                                              
        //Atualizar a senha do estudante4//
        senhaAnterior = Teclado.leString("Informe a senha anterior do estudante 4: ");
        if((estudante4.getSenha()).equals(senhaAnterior)){
            String novaSenha = Teclado.leString("Informe a nova senha: ");
            String repeteNovaSenha = Teclado.leString("Repita a nova senha:");
            if(novaSenha.equals(repeteNovaSenha)){
                System.out.println("Senha alterada com sucesso!!!");
                estudante4.setSenha(novaSenha);
            }
            else{
                System.out.println("Não foi possivel altera a senha!");
                System.out.println("A senhas digitadas não são iguais!");
            }
        }else{
            System.out.println("Não foi possivel altera a senha!!");
            System.out.println("A senha digitada não é igual a cadastrada!");
        }
        
        System.out.println();//Pula uma linha para deixa mais organizado a exibição//
        cidade2.exibeDados();
        System.out.println();
        estudante3.exibeDados();
        System.out.println();
        estudante4.exibeDados();
        System.out.println();
    }
}
