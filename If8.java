import java.util.Scanner;
public class If8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg!");
        double peso = input.nextDouble();

        System.out.println("Insira sua altura em cm!");
        double altura = input.nextDouble();

        double alturaOG = altura / 100; 

        double IMC = peso / (alturaOG*alturaOG);

        if(IMC > 25){
            System.out.println("Você está acima do peso!\nE seu IMC é: \n" + IMC);
        }else if(IMC < 18.5){
            System.out.println("Você está abaixo do peso! \nE seu IMC é: \n" + IMC);
        }else{
            System.out.println("Você está no peso normal! \nE seu IMC é: \n" + IMC);
        }

    }
    
}
