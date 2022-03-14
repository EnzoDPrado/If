import java.util.Scanner;

class If1{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero inteiro");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("O valor do numero em que você digitou é positivo");
        }else if (num == 0){
            System.out.println("O valor do numero em que você digitou é 0");       
        }else{
            System.out.println("O valor do numero em que você digitou é negativo");
        }
        
    }
}