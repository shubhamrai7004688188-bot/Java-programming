import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first no");
        int firstNum = sc.nextInt();
        System.out.println("Enter the vbalue of second no ");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Solution is " + ans);
        
    }
    
}
    