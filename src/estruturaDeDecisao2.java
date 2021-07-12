import java.util.Scanner;

public class estruturaDeDecisao2 {

    static void tela(String x){
        System.out.println("Nota semestral do aluno: " + x);
    }

    public void unidadeDe(int numero) {
        numero = (numero % 100) %10;
    }
    static void dezenaDe(int numero) {
        numero = (numero % 100) /10;
        System.out.print(numero);
    }
    static void centenaDe(int numero) {
        numero = (numero / 100);
        System.out.print(numero);
    }

    public static void main(String[] args){
        System.out.println("Digite o numero exemplo a ser executado");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();
/*
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
 */
        switch (exemploRequerido) {
            case 1: {
                float[] numeros = new float[2];
                System.out.println("digite dois numeros");
                for (int i=0; i<numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextFloat();
                }
                float resultado = Math.max(numeros[0],numeros[1]);
                System.out.println("Maior numero é: " + resultado);
                break;
            }
            case 2: {
                System.out.println("Digite um numero");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                if (numero1 > 0) {
                    System.out.println(numero1 + ", è Positivo");
                } else {
                    System.out.println(numero1 + ", è Negativo");
                }
                break;
            }
            case 3: {
                System.out.println("Escolha entre 'M' ou 'F'");
                Scanner myObj = new Scanner(System.in);
                char letraSx = myObj.next().charAt(0); //metodo para agregar á variaveis tipo "Char"
                if (letraSx == 'M' || letraSx == 'm') {
                    System.out.println("Masculino");
                } else if (letraSx == 'F' || letraSx == 'f') {
                    System.out.println("Feminino");
                } else {
                    System.err.println("Sexo inválido");
                }
                break;
            }
            case 4: {
                System.out.println("Digite uma letra");
                Scanner myObj = new Scanner(System.in);
                char letra = myObj.next().charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + ", É uma vogal");
                } else {
                    System.err.println(letra + ", É uma consoante");
                }
                break;
            }
            case 5: {
                System.out.println("Digite a primeira notas parciais");
                Scanner lNotaParc1 = new Scanner(System.in);
                float notaParc1 = lNotaParc1.nextFloat();

                System.out.println("Digite a segunda notas parciais");
                Scanner lNotaParc2 = new Scanner(System.in);
                float notaParc2 = lNotaParc2.nextFloat();

                float media = (notaParc1 + notaParc2) / 2;

                if (media >= 7){
                    System.out.println("Aprovado");
                } else if (media < 7) {
                    System.out.println("Reprovado");
                } else  if (media == 10) {
                    System.out.println("Aprovado com Distinção");
                }
                break;
            }
            case 6: {
                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);
                float num1 = myObj.nextFloat();
                float num2 = myObj.nextFloat();
                float num3 = myObj.nextFloat();

                float numMaior1e2 =  Math.max(num1, num2);
                float numMaiorF = Math.max(numMaior1e2, num3);
                System.out.println(numMaiorF + ", é o maior numero");
                break;
            }
            case 7: {
                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);
                float num1 = myObj.nextFloat();
                float num2 = myObj.nextFloat();
                float num3 = myObj.nextFloat();

                float numMaior1e2 = Math.max(num1, num2);
                float numMaiorF = Math.max(numMaior1e2, num3);

                float numMenor1e2 = Math.min(num1, num2); //Math.min(numeroA, numeroB) retorna o menor numero.
                float numMenorF = Math.min(numMenor1e2, num3);

                System.out.println(numMaiorF + ", é o Maior numero");
                System.out.println(numMenorF + ", é o Menor numero");
                break;
            }
            case 8: {
                double [][][] lojasProdutos = new double[4][3][2];//lojasProdutos[P][L]
                for (int i=0; i<3; i++) {
                    for (int j=0; j<4; j++) {
                        System.out.println("Qual o valor do pruduto " + (j+1) + ", na Loja " + (i+1));
                        Scanner myObj = new Scanner(System.in);
                        lojasProdutos [j][i][0] = myObj.nextFloat();
                    }
                }

                System.out.println();
                for (int i=0; i<4; i++) {
                    for (int j=0; j<3; j++) {
                        for (int q=0; q<3; q++) {
                            lojasProdutos[i][j][1] = lojasProdutos[i][j][0] > lojasProdutos[i][q][0] ? lojasProdutos[i][j][1] + 1 : lojasProdutos[i][j][1];
                        }
                    }
                }

                for (int i=0; i<3; i++){//[P][L]
                    System.out.println("Produtos na Loja " + (i+1) + ": ");
                    for (int j=0; j<4; j++){
                        if (lojasProdutos[j][i][1] == 0){
                            System.out.println("Produto " + (j+1) + ", Barato: R$" + lojasProdutos[j][i][0]);
                        }else {
                            System.out.println("Produto " + (j+1) + ", Caro: R$" + lojasProdutos[j][i][0]);
                        }
                    }
                }
                break;
            }
            case 9: {
                double[][] num = new double[4][2];
                double[] nSequancia = new double[4];

                System.out.println("Digite 4 numeros");
                Scanner myObj = new Scanner(System.in);

                for (int i = 0; i < num.length; i++) { //guardando os valores
                    num[i][0] = myObj.nextFloat();
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        num[i][1] = num[i][0] > num[j][0] ? num[i][1] + 1 : num[i][1];
                    }
                }

                for (int i=0; i<4; i++){
                    for (int j=0; j<4; j++){
                        if (num[j][1] == i){
                            System.out.print(num[j][0] + ", ");
                        }
                    }
                }
                break;
            }
            case 10: {
                System.out.println("Em qual turma vc estuda?\nM-Matutino, V-Vespertino ou N-Noturno");
                Scanner myObj = new Scanner(System.in);
                char letraTurno = myObj.next().charAt(0);
                switch (letraTurno){
                    case 'v': {
                        System.out.println("Bom Dia!");
                    }break;

                    case 'm': {
                        System.out.println("Boa Tarde!");
                    }break;

                    case 'n': {
                        System.out.println("Boa Noite!");
                    }break;

                    default:
                        System.out.println("Valor inválido!");
                        break;
                }
                break;
            }
            case 11: {
                System.out.println("Salario do atual do funcionario");
                Scanner myObj = new Scanner(System.in);
                double salarioAtual = myObj.nextFloat();
                double salarioNovo = 0;
                double percentual = 0;
                double valorAlmento = 0;

                 if (salarioAtual >= 1500){
                     percentual = 5;
                     valorAlmento = salarioAtual * (percentual/100);
                     salarioNovo = salarioAtual + valorAlmento;
                 }else if (salarioAtual >= 700){
                     percentual = 10;
                     valorAlmento = salarioAtual * (percentual/100);
                     salarioNovo = salarioAtual + valorAlmento;
                 }else if(salarioAtual >= 280){
                     percentual = 15;
                     valorAlmento = salarioAtual * (percentual/100);
                     salarioNovo = salarioAtual + valorAlmento;
                 }else if(salarioAtual > 0){
                     percentual = 20;
                     valorAlmento = salarioAtual * (percentual/100);
                     salarioNovo = salarioAtual + valorAlmento;
                 }else if(salarioAtual <= 0){
                     System.err.println("Não é um funcionario é Escravo!!");
                 }
                System.out.println("Salario antes do reajuste: R$" + salarioAtual);
                System.out.println("Percentual de almento aplicado: " + percentual + "%");
                System.out.printf("Valor do aumento: R$%.2f", valorAlmento);
                System.out.println("\nNovo salário, após o aumento: R$" + salarioNovo);
                break;
            }
            case 12: {
                System.out.println("quanto você ganha por hora e o número de horas trabalhadas no mês?");
                Scanner myObj = new Scanner(System.in);
                float ganhoHora = myObj.nextFloat();
                float horas = myObj.nextFloat();

                double salarioBruto = ganhoHora * horas;
                double percentualIR = 0;
                double valorIR = 0;
                double percentualINSS = 10;
                double valorINSS = 0;
                double percentualFGTS = 11;
                double valorFGTS = 0;
                double totalDescontos = 0;
                double salarioLiquido = 0;

                if (salarioBruto <= 900){
                    percentualIR = 0;
                }else if (salarioBruto <= 1500){
                    percentualIR = 5;
                }else if(salarioBruto <= 2500){
                    percentualIR = 10;
                }else if(salarioBruto > 2500){
                    percentualIR = 20;
                }else if(salarioBruto <= 0){
                    System.err.println("Não é um funcionario é Escravo!!");
                    break;
                }
                valorIR = salarioBruto * (percentualIR/100);
                valorINSS = salarioBruto * (percentualINSS/100);
                valorFGTS = salarioBruto * (percentualFGTS/100);
                totalDescontos = valorIR + valorINSS;
                salarioLiquido = salarioBruto - totalDescontos;

                System.out.println("Salario bruto (" + ganhoHora + " * " + horas + ")  : R$" + salarioBruto);
                System.out.println("(-)IR ("+percentualIR+"%)                : R$" + valorIR);
                System.out.println("(-)INSS ("+percentualINSS+"%)              : R$" + valorINSS);
                System.out.println("FGTS ("+percentualFGTS+"%)                 : R$" + valorFGTS);
                System.out.println("Total descontos              : R$" + totalDescontos);
                System.out.println("Salario liquido              : R$" + salarioLiquido);
                break;
            }
            case 13: {
                int diaSemana = 0;
                do {
                    System.out.println("Digiate um numero correspondente ao dia da semana");
                    Scanner myObj = new Scanner(System.in);
                    diaSemana = myObj.nextInt();

                    if (diaSemana > 7){
                        System.out.println("Numero digitado e invalido");
                    }
                } while (diaSemana > 7);

                switch (diaSemana){
                    case 1: {
                        System.out.println("Domingo");
                        break;
                    }
                    case 2: {
                        System.out.println("Segunda-Feira");
                        break;
                    }
                    case 3: {
                        System.out.println("Terça-Feira");
                        break;
                    }
                    case 4: {
                        System.out.println("Quarta-Feira");
                        break;
                    }
                    case 5: {
                        System.out.println("Quinta-Feira");
                        break;
                    }
                    case 6: {
                        System.out.println("Sexta-Feira");
                        break;
                    }
                    case 7: {
                        System.out.println("Sabado");
                        break;
                    }
                }
                break;
            }
            case 14: {
                System.out.println("Digite a nota do aluno no 1 trimestre");
                Scanner myObj = new Scanner(System.in);
                float nota1B = myObj.nextFloat();
                System.out.println("Digite a nota do aluno no 2 trimestre");
                float nota2B = myObj.nextFloat();
                float notaEUA = 0;

                float notaF = (nota1B + nota2B) / 2;
                notaEUA = notaF * 10;


                    if (notaEUA == 100) {
                        tela("S");
                    } else if (notaEUA >= 97) {
                        tela("A+");
                    } else if (notaEUA >= 94.5) {
                        tela("A");
                    } else if (notaEUA >= 90) {
                        tela("A-");
                    } else if (notaEUA >= 87) {
                        tela("B+");
                    } else if (notaEUA >= 84.5) {
                        tela("B");
                    } else if (notaEUA >= 80) {
                        tela("B-");
                    } else if (notaEUA >= 77) {
                        tela("C+");
                    } else if (notaEUA >= 74.5) {
                        tela("C");
                    } else if (notaEUA >= 70) {
                        tela("C-");
                    } else if (notaEUA >= 67) {
                        tela("D+");
                    } else if (notaEUA >= 64.5) {
                        tela("D");
                    } else if (notaEUA >= 60) {
                        tela("D-");
                    } else if (notaEUA >= 57) {
                        tela("E+");
                    } else if (notaEUA >= 54.5) {
                        tela("E");
                    } else if (notaEUA >= 50) {
                        tela("E-");
                    } else if (notaEUA < 50) {
                        System.out.println("Nota F");
                    } else {
                        System.err.println("Valor invalido");
                    }

            }//Tem que melhorar
            case 15: {
                float[] lados = new float[3];
                int ladosIguais = 0;

                for (int i=0;  i<lados.length; i++){
                    System.out.println("Tamanho do lado numero " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    lados[i] = myObj.nextFloat();
                }
                for (int i=0;  i<lados.length; i++){
                    for (int j=0;  j<lados.length; j++){

                        if (j == i){
                        }else if (j != i){
                            if (lados[i] == lados[j]) {
                                ladosIguais++;
                            }
                        }
                    }
                }
                switch (ladosIguais){
                    case 0: {
                        System.out.println("Triângulo Escaleno");
                        break;
                    }
                    case 2: {
                        System.out.println("Triângulo Isósceles");
                        break;
                    }
                    case 6: {
                        System.out.println("Triângulo Equilátero");
                        break;
                    }
                }
                System.out.println(ladosIguais);//0Ig= 0, 2Ig= 2, 3Ig = 6.
                break;
            }
            case 16: {
                double[] numerosEqua = new double[3];
                char[] letrasEqua = {'A', 'B', 'C'};
                double delta, resultado1, resultado2 = 0;

                for (int i=0; i< numerosEqua.length; i++){
                    System.out.println("Dite o valor de " + letrasEqua[i]);
                    Scanner myObj = new Scanner(System.in);
                    numerosEqua[i] = myObj.nextFloat();
                    if (numerosEqua[0] == 0){
                        System.out.println("A equação não é do segundo grau");
                        break;
                    }
                }//ax²+bx+c

                delta = (Math.pow(numerosEqua[1], 2)) - (4 * numerosEqua[0] * numerosEqua[2]);
                if (delta < 0){
                    System.out.println("A equação não possui raizes reais");
                    break;
                }
                if (delta == 0){
                    resultado1 = ((numerosEqua[1] * (-1)) + Math.sqrt(delta)) / 2 * numerosEqua[0];
                    System.out.println("a equação possui apenas uma raiz real: " + resultado1);
                }
                if (delta > 0){
                    resultado1 = ((numerosEqua[1] * (-1)) + Math.sqrt(delta)) / 2 * numerosEqua[0];
                    resultado2 = ((numerosEqua[1] * (-1)) - Math.sqrt(delta)) / 2 * numerosEqua[0];
                    System.out.println("A equação possui duas raiz reais: " + resultado1 + ", " + resultado2);
                }
                break;
            }
            case 17: {
                //se o ano não terminar em 00 e for divisível por 4 =|= 1988 : 1988/4 = 497 (numR)
                //Um número é divisível por 4 quando a sua dezena é divisível por 4 =|= 1988 : 1988/4 = 497 (numR) | 19'88', 88/4 = 22 (numR)
                //terminado em 00 dividido por 400 for numR =|= 1900 : 1900/400 = 4.75 XX / 2000/400 = 5 numR
                //if > 1200 | 12 = multiplo 4 ?(3*4)

                int ano;
                int soma = 4;
                System.out.println("Qual ano?");
                Scanner myObj = new Scanner(System.in);
                ano = myObj.nextInt();

                for (int i=4; i<ano; i+=4){
                    if (ano == i){
                        System.out.println("Ano bissexto: " + ano);
                    }
                }
                System.out.println("Ano não bissexto: " + ano);
                break;
            }//Tem que melhorar
            case 18: {
                int num;
                int unidade = 0;
                int dezena = 0;
                int centena = 0;
                int minhar = 0;
                System.out.println("Digite um numero menor que 1000");
                Scanner myObj = new Scanner(System.in);
                num = myObj.nextInt();

                if (num >= 1000) {
                    minhar = num / 1000;
                    centena = (num / 100) % 10;
                    dezena = (num % 100) / 10;
                    unidade = (num % 100) % 10;
                } else if (num >= 100) {
                    centena = num / 100;
                    dezena = (num % 100) / 10;
                    unidade = (num % 100) % 10;
                } else if (num >= 10) {
                    dezena = (num % 100) / 10;
                    unidade = (num % 100) % 10;
                } else if (num >= 1) {
                    unidade = (num % 100) % 10;
                } else if (num <= 0) {
                    System.out.println("Algo de errado nao esta certo (1000 < num < 0)");
                }

                if (num >= 1000){
                    System.out.println("dois ultimos digitos:" + (num % 100));
                }

                System.out.println(minhar);
                System.out.println(centena);
                System.out.println(dezena);
                System.out.println(unidade);
                break;
            }
        }
    }



}
