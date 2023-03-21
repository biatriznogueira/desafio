package desaio;

import java.util.Scanner;

public class desafio_pt1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] nome = new String[20];
        String[] telefone = new String[20];
        int opcao;
        int posicao=0;
        String excluirNome;


        do { System.out.println(" Menu Principal");
            System.out.println(" Informe a opção desejada ou 99 prara sair: ");
            System.out.println("1= Cadastrar novo contato da agenda");
            System.out.println("2= Excluir contato da Agenda");
            System.out.println("3= Listar contatos da Agenda");
            System.out.println("4= Limpar todos os contatos da Agenda");

            opcao = input.nextInt();

            switch (opcao) {


                case 1:
                    System.out.println("Cadastrar Novo Contato da Agenda");
                    input.nextLine();

                    System.out.println("Digite o Nome:");
                    nome[posicao] = input.nextLine();

                    System.out.println("Digite o Telefone:");
                    telefone[posicao] = input.nextLine();

                    posicao++;
                    break;


                case 2:
                    System.out.println("Excluir contato da agenda");
                    input.nextLine();


                    System.out.println("Ecolha o contato para exculir: ");
                    excluirNome = input.nextLine();


                    boolean depois = false;
                    for (int i = 0; i < 20; i++) {
                        if (nome[i] != null) {

                            if(depois) {
                                nome[i-1] = nome[i];
                                telefone[i-1] = nome[i];

                            }

                            if (nome[i].equals(excluirNome)) {
                                depois=true;
                                System.out.println("Contato excluido!");
                                nome[i] = null;
                                telefone[i] = null;
                            }

                        }

                    }
                    break;


                //listar contatos
                case 3:
                    System.out.println("listar contatos da Agenda");
                    input.nextLine();

                    System.out.println("Está é sua Lista De Contatos: ");


                    for (int i = 0; i < 20; i++) {
                        if (nome[i] != null) {
                                                          //bilhete[i]           
                            System.out.println(" Nome: " + nome[i] + "    " + "Telefone: " + telefone[i] + "    ");


                        }

                    }
                    break;


                case 4:
                    System.out.println("limpar todos os contatos");
                    input.nextLine();

                    System.out.println("Lista De contatos vazia");

                    for (int i = 0; i < 20; i++) {

                        nome[i] = null;
                        telefone[i] = null;


                    } break;

                case 99:
                    System.out.println("programa finalizado com Sucesso!");
                    break;

                default:
                    System.out.println("opçao invalida. Tente novamente");


            }
        } while (opcao!=99);









            }




}



