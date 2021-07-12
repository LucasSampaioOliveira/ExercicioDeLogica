import java.util.Scanner;

public class listaDeExercicios4 {
    public static void main(String[] args) {
        System.out.println("Seja muito bem vindo ha nossa 4 lista de exercicios,\nQual exemplo vc deseja reproduzir?");
        Scanner numeroDigitado = new Scanner(System.in);
        int myExemplos = numeroDigitado.nextInt();

        switch (myExemplos){
            case 1: {
                int[] numeros = new int[5];
                for (int i=0; i< numeros.length; i++){
                    System.out.println("Digite o valor numero " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextInt();
                }
                for (int i=0; i< numeros.length; i++){
                    System.out.print(numeros[i] + ", ");
                }
                break;
            }
            case 2: {
                int[] numeros = new int[10];
                for (int i=0; i<numeros.length; i++){
                    System.out.println("Digite o valor da casa " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextInt();
                }
                for (int i=9; i>=0; i--){
                    System.out.print(numeros[i] + ", ");
                }
                break;
            }
            case 3: {
                Scanner myObj = new Scanner(System.in);
                float[] notas = new float[4];
                float notasMedia = 0;

                for (int i=0; i<notas.length; i++){
                    System.out.println("Nota do " +(i+1)+" bimestre");
                    notas[i] = myObj.nextFloat();
                    notasMedia += notas[i];
                }
                for (int i=0; i<notas.length; i++){
                    System.out.println("Notas numero" + (i+1) + ": " + notas[i]);
                }
                System.out.println("Media das notas: " + (notasMedia/notas.length));
                break;
            }
            case 4: {
                System.out.println("Escreva uma sequancia de de Letras");
                char[] letrasScanner = new char[10];
                char[] letrasVogais = {'a', 'e', 'i', 'o', 'u'};
                int vogaisSoma = 0;
                for(int i=0; i<letrasScanner.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    letrasScanner[i] = myObj.next().charAt(0);
                }
                for (int i=0; i<letrasScanner.length; i++){
                    for (int j=0; j<5; j++){
                        if (letrasScanner[i] == letrasVogais[j]) {
                            letrasScanner[i] = ' ';//Ganbiara
                            vogaisSoma++;
                        }
                    }
                }
                for (int i=0; i<letrasScanner.length; i++){
                    if (letrasScanner[i] != ' ') {
                        System.out.print(letrasScanner[i] + ", ");
                    }
                }
                System.out.println("Total de Consoantes: " + (10-vogaisSoma));
                break;
            }
            case 5: {
                int parPosicao = -1;
                int impPosicao = -1;
                int[] allNum = new int[20];
                int[] numPar = new int[20];
                int[] numImp = new int[20];
                boolean numVerifB = false;

                for (int i=0; i< allNum.length; i++){
                    System.out.print("Valor a ser colocado dentro do Vetor: ");
                    Scanner myObj = new Scanner(System.in);
                    allNum[i] = myObj.nextInt();
                }
                for (int i=0; i<allNum.length; i++){

                    int numVerif = allNum[i];

                    numVerifB = true;

                    while (numVerifB) {
                        if (numVerif == 0) {
                            parPosicao++;
                            numPar[parPosicao] = allNum[i];
                            numVerifB = false;
                            break;
                        } else if (numVerif == 1) {
                            impPosicao++;
                            numImp[impPosicao] = allNum[i];
                            numVerifB = false;
                            break;
                        } else {
                            numVerif = numVerif - 2;
                        }
                    }
                }
                System.out.print("Numeros Digitado: ");
                for (int i=0; i< allNum.length; i++){
                    System.out.print(allNum[i] + ", ");
                }
                System.out.print("\nNumeros Pares digitados: ");
                for (int i=0; i< numPar.length; i++){
                    if (numPar[i] != 0){
                        System.out.print(numPar[i] + ", ");
                    }
                }
                System.out.print("\nNumeros Impar digitados: ");
                for (int i=0; i< numImp.length; i++){
                    if (numImp[i] != 0){
                        System.out.print(numImp[i] + ", ");
                    }
                }
                System.out.println();
                break;
            }
            case 6: {
                float[][] notasAlunos = new float[10][4];
                float[] alunosMedia = new float[10];
                int alunosMedia7 = 0;

                for (int i=0; i<notasAlunos.length; i++){
                    System.out.println("Aluno " + (i+1) + ": ");
                    for (int j=0; j<4; j++){
                        System.out.println((j+1) + " Bimestre, ");
                        Scanner myObj = new Scanner(System.in);
                        notasAlunos[i][j] = myObj.nextFloat();
                    }
                }
                for (int i=0; i<10; i++){
                    for (int j=0; j<4; j++){
                        alunosMedia[i] = alunosMedia[i] + notasAlunos[i][j];
                    }
                    alunosMedia[i] = (alunosMedia[i]/4);
                }
                System.out.println("Alunos com nota maior que 7.0: ");
                for (int i=0; i<10; i++){
                    if(alunosMedia[i] >= 7){
                        alunosMedia7++;
                    }
                }
                System.out.println("Alunos com media maior ou iqual a 7: " + alunosMedia7);
                break;
            }
            case 7: {
                int[] numDigitados = new int[5];
                float soma = 0;
                float multip = 1;

                for (int i=0; i<numDigitados.length; i++){
                    System.out.println("Digite um numero (" + (i+1) + ")");
                    Scanner myObj = new Scanner(System.in);
                    numDigitados[i] = myObj.nextInt();
                    soma = soma + numDigitados[i];
                }
                for (int i=0; i< numDigitados.length; i++){
                     multip = multip * numDigitados[i];
                }
                System.out.println("Soma total dos numeros: " + soma + "\nMultiplicação de todos os numeros: " + multip);

                for (int i=0; i< numDigitados.length; i++){
                    if (i == 4) {
                        System.out.print(numDigitados[i]);
                    }else {
                        System.out.print(numDigitados[i] + ", ");
                    }
                }
                break;
            }
            case 8: {
                float[][] idadeAltura = new float[5][2];

                for (int i=0; i<5; i++){
                    System.out.println("Pessoa " + (i+1) + "\nIdade: ");
                    Scanner myObj = new Scanner(System.in);
                    idadeAltura[i][0] = myObj.nextFloat();
                    System.out.println("Altura: ");
                    idadeAltura[i][1] = myObj.nextFloat();
                }
                for (int i=4; i>-1; i--){
                    System.out.println("Pessoa " + (i+1) + "\nIdade: " + idadeAltura[i][0] + " | Altura: " + idadeAltura[i][1]);
                }
                break;
            }
            case 9: {
                int[] numAll = new int[10];
                int somaQuadr = 0;
                for (int i=0; i<numAll.length; i++){
                    System.out.println("Digite um numero (" + (i+1) + ")");
                    Scanner myObj = new Scanner(System.in);
                    numAll[i] = myObj.nextInt();
                    somaQuadr += (numAll[i] * numAll[i]);
                }
                System.out.println("Soma total: " + somaQuadr);
                break;
            }
            case 10: {
                float[] vetor1 = new float[3];
                float[] vetor2 = new float[3];
                float[] vetoresUnidos = new float[vetor1.length+vetor2.length];

                System.out.println("Vetor 1");
                for (int i=0; i<vetor1.length; i++){
                    System.out.println((i+1) + " Numero");
                    Scanner myObj = new Scanner(System.in);
                    vetor1[i] = myObj.nextFloat();
                }
                System.out.println("Vetor 2");
                for (int i=0; i<vetor2.length; i++){
                    System.out.println((i+1) + " Numero");
                    Scanner myObj = new Scanner(System.in);
                    vetor2[i] = myObj.nextFloat();
                }
                System.out.println("Vetores Unificados");
                int n=0;
                int j=0;
                while (n<vetoresUnidos.length){
                    vetoresUnidos[n] = vetor1[j];
                    n++;
                    vetoresUnidos[n] = vetor2[j];
                    n++;
                    j++;
                }
                for (int i=0; i< vetoresUnidos.length; i++){
                    System.out.print(vetoresUnidos[i] + ", ");
                }
                break;
            }
        }
    }
}
