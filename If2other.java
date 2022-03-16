import java.util.Scanner;

public class If2other {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero qualquer!");
        double num = input.nextDouble();

        if(num == 10){
            System.out.println("Este numero é o própio 10!");
        }else{
            if(num > 10){
                System.out.println("Este numero é maior que 10!");
            }else
                System.out.println("Este numero é menor que 10!");
            }
        }

    }
