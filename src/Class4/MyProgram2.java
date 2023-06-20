package Class4;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStat = "Welcome to my class [Pargolteacher.com]";
		
		int startWord = myStat.indexOf("Pargol") + "Pargol".length();
		
		
		int endWord = myStat.indexOf(".com]");//if theres multiple.com, then it shows the last one. 
		
		System.out.println(startWord);
		System.out.println(endWord);
		
		String outStat = myStat.substring(startWord, endWord);
		
		System.out.println(outStat);

	}

}
