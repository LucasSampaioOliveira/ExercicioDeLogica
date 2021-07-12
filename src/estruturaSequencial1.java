import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class estruturaSequencial1 {


    public static void main(String[] args) {
        System.out.println("Digite o numero exemplo a ser executado.");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();
/*
18.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
*/
        switch (exemploRequerido) {
            case 1: {
                System.out.println("Alo Mundo");
                break;
            }
            case 2: {
                System.out.println("Digite um numero para ser exibido");
                Scanner myObj = new Scanner(System.in);
                int userName = myObj.nextInt();
                System.out.println("O número informado foi: " + userName);
                break;
            }
            case 3: {
                int[] numeros = new int[3];
                System.out.println("Digite 2 numeros para que sejam somados");
                Scanner myObj = new Scanner(System.in);
                for (int i=0; i< numeros.length; i++) {
                    numeros[i] = myObj.nextInt();
                }
                int nResultante = numeros[0] + numeros[1];
                System.out.println("Resultado da soma: " + nResultante);
                break;
            }
            case 4: {
                float[] numeros = new float[4];
                float nResultante = 0;
                System.out.println("Digite as 4 notas bimestrais");
                for (int i=0; i< numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextFloat();
                    nResultante =+ numeros[i];
                }
                System.out.println("Media dos quatro bimestres: " + nResultante);
                break;
            }
            case 5: {
                System.out.println("Digite a distancia em metros, para ser comvertida em centimetros");
                Scanner myObj = new Scanner(System.in);
                float metros = myObj.nextFloat();
                float centimetros = metros * 100;
                System.out.println("A distancia em metros e: " + centimetros);
                break;
            }
            case 6: {
                System.out.println("Digite o raio do circulo");
                Scanner myObj = new Scanner(System.in);
                float raio = myObj.nextFloat();
                double area = Math.PI * (raio * raio);
                System.out.println("Area do circulo: " + area);
                break;
            }
            case 7: {
                System.out.println("Digite o altura do quadrado");
                Scanner myObj = new Scanner(System.in);
                float altura = myObj.nextFloat();
                double areaQuadrada = 2 * (altura * altura);
                System.out.println("O dobro da area do quadrado: " + areaQuadrada);
                break;
            }
            case 8: {
                System.out.println("quanto você ganha por hora e o número de horas trabalhadas no mês?");
                Scanner myObj = new Scanner(System.in);
                float ganhoPHora = myObj.nextFloat();
                float Horas = myObj.nextFloat();
                double ganhoMes = ganhoPHora * Horas;

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM");
                String formattedDate = myDateObj.format(myFormatObj);

                System.out.println("Voce ganhara no mes de " + formattedDate + " o valor de: " + ganhoMes);
                break;
            }
            case 9: {
                System.out.println("Temperatura em Fahrenheit");
                Scanner myObj = new Scanner(System.in);
                float tempFah = myObj.nextFloat();
                float tempCel = 5 * ((tempFah-32) / 9);
                System.out.println("temperatura em graus Celsius: " + tempCel);
                break;
            }
            case 10: {
                System.out.println("Temperatura em graus Celcius");
                Scanner myObj = new Scanner(System.in);
                float tempCel = myObj.nextFloat();
                float tempFah = (tempCel * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + tempFah);
                break;
            }
            case 11: {
                int numI1 = 0;
                int numI2 = 0;
                int numR = 0;
                System.out.println("Digite o 1 Numero Inteiro");
                Scanner myObj = new Scanner(System.in);
                numI1 = myObj.nextInt();

                System.out.println("Digite o 2 Numero Inteiro");
                numI2 = myObj.nextInt();

                do {
                    System.out.println("Digite o um Numero Real");
                    numR = myObj.nextInt();
                    if (numR<0){
                        System.out.println("(Um numero real é sempre possitivo)");
                    }
                }while (numR<0);

                System.out.println("a: " + (numI1 * 2 *(numI2/2)));
                System.out.println("b: " + ((numI1 * 3) + numR));
                System.out.println("c: " + (numR * numR));
                break;
            }
            case 12: {
                System.out.println("Digite sua altura");
                Scanner myObj = new Scanner(System.in);
                float altura = myObj.nextFloat();
                System.out.printf("Seu peso ideal é: %.2f Quilos", ((72.7*altura)-58));//printF : "bla bla bla: '%.2f' bla bla", nomeDaVariavel (2:quantidades de casa apos a ',')(a espreção entre '' sera subistituida pela variavel citado apos a ',')
                break;
            }
            case 13: {
                float altura = 0;
                char sexo;

                System.out.println("Qual sua altura?");
                Scanner myObj = new Scanner(System.in);
                altura = myObj.nextFloat();

                while (true) {
                    System.out.println("Qual é seu sexo?");
                    sexo = myObj.next().charAt(0);

                    if (sexo == 'f') {
                        System.out.printf("Seu peso ideal é: %.2f Kg", ((62.1 * altura) - 44.7));
                        break;
                    } else if (sexo == 'm') {
                        System.out.printf("Seu peso ideal é: %.2f Kg", ((72.7 * altura) - 58));
                        break;
                    } else {
                        System.err.println("Alguma informação digitada é invalida.");
                    }
                }
                break;
            }
            case 14: {
                System.out.println("Quantos quilos de peixe?");
                Scanner myObj = new Scanner(System.in);
                float quilosP = myObj.nextFloat();
                if (quilosP > 50){
                    float excesso = (quilosP - 50);
                    System.out.println(excesso + " Kg, multa de R$ " + (excesso*4));
                }else{
                    System.out.println("Nao havera multa em sua mercadoria.");
                }
                break;
            }
            case 15: {
                System.out.println("quanto você ganha por hora?");
                Scanner myObj = new Scanner(System.in);
                float ganhoPHora = myObj.nextFloat();
                System.out.println("Quantas horas você trabalhou esse mês?");
                float Horas = myObj.nextFloat();
                double ganhoMes = ganhoPHora * Horas;
                System.out.println("+ Salário Bruto : R$" +ganhoMes);
                System.out.println("- IR (11%) : R$" + (ganhoMes * 0.11));
                System.out.println("- INSS (8%) : R$" + (ganhoMes * 0.08));
                System.out.println("- Sindicato ( 5%) : R$" + (ganhoMes * 0.05));
                System.out.println("= Salário Liquido : R$" + (ganhoMes * 0.76));
                break;
            }
            case 16: {
                int metrosLitros = 3;
                int lataLitros = 18;//3m - 1l
                float valorLata = 80f;// 9m - 3l
                int latasC = 1;

                System.out.println("Quantos metros quadrados deseja pintar?");
                Scanner myObj = new Scanner(System.in);
                float areaQuad = myObj.nextFloat();
                for (float litrosC =  (areaQuad/metrosLitros); litrosC>18; litrosC=(litrosC-18)){
                    latasC = latasC + 1;
                }
                System.out.println("Latas necessarias: " + latasC + "\nTotal pela tinta: R$" + (latasC * valorLata));
                break;
            }
            case 17: {
                int metrosLitros = 6;

                int lataLitros = 18;
                float valorLata = 80.00f;

                float galaoLitros = 3.60f;
                float valorGalao = 25.00f;
                int latasC = 0;
                int galaoC = 0;

                System.out.println("Quantos metros quadrados deseja pintar?");
                Scanner myObj = new Scanner(System.in);
                float areaQuad = myObj.nextFloat();
                float litrosC = areaQuad/metrosLitros;

                do {
                    if (lataLitros < litrosC) {
                        latasC++;
                        litrosC = litrosC - lataLitros;
                    } else if (lataLitros > litrosC) {
                        galaoC++;
                        litrosC = litrosC - galaoLitros;
                    }
                }while (litrosC > 0);

                System.out.println("Latas necessarias: " + latasC);
                System.out.println("Galoes necessarios: " + galaoC);
                System.out.println("Total pela tinta: R$ " + ((latasC * valorLata) + (galaoC * valorGalao)));

                break;
            }
            case 18: {
                System.out.println("Qual o tamanho do arquivo em MB?");
                Scanner myObj = new Scanner(System.in);
                float tamanhaArquivo = myObj.nextFloat();
                System.out.println("Qual é sua velocidade de internet? (em Mbps)");
                float velocidadeInt = myObj.nextFloat();
                int segundosMinutos = 60;
                float segundosTotal = tamanhaArquivo/velocidadeInt;
                int minutos = 0;
                do {
                    if (segundosTotal > segundosMinutos) {
                        minutos++;
                        segundosTotal = segundosTotal - segundosMinutos;
                    }
                }while (segundosTotal > segundosMinutos);
                System.out.print("Tempo aproximado de download: " + minutos + " Minutos");
                System.out.printf(" e %.0f", segundosTotal);
                System.out.print(" segundos");
                break;
            }
        }
    }
}