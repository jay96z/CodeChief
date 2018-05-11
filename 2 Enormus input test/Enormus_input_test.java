import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Enormus_input_test{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =br.readLine();
        String ip[]=input.split(" ");
        int n=Integer.parseInt(ip[0]);
        int k=Integer.parseInt(ip[1]);
        String temp_ip;
        long num;
        int count=0;
        if(n>=0 && k>=0 && n<=10000000 && k<=10000000)
        {
            for(int i=0;i<n;i++)
            {
                temp_ip=br.readLine();
                num=Long.parseLong(temp_ip);
                if(num>=0 && num <= 1000000000 && num%k==0)
                    count++;
            }
            System.out.println(count);
        }
    }
}