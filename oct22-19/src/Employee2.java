
public class Employee2 {
	String name;
	int eid;
	long aadharno;
	Employee2(String name, int eid,long aadharno){
		this.name = name;
		this.eid = eid;
		this.aadharno = aadharno;
	}
	
	Employee2( int eid,String name){
		
		this.eid = eid;
		this.name = name;
	}
	
	void showDetails() {
		System.out.println(name+' '+eid+' '+aadharno);
	}

	
}
