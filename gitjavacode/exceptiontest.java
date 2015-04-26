//java

class LanpingException extends Exception
{
	LanpingException(String message)
	{
		super(message);
	}
}

class MaoyanException extends Exception
{
	MaoyanException(string message)
	{
	super(message);
	}
}
class Computer
{
	private int state=1;

	public void run() throws  LanpingExceptin，MaoyanExceptin
	{
		if(state==2)
			throw new LanpingExceptin("蓝屏了");
		if (state==3)
		{throw new MaoyanExceptin("m冒烟了");
		}
		System.out.println("电脑运行");
	}
	public void reset()
	{
	System.out.println("电脑重启");
	}
}

class Teacher
{ 
	private String name;
	private Computer cmpt;
	Teacher (String name)
	{
		this.name=name;
		cmpt=new Computer();
	}
	
	public void prelect()
	{
		cmpt.run();
		System.out.println("讲课");
	}
}

class exceptiontest
{
		public static void main(String[] args)
	{
			Teacher t=new Teacher("毕老师");
			t.prelect();
	}
}