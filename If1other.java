import java.util.Scanner;

public class If1other{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero inteiro!");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("O numero é zero!");
        }else{
            if(num > 0){
                System.out.println("O numero é positivo!");
            }else{
                System.out.println("O numero é negativo!");
            }
        }

    }

}