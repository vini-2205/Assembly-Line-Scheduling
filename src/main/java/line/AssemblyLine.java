/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package line;

// A java program to find minimum possible
// time by the car chassis to complete

public class AssemblyLine {
     
    private int NUM_STATION;
    private int linha;
    private int resposta[][];

    public AssemblyLine(int station){
        this.NUM_STATION = station;
        this.resposta = new int [2][NUM_STATION];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

 

    // Utility function to find minimum of two numbers
    static int min(int a, int b) {
        return a < b ? a : b;

    }

    public int carAssembly(int a[][], int t[][], int e[], int x[]) {
        int T1[] = new int[this.NUM_STATION];
        int T2[] = new int[this.NUM_STATION];

        // time taken to leave first station in line 1
        T1[0] = e[0] + a[0][0];

        // time taken to leave first station in line 2
        T2[0] = e[1] + a[1][0];

        // Fill tables T1[] and T2[] using
        // the above given recursive relations
        for (int i = 1; i < this.NUM_STATION; ++i) {
            if (T1[i - 1] + a[0][i] <= T2[i - 1] + t[1][i] + a[0][i]) {
                T1[i] = T1[i - 1] + a[0][i];
                this.resposta[0][i] = 1;
            } else {
                T1[i] = T2[i - 1] + t[1][i] + a[0][i];
                this.resposta[0][i] = 2;
            }

            if (T2[i - 1] + a[1][i] <= T1[i - 1] + t[0][i] + a[1][i]) {
                T2[i] = T2[i - 1] + a[1][i];
                this.resposta[1][i] = 2;
            } else {
                T2[i] = T1[i - 1] + t[0][i] + a[1][i];
                this.resposta[1][i] = 1;
            }
        }

        int f;
        // Consider exit times and return minimum
        if ((T1[this.NUM_STATION - 1] + x[0]) <= (T2[this.NUM_STATION - 1] + x[1])) {
            f = T1[this.NUM_STATION - 1] + x[0];
            linha = 1;
        } else {
            f = T1[this.NUM_STATION - 1] + x[1];
            linha = 2;
        }

        return f;
    }
    
    public void ordem(){
        System.out.println("O caminho percorrido é: ");
        System.out.println("line " + linha + " station " + this.NUM_STATION);
        for (int j = this.NUM_STATION - 1; j > 0; j--) {
            if (linha == 1) {
                linha = this.resposta[0][j];
            } else if (linha == 2) {
                linha = this.resposta[1][j];
            }
            System.out.println("line " + linha + " station " + (j));
        }
    }
    
}