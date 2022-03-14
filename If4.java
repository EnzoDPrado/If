import java.util.Scanner;

public class If4 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero inteiro qualquer");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero inserido é par!");
        }else{
            System.out.println("O numero inserido é impar!");
        }
        
    }

    
}
