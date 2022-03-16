import java.util.Scanner;

public class If6other {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira  a sua idade");
        int idade = input.nextInt();

        if((idade <=0) || (idade >=150)){
            System.out.println("Idade invalida!");
        }else{
            if(idade >= 18){
                System.out.println("Você é maior de idade!");
            }else{
                System.out.println("Você é menor de idade!");
            }
        }

    }
}