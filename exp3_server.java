import java.io.*;
import java.lang.*;

class exp3_server
{

	public static void main(String[] args)throws Exception
	{
		int r = 0, d = 0, size = 0 , j = 0, parityCheck = 0;
		int[] dataArray = new int[50];
		
		System.out.print("Enter no. of data bits: ");
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		d = Integer.parseInt(br.readLine());

		while(Math.pow(2,r)<d+r+1)
			r++;

		size = r + d;
		
		System.out.println("Enter data bits to send:");
		for(int i = 1; i <= size ; i++)
		{
			if(i == Math.pow(2,j))
			{
				j++;
				dataArray[i] = 0;
			}
			else
				dataArray[i] = Integer.parseInt(br.readLine());
		}	
		
		j = 0;
		System.out.println("Data to be sent: ");	
		for(int i = 1; i <= size ; i++)
			/*if(i == Math.pow(2,j))
				j++;
			else*/
				System.out.print(dataArray[i]+" ");
	
		j = 0;
		int c = 1;
		int indi = 1;

		for(int i = 1; i <= size ; i++)
			if(i == Math.pow(2,j))
			{
				System.out.println("data bit: "+i);
				c = i;
				indi = 1;
				while(c <= size)
				{
					
					while(indi <= i)
					{
						parityCheck += dataArray[c];
						c++;
						indi++;
					}
					indi = 1;
					while(indi <= i)
					{
						c++;
						indi++;
					}
				}		
				
				dataArray[i] = parityCheck % 2;
				parityCheck = 0;
				j++;
			}
	
		System.out.println("\nHamming Code: ");	
		for(int i = 1; i <= size ; i++)
			System.out.print(dataArray[i]+" ");		
	}
}