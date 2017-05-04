public class charplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		place("AzaDdef");

	}

	private static void place(String s) {
		// TODO Auto-generated method stub
		
		String ans = "";
		int pos=1;
		for(char c:s.toCharArray())
		{
			ans = ans + Character.toString((char) (((c-'a'+pos) %26) +'a'));
			
		}
		System.out.println(ans);;
	}

}
