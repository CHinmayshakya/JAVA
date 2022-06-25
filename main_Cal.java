import java.util.*;
import java.lang.*;

class IncorrectNameException extends RuntimeException
{
    IncorrectNameException(String str)
    {
        super(str);
    }
}

class IncorrectDepartException extends RuntimeException
{
    IncorrectDepartException(String str)
    {
        super(str);
    }
}
class Cal{
Scanner sc=new Scanner(System.in);
void input()
{
    String name;
    int dept_id;
    System.out.println("enter the name:");
    name=sc.nextLine();
    System.out.println("enter department id:");
    dept_id=sc.nextInt();
    try{
        if(Character.isLowerCase(name.charAt(0))==true)
        {
            throw new IncorrectNameException("not valid name");
        }
        if(dept_id<1||dept_id>5)
        {
            throw new IncorrectDepartException("invalid department");

        }
        System.out.println("name is:"+name+"\n");
        System.out.println("department id:"+dept_id+"\n");

    }
    catch(IncorrectNameException e)
    {
        e.printStackTrace();
    }
    catch(IncorrectDepartException e1)
    {
        e1.printStackTrace();
    }
}
}
public class main_Cal{

    public static void main(String [] args)
{
    Cal obj=new Cal();
    obj.input();
}

}