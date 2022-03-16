import java.util.Scanner;

public class If8other {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg!");
        double peso = input.nextDouble();

        System.out.println("Insira a sual altura em m");
        double altura = input.nextDouble();
        
        double IMC = peso / (altura * altura);

        if(IMC > 25){
            System.out.println("Você está acima do peso!\n E o seu imc é: \n" + IMC);
        }else{
            if(IMC < 18.5){
                System.out.println("Você está abaixo do peso!\n E o seu imc é: \n" + IMC);
            }else{
                System.out.println("Você está no peso normal!\n E o seu imc é: \n" + IMC);
            }
        }
    }
}