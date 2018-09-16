
public class TestOverLoad {
	
    public void disp(float num)  
    {
         System.out.println(num);
    }

    public void disp(float c, int num)  
    {
         System.out.println(c + " "+num);
    }

	public static void main(String[] args) {
		TestOverLoad obj = new TestOverLoad();
	       obj.disp('a','a');
	       obj.disp(10,10);
	       obj.disp(10.56f);
		
	}

}
