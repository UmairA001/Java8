class SuperClass{

//if we use mtdh without any accessfier mod and same signature mtdh were used in any interface as non-static & this both the class and interface were 
//call in main mtdh with extends class as well as implemnts interface (public class NewClass extends SuperClass implements NewInterface{ )
//then it gives error at CompTime so in this case 2nd mtdh we use public mtdh of SuperClass Class sub mtdh run easily.

	//1st mtdh without any access mod.

/*	int sub(int a,int b){
	       return a-b+200;
        }*/

	//2nd mtdh with public keyword.

	public int sub(int a,int b){
		return a-b+120;
	}
}
