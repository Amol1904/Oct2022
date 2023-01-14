package Maven_project1.MaProject1;

public class POJOTest 
{

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("Priyanka");
		e.setEmpAddress("abc");
		System.out.println(e);
		
		e.setEmpId(102);
		e.setEmpName("Ankita");
		e.setEmpAddress("pqr");
		System.out.println(e);
		
	}

}
