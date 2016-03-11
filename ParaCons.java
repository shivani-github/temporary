class First
	{
	int a;
	String name;
	private First(int i,String nm)
		{
		a=i;
		name=nm;
		}
	void show()
		{
		System.out.println(a+" "+name);
		}
	public static void main(String s[])
		{
		First f=new First(101,"Garima");
		First f1=new First(102,"Rakhi");
		f.show();
		f1.show();
		}

	}
/*class Second
	{
	static void func()
		{
		First f=new First();//error:no such constructor in class First... we need to create another default constructor,which can be called here ! 
		System.out.println(f.a);
		}
	}*/