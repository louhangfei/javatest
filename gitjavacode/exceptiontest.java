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

	public void run() throws  LanpingExceptin��MaoyanExceptin
	{
		if(state==2)
			throw new LanpingExceptin("������");
		if (state==3)
		{throw new MaoyanExceptin("mð����");
		}
		System.out.println("��������");
	}
	public void reset()
	{
	System.out.println("��������");
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
		System.out.println("����");
	}
}

class exceptiontest
{
		public static void main(String[] args)
	{
			Teacher t=new Teacher("����ʦ");
			t.prelect();
	}
}