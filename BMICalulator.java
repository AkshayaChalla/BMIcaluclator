import java.util.Scanner;
public class BMICalulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur weight");
        double weight = sc.nextDouble();
        System.out.print("enter weeight");
        double height = sc.nextDouble();
        double bmi = weight / (height + height);
        System.out.printf("ypur bmi is: %.2f\n ",bmi);
        if(bmi < 20){
            System.out.println("low bmi");
        }else if(bmi >= 20 && bmi < 25){
            System.out.print("bmi is normal");
        }else{
            System.out.println("oveer bmi");
        }
        sc.close();

    }
    
}
