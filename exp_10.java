import java.util.*;

public class exp_10

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String txt = sc.nextLine();

        System.out.println("Enter the Pattern:");

        String pattern = sc.nextLine();

        System.out.println("Enter the q value:");

        int q = sc.nextInt();

        search(pattern, txt, q);

    }

    public final static int d = 10;



    static void search(String pattern, String txt, int q)

    {

        int m = pattern.length();

        int n = txt.length();

        int i, j;

        int p = 0;

        int t = 0;

        int h = 1;

        for (i = 0; i < m - 1; i++)

            h = (h * d) % q;

        // Calculate hash value for pattern and text

        for (i = 0; i < m; i++)

        {

            p = (d * p + pattern.charAt(i)) % q;

            t = (d * t + txt.charAt(i)) % q;

        }

        // Find the match

        for (i = 0; i <= n - m; i++)

        {

            if (p == t)

            {

                for (j = 0; j < m; j++)

                {

                    if (txt.charAt(i + j) != pattern.charAt(j))

                        break;

                }

                if (j == m)

                    System.out.println("Pattern is found at position: " + (i + 1));

            }

            if (i < n - m)

            {

                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                if (t < 0)

                    t = (t + q);

            }

        }

    }

}