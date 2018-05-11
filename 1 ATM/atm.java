import java.text.DecimalFormat;
import java.util.Scanner;

class ATM_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Input
        int x=sc.nextInt();   // positive integer
        double y=sc.nextDouble(); // non negative number (2 digit precision)
        DecimalFormat df2 = new DecimalFormat(".##");
        if(x+0.5<=y && x>0 && x<=2000 && x%5==0 && y<=2000 && y>=0 )
        {
            y=y-x-0.5;
            String temp_y=df2.format(y);
            System.out.println(y);
        }
        else    System.out.println(df2.format(y));
    }
}
