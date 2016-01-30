public class MyGitHello{
   int count;
  public static void main(String[] args){
    MyGitHello myGit = new MyGitHello();
    System.out.println("Hello Git :" +myGit.testMyGit());
  }

  private int testMyGit(){
		
		return count++;
	}
}
