import java.util.Scanner;

public class If3other {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero qualquer");
        double num1 = input.nextDouble();

        System.out.println("Insira outro numero qualquer");
        double num2 = input.nextDouble();

        if((num1 == num2) || (num2 == num1)){
            System.out.println("Ambos numeros tem o mesmo valor!");
            
        }else{
            if(num1 > num2){
                System.out.println(num1 + " É maior que: " + num2);
            }else{
                System.out.println(num2 + " É maior que: " + num1);
            }
        }
    }
}