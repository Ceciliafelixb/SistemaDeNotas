
package sistemadenotas;

import java.util.Scanner;

public class SistemadeNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int numeroAlunos = 20;
        String[] nome = new String[numeroAlunos];
        double[] n1 = new double[numeroAlunos];
        double[] n2 = new double[numeroAlunos];
        double[] nota = new double[numeroAlunos];
        int posicao = 0;
        char opcao;
        int i, j;
        int num;
        String auxSTR;
        double auxDBL;
        boolean houve_troca;

        opcao = 0;
        do {
            System.out.println("[I] Para Incluir");
            System.out.println("[A] Para Alterar");
            System.out.println("[E] Para Excluir");
            System.out.println("[L] Para Listar");
            System.out.println("[O] Para Ordenar");
            System.out.println("[P] Para Pesquisar por Nome");
            System.out.println("[S] Sair do Programa");
            System.out.println();
            System.out.println("Escolha uma opção:");
            opcao = teclado.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'I': {

                    if (posicao < numeroAlunos) {
                        System.out.println("Entre com o nome do aluno:");
                        nome[posicao] = teclado.next();
                        System.out.println("Entre com a primeira nota:");
                        n1[posicao] = teclado.nextDouble();
                        System.out.println("Entre com a segunda nota:");
                        n2[posicao] = teclado.nextDouble();
                        nota[posicao] = (n1[posicao] + n2[posicao]) / 2;

                        posicao++; // incrementa valor na variavel posição
                        break;
                    } else {
                        System.out.println("Não é possível incluir mais alunos");

                    }

                }

                case 'L': {
                    for (i = 0; i < posicao; i++) {

                        System.out.println("[" + (i + 1) + "}" + nome[i]);
                        System.out.println("Nota 1:" + n1[i]);
                        System.out.println("Nota 2:" + n2[i]);
                        System.out.println("Media Final :" + nota[i]);
                        System.out.println();
                    }
                    break;

                }
                case 'A': {
                    for (i = 0; i < posicao; i++) {

                        System.out.println("[" + (i + 1) + "}" + nome[i]);
                        System.out.println("Nota 1:" + n1[i]);
                        System.out.println("Nota 2:" + n2[i]);
                        System.out.println("Media Final :" + nota[i]);
                        System.out.println();

                    }
                    System.out.println("Escolha o número para alterar");
                    num = teclado.nextInt();
                    num--;// para trocar de posição
                    System.out.println("Entre com o nome do aluno:");
                    nome[num] = teclado.next();
                    System.out.println("Entre com a primeira nota:");
                    n1[num] = teclado.nextDouble();
                    System.out.println("Entre com a segunda nota:");
                    n2[num] = teclado.nextDouble();
                    nota[num] = (n1[num] + n2[num]) / 2;

                    break;

                }
                case 'E': {
                    for (i = 0; i < posicao; i++) {

                        System.out.println("[" + (i + 1) + "}" + nome[i]);
                        System.out.println("Nota 1:" + n1[i]);
                        System.out.println("Nota 2:" + n2[i]);
                        System.out.println("Media Final :" + nota[i]);
                        System.out.println();

                    }
                    System.out.println("Escolha um número para excluir");
                    num = teclado.nextInt();
                    num--;

                    for (i = num; i < (posicao - 1); i++) {

                        nome[i] = nome[i + 1];
                        n1[i] = n1[i + 1];
                        n2[i] = n2[i + 1];
                        nota[i] = nota[i + 1];

                    }
                    posicao--;
                    break;

                }
                case 'O': {
                    System.out.println("Estamos Ordenando...Cheque em Listar");
                    houve_troca = true;
                    for (i = 1; (i < posicao) && (houve_troca); i++) {
                        houve_troca = false;
                        for (j = 0; j < posicao - 1; j++) {
                            
                          if (nome[j].compareTo(nome[j+1]) >0)  {
                                
                                //Ordenar Vetor De Nomes
                                auxSTR = nome[j];
                                nome[j] = nome[j + 1];
                                nome[j + 1] = auxSTR;
                              
                                //Ordenar Vetor de Notas N1
                                auxDBL = n1[j];
                                n1[j]  = n1[j +1];
                                n1[j + 1] = auxDBL;
                             
                                // Ordenar Vetor de Notas N2
                                auxDBL = n2[j];
                                n2[j] = n2[j+1];
                                n2[j + 1] = auxDBL;
                                
                                //Ordenar Vetor de Media Final - nota
                                auxDBL = nota[j];
                                nota[j] = nota[j+1];
                                nota[j + 1] = auxDBL;
                                houve_troca = true;
                            }

                        }

                    }
                    
                }
                break;

            }

        } while (opcao != 'S');

    }

}
