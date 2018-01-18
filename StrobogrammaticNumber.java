public class Solution{
	public boolean isStrobogrammatic(String num)
	{
		String s = "00 11 88 696"
		for(int i=0,j=num.length()-1; i<=j;i++,j--)
		{
			if(!s.contains(num.chatAt(i)+""+num.chatAt(j)))
				return false;
		}
		return true;
	}
}