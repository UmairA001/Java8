	//both class and interface uses in main mtdh class (for more SuperClass must be visit).
//public class NewClass extends SuperClass implements NewInterface{ 

	//if one or more than one interface use (for more go through NewInterface & Old Interface interface).
public class NewClass implements NewInterface,OldInterface{

	public int add(int x,int y){
		return x+y;
	}


//Overrided mtdh of interface 
//if this mtdh is overrided in main mtdh then this mdth is local var so if someone call it with same signature then it call from here not outside the class.

/*	public int sub(int x,int y){
		return x+y;
	}*/


	public static void main(String[] args){
		NewClass nc=new NewClass();
		System.out.println(nc.add(2,6));
		System.out.println(NewInterface.sum(10,20));	//through instance name we call static mtdh of interface.
//		System.out.println(nc.sub(4,8));		//through instance variable name we call non-static mtdh of interface.


//		System.out.ptintln(NewInterface.sub(4,8));	// non-static method sub(int,int) cannot be referenced from a static context coz non-static mtdh call with instance var reference.


		SuperClass sc=new SuperClass();
		System.out.println(sc.sub(20,30));

//		System.out.println(OldInterface.sub(20,30,20));		//non-static method sub(int,int,int) cannot be referenced from a static context coz non-static mtdh call with instance var reference.

//		System.out.println(OldInterface.sub(20,30));
	}
}
