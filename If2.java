import java.util.Scanner;

public class If2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero qualquer");
        int num = input.nextInt();

        if(num > 10){
            System.out.println("Este numero é maior que dez!");
        }else if(num <10){
            System.out.println("Este numero é menor que dez!");
        }else{
            System.out.println("Este numero é o própio dez!");
        }


    }
}
