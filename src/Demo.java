
public class Demo {

	
	private Demo() {
		
	}
	public static void main(String[] args) {
		
	Demo d = new Demo();
		System.out.println(d.method1());

	}
	
	public static Demo newObject(){
		return  new Demo();
	}

	@SuppressWarnings("finally")
	public String method1() {
		try {
			return "try";
		} catch(Exception e) {
			
		}	finally {
			return "finally";
		}
	}
}

class fake{
	public static void main(String[] a) {
		Demo.newObject();
	}
}
