/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package line;

import java.util.Scanner;

/**
 *
 * @author lara
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Programação Dinâmica(1) ou Algoritmo Guloso(2)");
        int escolha1 = in.nextInt();
        if(escolha1 == 1){
            System.out.println("Caso 1, 2 ou 3?");
            int escolha2 = in.nextInt();
            if(escolha2 == 1){
                AssemblyLine assembly = new AssemblyLine(6);
                int resposta;
                int a[][] = {{7, 9, 3, 4, 8, 4}, {8, 5, 6, 4, 5, 7}};
                //No método carAssembly, os tempos t começam a ser percorridos a partir da coluna 1
                //Dessa forma, apesar de termos apenas 5 tempos por linha, podemos preencher a coluna 0
                //com valores arbitrários, visto que nunca serão lidos. Fazemos isso com o intuito de
                //termos uma matriz t com o mesmo número de colunas 
                int t[][] = {{0,2, 3, 1, 3, 4}, {0,2, 1, 2, 2, 1}};
                int e[] = {2, 4}, x[] = {3, 2};

                resposta = assembly.carAssembly(a, t, e, x);
                System.out.println("Tempo gasto: "+resposta);
                assembly.ordem();
            }

            else if(escolha2 == 2){
                AssemblyLine assembly = new AssemblyLine(9);
                int resposta;
                int a[][] = {{ 5, 7, 10, 5, 9, 11, 9, 5, 2}, {6, 3, 9, 11, 4, 9, 3, 12, 4}};
                //No método carAssembly, os tempos t começam a ser percorridos a partir da coluna 1
                //Dessa forma, apesar de termos apenas 5 tempos por linha, podemos preencher a coluna 0
                //com valores arbitrários, visto que nunca serão lidos. Fazemos isso com o intuito de
                //termos uma matriz t com o mesmo número de colunas 
                int t[][] = {{0,3, 5, 4, 2, 7, 5, 8, 1}, {0,5, 3, 7, 5, 6, 2, 5, 2}};
                int e[] = {3, 2}, x[] = {6, 5};

                resposta = assembly.carAssembly(a, t, e, x);
                System.out.println("Tempo gasto: "+resposta);
                assembly.ordem();
            }

            else if(escolha2 == 3){
                AssemblyLine assembly = new AssemblyLine(8);
                int resposta;
                int a[][] = {{10, 6, 3, 8, 5, 3, 7, 12}, {3, 5,3, 7, 6, 4, 9, 10}};
                //No método carAssembly, os tempos t começam a ser percorridos a partir da coluna 1
                //Dessa forma, apesar de termos apenas 5 tempos por linha, podemos preencher a coluna 0
                //com valores arbitrários, visto que nunca serão lidos. Fazemos isso com o intuito de
                //termos uma matriz t com o mesmo número de colunas 
                int t[][] = {{0,4, 2, 7, 2, 5, 8, 2}, {0,6, 1, 7,3, 6, 4, 5}};
                int e[] = {5, 7}, x[] = {8, 9};

                resposta = assembly.carAssembly(a, t, e, x);
                System.out.println("Tempo gasto: "+resposta);
                assembly.ordem();
            }
        }
        else if(escolha1 == 2){
            System.out.println("Caso 1, 2 ou 3?");
            int escolha2 = in.nextInt();
            if(escolha2 == 1){
                System.out.print ("No. vertices:"); 
                int nVertices = in.nextInt();
                System.out.print ("No. arestas:"); 
                int nArestas = in.nextInt();
                System.out.print ("Raiz:"); 
                int raiz = in.nextInt();
                Grafo grafo = new Grafo (nVertices);
                System.out.println("Digite v1,v2 e peso: ");
                int v1,v2,peso;
                for (int i = 0; i < nArestas; i++) {
                    v1 = in.nextInt();
                    v2 = in.nextInt();
                    peso = in.nextInt();
                    grafo.insereAresta (v1, v2, peso);    
                }
                CaminhoMinimo dj = new CaminhoMinimo (grafo);
                dj.obterArvoreCMC(raiz);
                dj.calculaPeso();
                System.out.println("O peso total é: "+ dj.getPesoT());
                dj.imprimeCaminho (0, 13);
            }
            else if(escolha2 == 2){
                System.out.print ("No. vertices:"); 
                int nVertices = in.nextInt();
                System.out.print ("No. arestas:"); 
                int nArestas = in.nextInt();
                System.out.print ("Raiz:"); 
                int raiz = in.nextInt();
                Grafo grafo = new Grafo (nVertices);
                System.out.println("Digite v1,v2 e peso: ");
                int v1,v2,peso;
                for (int i = 0; i < nArestas; i++) {
                    v1 = in.nextInt();
                    v2 = in.nextInt();
                    peso = in.nextInt();
                    grafo.insereAresta (v1, v2, peso);    
                }
                CaminhoMinimo dj = new CaminhoMinimo (grafo);
                dj.obterArvoreCMC(raiz);
                dj.calculaPeso();
                System.out.println("O peso total é: "+ dj.getPesoT());
                dj.imprimeCaminho (0, 19);
            }
            else if(escolha2 == 3){
                System.out.print ("No. vertices:"); 
                int nVertices = in.nextInt();
                System.out.print ("No. arestas:"); 
                int nArestas = in.nextInt();
                System.out.print ("Raiz:"); 
                int raiz = in.nextInt();
                Grafo grafo = new Grafo (nVertices);
                System.out.println("Digite v1,v2 e peso: ");
                int v1,v2,peso;
                for (int i = 0; i < nArestas; i++) {
                    v1 = in.nextInt();
                    v2 = in.nextInt();
                    peso = in.nextInt();
                    grafo.insereAresta (v1, v2, peso);    
                }
                CaminhoMinimo dj = new CaminhoMinimo (grafo);
                dj.obterArvoreCMC(raiz);
                dj.calculaPeso();
                System.out.println("O peso total é: "+ dj.getPesoT());
                dj.imprimeCaminho (0, 17);
            }
        }
    }
}
