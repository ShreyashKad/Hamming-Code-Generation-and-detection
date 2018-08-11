import java.io.*;
import java.lang.*;

class exp3_rec
{

	public static void main(String[] args)throws Exception
	{
		int size = 0 , j = 0, parityCheck = 0, sizeOfErrorArray=0, temp= 0;
		int[] dataArray = new int[50];
		int[] error = new int[10];
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		System.out.println("No. of bits to receive:");
		size = Integer.parseInt(br.readLine());
		
		System.out.println("Enter received bits (one bit per one line):");
		for(int i = 1; i <= size ; i++)
			dataArray[i] = Integer.parseInt(br.readLine());
		
		j = 0;
		System.out.println("Data received: ");	
		for(int i = size; i >= 1 ; i--)
			System.out.print(dataArray[i]+" ");
	
		j = 0;
		int c = 1;
		int indi = 1;

		for(int i = 1; i <= size ; i++)
			if(i == Math.pow(2,j))
			{
				temp = dataArray[i];
				dataArray[i] = 0;
				
				c = i;
				indi = 1;
				
				while(c <= size)
				{
					
					while(indi <= i)
					{
						
						parityCheck += dataArray[c];
						c++;
						indi++;
						if(c>size)
							break;
					}
					indi = 1;
					
					if(c>size)
						break;
					
					while(indi <= i)
					{
						c++;
						indi++;
						if(c>size)
							break;
					}
					
					indi = 1;
				}		
				
				if(temp == parityCheck % 2)
					error[sizeOfErrorArray] = 0;
				else
					error[sizeOfErrorArray] = 1;
				
				
				parityCheck = 0;
				j++;
				sizeOfErrorArray++;
			}
	
		System.out.println("\nHamming Code dettected error at bit position: ");	
		for(int i = sizeOfErrorArray-1; i >= 0 ; i--)
			System.out.print(error[i]+" ");		
	}
}