
public class Cconverter {
import java.util.Scanner;
	public static void main(String[] args) {
		double inr,usd,euro,yen ;
		int ch;
		Scanner in=new Scanner(System.in);
		do
		{
		System.out.println(&quot;1.dollar to rupee &quot;);
		System.out.println(&quot;2.rupee to dollar &quot;);
		System.out.println(&quot;3.Euro to rupee &quot;);

		System.out.println(&quot;4..rupee to Euro &quot;);
		System.out.println(&quot;5.Yen to rupee &quot;);
		System.out.println(&quot;6.Rupee to Yen &quot;);
		System.out.println(&quot;enter you choice&quot;);
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
		{
		System.out.println(&quot;Enter dollars to convert into Rupees:&quot;);
		usd=in.nextInt();
		inr=usd*67;
		System.out.println(&quot;Dollar =&quot;+usd+&quot;equal to INR=&quot;+inr);
		break;
		}
		case 2:
		{
		System.out.println(&quot;Enter Rupee to convert into Dollars:&quot;);
		inr=in.nextInt();
		usd=inr/67;
		System.out.println(&quot;Rupee =&quot;+inr+&quot;equal to Dollars=&quot;+usd);
		break;
		}
		case 3:
		{
		System.out.println(&quot;Enter euro to convert into Rupees:&quot;);
		euro=in.nextInt();

		inr=euro*86.88;
		System.out.println(&quot;Euro =&quot;+euro +&quot;equal to INR=&quot;+inr);
		break;
		}
		case 4:
		{
		System.out.println(&quot;Enter Rupees to convert into Euro:&quot;);
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println(&quot;Rupee =&quot;+inr +&quot;equal to Euro=&quot;+euro);
		break;
		}
		case 5:
		{
		System.out.println(&quot;Enter yen to convert into Rupees:&quot;);
		yen=in.nextInt();
		inr=yen*0.61;
		System.out.println(&quot;YEN=&quot;+yen +&quot;equal to INR=&quot;+inr);
		break;
		}
		case 6:
		{
		System.out.println(&quot;Enter Rupees to convert into Yen:&quot;);
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println(&quot;INR=&quot;+inr +&quot;equal to YEN&quot;+yen);
		break;

		}
		}
		System.out.println(&quot;Enter 0 to quit and 1 to continue &quot;);
		ch=in.nextInt();
		}while(ch==1);
		}
		}
	}

}
