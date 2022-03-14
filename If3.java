import java.util.Scanner;

public class If3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero qualquer");
        double num1 = input.nextDouble();

        System.out.println("Insira outro numero qualquer");
        double num2 = input.nextDouble();

        if(num1 > num2){
            System.out.println("O primeiro numero inserido é maior que o segundo numero inserido");
        }else if(num2 > num1){
            System.out.println("O segundo numero inserido é maior que o primeiro numero inserido");
        }else{
            System.out.println("Ambos numeros tem o mesmo valor");
        }
    }
    
}
