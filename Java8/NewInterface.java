interface NewInterface{

//Before java8 only abstarct mtdh were used in interface but in JAVA8 after JAVA7 static and non-static mtdh is now used.

	public static final int age=20;
	public abstract int add(int x,int y);
	
        //1st mtdh

//if mtdh of interface is static then this mtdh where call in implements class through interface name not the instance of implements class
//this feature where came in JAVA8 before it this feature is no avilable for static mtdh use in interface.

	static int sum(int x,int y){ 
		return x+y;
	}

	//2nd mtdh

//if mtdh of interface is non-static then this mtdh where call in implements class through instance of implements class not of interface.
//here default is a keyword not a access modifier it's uses to create non-static mtdh in interface.
//this feature where came in JAVA8 before it this feature is no avilable for non-static mtdh use in interface.

	default int sub(int x,int y){
		return (x<y)?(y-x):(x-y);
	}
}
