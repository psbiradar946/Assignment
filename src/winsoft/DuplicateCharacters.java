package winsoft;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String string1 = "Prathmesh Santosh Biradar ";
		int count;
		char string[]= string1.toCharArray();
		System.out.println("Duplicate Characters in a given String: ");
		for(int i=0;i<string.length;i++)
		{
			count = 1;
			for(int j = i+1; j<string.length;j++)
			{
				if(string[i]==string[j]&& string[i] != '0') 
				{
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i] !='0')
			{
				System.out.println(string[i]);
			}
		}
	}

}
