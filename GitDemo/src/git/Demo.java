package git;

public class Demo {

	public static void main(String[] args) {
	String s="study tonights";
	int n=0;
	char[]inp=s.toCharArray();
	System.out.println("Duplicate array");
	for(int i=0;i<s.length();i++)
		for(int j=i+1;j<s.length(); j++)
	if(inp[i]==inp[j]) {
		System.out.println(inp[j]);
		n++;
		break;
		
	}

	}

}
