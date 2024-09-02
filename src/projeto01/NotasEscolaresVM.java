package projeto01;

import java.util.Scanner;

public class NotasEscolaresVM {

    /**
     * Criar um algoritmo para receber as notas de 5 alunos de 4 bimestres,
     * a freq. do aluno e apresentar o resultado final considerando 
     * media >= 7 e freq >= 75%
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String alunos [][] = new String[5][2];
        float notas[][] = new float[5][6];
        
        System.out.println(".: Notas Escolares 2 :.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i+1) + "º aluno: ");
            alunos [i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a " + (j+1) + "ª nota ");
                notas [i][j] = ler.nextFloat();
                notas [i][5] += notas [i][j];
            }
            notas[i][5] = notas [i][5]/4;
            System.out.println("Digite a freq. do aluno " + alunos[i][0] + ": ");
            notas [i][4] = ler.nextFloat();
            if (notas [i][4] < 75) {
                alunos [i][1] = "Rep. por falta";
            }else if (notas [i][5] < 7) {
                alunos [i][1] = "Rep. por nota";
            }else {
                alunos [i][1] = "Aprovado ";
            }
            System.out.println("------");
        }
        System.out.println("--Resultados--");
        for (int i=0; i<5; i++){
            System.out.println("Aluno(a): " + alunos[i][0]+ ":\nMédia: "+ notas [i][5]+ "\nFreq.: "+ notas[i][4]+ "\nResultado Final: "+ alunos[i][1]+ "\n-----");
        }
        System.out.println(".: Sistemas de notas encerrado :.");
        System.out.println("Alterado no VS online");
    }
}
