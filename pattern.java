import java.util.*;

public class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[] arr = new char[str.length()];
        int sum=0,temp=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                sum += Integer.parseInt(String.valueOf(arr[i]));
            }
        }
        if(sum == (r*c))
        {
            for(int i=0;i<str.length();i+=2)
            {
                int k = str.charAt(i)-'0';
                while(k!=0)
                {
                    if(temp!=c)
                    {
                        System.out.print(str.charAt(i+1));
                        k--;
                        temp++;
                    }
                    else
                    {
                        temp=0;
                        System.out.println();
                    }
                }
                
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        
        sc.close();
    }
}
