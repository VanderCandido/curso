import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
	    int num;
	    try{
	        System.out.println("Digite um numero: ");
	        num = Input.nextInt();
	        System.out.println("O numero digitado: "+ num);
	    }catch(Exception erro){
	        System.out.println("DIGITE APENAS NÚMERO! "+ erro);
	    }
	}
}
