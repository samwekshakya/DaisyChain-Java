package co;
import java.util.Random; 
public class DaisyChain {

	public static void main(String[] args) {
		Random ran=new Random(System.currentTimeMillis()); 
		int p[]=new int[5]; 
		int pc1=0,pc2=0,pc3=0,pc4=0,pc5=0; 
		
		for(int i=0;i<20;i++)
		{
			p[0]=ran.nextInt();
			p[1]=ran.nextInt(); 
			p[2]=ran.nextInt();
			p[3]=ran.nextInt(); 
			p[4]=ran.nextInt(); 
			
			   if(p[0]>p[1] && p[0]>p[2] && p[0]>p[3] && p[0]>p[4])
			        pc1++;

			    else if(p[1]>p[0] && p[1]>p[2] && p[1]>p[3] && p[1]>p[4])
			        pc2++;
			        
			    else if(p[2]>p[0] && p[2]>p[1] && p[2]>p[3] && p[2]>p[4])
			        pc3++;
			        
			    else if(p[3]>p[0] && p[3]>p[1] && p[3]>p[2] && p[1]>p[4])
			        pc4++;
			        
			    else
			        pc5++;
		}
		System.out.println("Device 1 interrupted: "+pc1+" times");
		System.out.println("Device 2 interrupted: "+pc2+" times");
		System.out.println("Device 3 interrupted: "+pc3+" times");
		System.out.println("Device 4 interrupted: "+pc4+" times");
        System.out.println("Device 5 interrupted: "+pc5+" times");
        
        System.out.println();
        
        
        if(pc1>pc2 && pc1>pc3 && pc1>pc4 && pc1>pc5)
        	System.out.println("Device 1 is prioritized");
        
        else if(pc2>pc1 && pc2>pc3 && pc2>pc4 && pc2>pc5)
        	System.out.println("Device 2 is prioritized");
        
        else if(pc3>pc1 && pc3>pc2 && pc3>pc4 && pc3>pc5)
        	System.out.println("Device 3 is prioritized");
        
        else if(pc4>pc1 && pc4>pc3 && pc4>pc2 && pc4>pc5)
        	System.out.println("Device 4 is prioritized");
        
        else 
        	System.out.println("Device 5 is prioritized");
	}
}
