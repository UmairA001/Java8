interface  OldInterface{

//Before java8 only abstarct mtdh were used in interface class but in JAVA8 after JAVA7 static and non-static mtdh is now used.

	//1st mtdh

//if mtdh of interface is non-static then this mtdh where call in implements class through instance of implements class not of interface class.
//here default is a keyword not a access modifier it's uses to create non-static mtdh in interface class.
//this feature where came in JAVA8 before it this feature is no avilable for non-static mtdh use in interface class.

	default int sub(int x,int y,int z){
		return x+y+z+100;
	}

	//2nd mtdh

//	int sub(int x,int y);		//Only Declaration definition in main mtdh(NewClass) class with overriding

	//3rd mthd

//if mtdh of interface is static then this mtdh where call in implements class through interface name not the instance of implements class
//this feature where came in JAVA8 before it this feature is no avilable for static mtdh use in interface class.

	static int sub(int x,int y){
                return x-y+100;
        }

}
