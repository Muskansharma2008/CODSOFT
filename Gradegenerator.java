import java.util.Scanner;

public class Gradegenerator {
    public static void main(String[] args) {
        double avmarks;
        char grade;
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
        int totalmarks=0;
        System.out.println("Enter number of subjects: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i=i+1) {
                System.out.println("Enter marks for subject "+i+ ": ");
                int marks=sc.nextInt();
                totalmarks = totalmarks + marks;
        }
        avmarks= (double) totalmarks/num;
        if(avmarks>=90) {
            grade='A';
        }
        else if(avmarks>=75) {
            grade='B';
        }
        else if(avmarks>=65) {
            grade='C';
        }
        else if(avmarks>=50) {
            grade='D';
        }
        else {
            grade='F';
        }
        System.out.println("------------RESULT-----------");
        System.out.println("Total marks: "+ totalmarks);
        System.out.println("Average percentage: "+ avmarks +"%");
        System.out.println("Grade: "+ grade);
        System.out.println("-----------------------------");
        System.out.println("**********Program Ended*********");
        System.out.println("Do you want to calculate again? (Y/N): ");
        choice = sc.next().charAt(0);
        }
        while(choice == 'Y' || choice == 'y');
        sc.close();
    }
}
