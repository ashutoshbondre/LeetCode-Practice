private static void factor(int n) {
		
		for(int i=1;i<n/2;i++)
		{
			if(n%i==0 && i<=n/i)
			{
				System.out.println(i + "---" + n/i);
			}
		}
	}
