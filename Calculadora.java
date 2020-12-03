package calculadoraPackage;
import java.util.Scanner;//Importação do objeto <Scanner>

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);/*Importação de classe "Scanner" para leitura de dados*/

        float num1 = 0, num2 = 0, resultado = 0;//Declaração de variáveis float para entrada na caluladora
        int escolha;//Variável de controle NÃO LÓGICO
        boolean controle = true;//Variável de controle LÓGICO
            while(controle = true){//Controle do programa//
            /*-----------------Entrada de dados---------------------------------*/
                System.out.print("Digite um número: ");
                num1 = entrada.nextFloat();
                System.out.println("Digite mais um número: ");
                num2 = entrada.nextFloat();
            /*------------------------------------------------------------------*/
            /*--------Condição de controle, se ambas as variáveis forem == 0 então o programa encerra, se não ele continua----*/
                if(num1 == 0 && num2 == 0){
                    controle = false;
                    break;
                }
                else{
                    System.out.println("Escolha uma operação\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
                    escolha = entrada.nextInt();
                /*----Switch case. Caso seja digitada e entrada 1,2,3 ou 4, resultado recebe a operação mostrada--------*/
                        switch (escolha){
                            case 1:
                                resultado = num1 + num2;
                                break;
                            case 2:
                                resultado = num1 - num2;
                                break;
                            case 3:
                                resultado = num1 / num2;
                                break;
                            case 4:
                                resultado = num1 * num2;
                                break;
                        }
                /*----------É mostrado o resultado na tela--------------*/
                    System.out.println("Resultado da operação " + escolha + " é: " + resultado);
                }
            }
        /*------------------------------------------------------------------------------------------*/
    }
}
