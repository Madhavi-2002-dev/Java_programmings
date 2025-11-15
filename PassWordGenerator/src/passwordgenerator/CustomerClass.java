package passwordgenerator;

import java.util.Random;
import java.util.Scanner;

public class CustomerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the what length you wqant to password ):");
		int passwordLenght=sc.nextInt();
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String allChars = upper + lower + digits ;
        StringBuilder sb = new StringBuilder(passwordLenght);

        Random random=new Random();
        for (int i = 0; i < passwordLenght; i++) {
            int index = random.nextInt(allChars.length());
            sb.append(allChars.charAt(index));
        }
        
        System.out.println("Generated password: " + sb);

		
//        System.out.println(sb);

	}

}
