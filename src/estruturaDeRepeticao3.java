import java.util.Scanner;

public class estruturaDeRepeticao3 {
    public static void main(String[] args){
        System.out.println("Seja muito bem vindo ha nossa 3 lista de exercicios,\nQual exemplo vc deseja reproduzir?");
        Scanner numeroDigitado = new Scanner(System.in);
        int myExemplos = numeroDigitado.nextInt();

        switch (myExemplos){
            case 1: {
                boolean numDigBoolean = false;

                while (!numDigBoolean) {
                    System.out.println("Digite uma nota entre 0 ate 10;");
                    Scanner myObj = new Scanner(System.in);
                    int numDig = myObj.nextInt();

                    for (int i=0; i<=10; i++){
                        if (numDig == i){
                            System.out.println("Valor valido, parabens.");
                            numDigBoolean = true;
                            break;
                        }
                    }
                    if (numDigBoolean) {
                        break;
                    }
                    System.out.println("Numero Invalido, por favor tente novamente.");
                }
                break;
            }
            case 2: {
                boolean loginIgual = true;
                while (loginIgual) {
                    String[] login = new String[2];
                    System.out.println("Digite um nome de Usuario");
                    Scanner myObj = new Scanner(System.in);
                    login[0] = myObj.next();
                    System.out.println("Digite uma Senha");
                    login[1] = myObj.next();
                    if (!login[0].equals(login[1])) {
                        loginIgual = false;
                        break;
                    }
                    System.out.println("Usuario e Senha iguais, tente outra combinação");
                }
                System.out.println("Usuario e Senha validos.");
                break;
            }
            case 3: {
                boolean nomeTesteB = false;
                String[] nomeTeste = new String[3];
                boolean idadeTesteB = false;
                boolean salarioTesteB = false;
                boolean sexoTesteB = false;
                boolean estadoCivilTesteB = false;

                while (!nomeTesteB) {

                    System.out.println("Digite seu nome");
                    Scanner myObj = new Scanner(System.in);
                    String nome = myObj.next();

                    if (nome.length() > nomeTeste.length) {
                        System.out.println("Nome valido\n");
                        nomeTesteB = true;
                        break;
                    }
                    System.out.println("alguma informação nao é valida");
                }
                while (!idadeTesteB) {
                    System.out.println("Digite sua idade");
                    Scanner myObj = new Scanner(System.in);
                    int idadeTeste = myObj.nextInt();

                    for (int i=0; i<=150; i++){
                        if (idadeTeste == i){
                            idadeTesteB = true;
                            break;
                        }
                    }
                    if (idadeTesteB){
                        System.out.println("Idade valida\n");
                        break;
                    }
                    System.out.println("Idade invalida, tente novamente.");
                }
                while (!salarioTesteB) {
                    System.out.println("Digite seu Salario");
                    Scanner myObj = new Scanner(System.in);
                    float salario = myObj.nextFloat();

                    if (salario > 0){
                        System.out.println("Salario valido\n");
                        break;
                    }
                    System.out.println("Salario invalido");
                }
                while (!sexoTesteB) {
                    System.out.println("Qual o seu Sexo?");
                    Scanner myObj = new Scanner(System.in);
                    char sexoTeste = myObj.next().charAt(0);

                    switch (sexoTeste){
                        case 'f': { sexoTesteB = true; }
                        case 'F': { sexoTesteB = true; }
                        case 'm': { sexoTesteB = true; }
                        case 'M': { sexoTesteB = true; }
                    }
                    if (sexoTesteB){
                        System.out.println("Sexo Valido\n");
                        break;
                    }
                    System.out.println("Sexo invalido\n");
                }
                while (!estadoCivilTesteB) {
                    System.out.println("Qual o seu Sexo?");
                    Scanner myObj = new Scanner(System.in);
                    char estadoCivilTeste = myObj.next().charAt(0);

                    switch (estadoCivilTeste) {
                        case 's': {
                            estadoCivilTesteB = true;
                        }
                        case 'c': {
                            estadoCivilTesteB = true;
                        }
                        case 'v': {
                            estadoCivilTesteB = true;
                        }
                        case 'd': {
                            estadoCivilTesteB = true;
                        }
                        case 'S': {
                            estadoCivilTesteB = true;
                        }
                        case 'C': {
                            estadoCivilTesteB = true;
                        }
                        case 'V': {
                            estadoCivilTesteB = true;
                        }
                        case 'D': {
                            estadoCivilTesteB = true;
                        }
                    }
                    if (estadoCivilTesteB) {
                        System.out.println("Dado Valido\n");
                        break;
                    }
                    System.out.println("Dado invalido\n");
                }

                System.out.println("todas as informações são validas.");
                break;
            }
            case 4: {
                float popuPaisA = 80000F;//3%
                float popuPaisB = 200000F;//1,5%
                int anos = 0;

                while (popuPaisA<popuPaisB){
                    anos ++;
                    popuPaisA += popuPaisA * 0.03F;
                    popuPaisB += popuPaisB * 0.015F;
                }
                System.out.println("Quantidade de anos necessarios: " + anos);
                break;
            }
            case 5: {
                int anos = 0;
                boolean repetir = false;

                do {
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Simulador de crescimento populacional\nDigite a populaçao do pais A");
                    float popuPaisA = myObj.nextFloat();
                    System.out.println("Digita a Taxa de crescimento do Pais A");
                    float taxaPaisA = myObj.nextFloat();

                    System.out.println("Digite a populaçao do pais B");
                    float popuPaisB = myObj.nextFloat();
                    System.out.println("Digita a Taxa de crescimento do Pais B");
                    float taxaPaisB = myObj.nextFloat();


                    while (popuPaisA < popuPaisB) {
                        anos++;
                        popuPaisA += popuPaisA * taxaPaisA;
                        popuPaisB += popuPaisB * taxaPaisB;
                    }
                    System.out.println("Quantidade de anos necessarios: " + anos);
                    System.out.println("\nDeseja repetir o simulador?\n('S' - Sim, 'N' - Não)");
                    char repetirChar = myObj.next().charAt(0);

                    switch (repetirChar){
                        case 's':{
                            repetir = true;
                            break;
                        }
                        case 'n':{
                            repetir = false;
                            break;
                        }
                    }
                }while (repetir);
                break;
            }
            case 6: {
                for (int i=1; i<=20; i++){
                    System.out.println(i);
                }
                for (int i=1; i<=20; i++){
                    if (i==20){
                    System.out.print(i);
                }else{
                        System.out.print(i + ", ");
                    }
                }
                break;
            }
            case 7: {
                float[][] numeros = new float[5][2];
                for (int i=0; i< numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Digite o valor numero "+(i+1));
                    numeros[i][0] = myObj.nextFloat();
                }
                for (int i=0; i<5; i++){
                    for (int j=0; j<5; j++){
                        numeros[i][1] = numeros[i][0] > numeros[j][0] ? numeros[i][1] + 1 : numeros[i][1];
                    }
                }
                for (int i=0; i<5; i++){
                    if (numeros[i][1] == 4){
                        System.out.println("Maior numero é o: " +i +", equivale: "+ numeros[i][0]);
                    }
                }
                break;
            }
            case 8: {
                float[] numeros = new float[5];
                float numSoma = 0;
                for (int i=0; i<numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Digite o valor numero "+(i+1));
                    numeros[i] = myObj.nextFloat();
                }

                for (int i=0; i<5; i++){
                    numSoma = numSoma + numeros[i];
                }

                float numMedia = numSoma/5;

                System.out.println("Soma de todos os numeros: " + numSoma);
                System.out.println("Media de todos os numeros: " + numMedia);

                break;
            }
            case 9: {
                for (int i=1; i<51; i+=2){
                    System.out.print(i + ", ");
                }
                break;
            }
            case 10: {
                int[] numeros = new int[2];
                for (int i=0; i< numeros.length; i++){
                    System.out.println("Digite o valor " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextInt();
                }
                if (numeros[0]<numeros[1]) {
                    while (numeros[0] < (numeros[1] - 1)) {
                        numeros[0] += 1;
                        System.out.println(numeros[0]);
                    }
                }else {
                    while (numeros[1] < (numeros[0] - 1)) {
                    numeros[1] += 1;
                    System.out.println(numeros[1]);
                    }
                }
                break;
            }
        }
    }
}
