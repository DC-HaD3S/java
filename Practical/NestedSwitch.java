class NestedSwitch
{
public static void main(String args[])
{
char branch = 'c';
int year = 3;
switch(year)
{
case 1:
System.out.println("English,Maths,Science");
break;

case 2:
 switch(branch)
	{
	case 'c':
	System.out.println("C programming");
	break;
	case 'e':
	System.out.println("Digital Electronics");
	break;
	case 'f':
	System.out.println("Mechanics");
	break;
	default:
	System.out.println("Invalid input");
	break;
	}
case 3:
 switch(branch)
	{
	case 'c':
	System.out.println("C ++");
	break;
	case 'e':
	System.out.println("Physics");
	break;
	case 'm':
	System.out.println("Architecture Design");
	break;
	default:
	System.out.println("Invalid input");
	break;
}
case 4:
 switch(branch)
	{
	case 'c':
	System.out.println("Python");
	break;
	case 'e':
	System.out.println("Java");
	break;
	case 'm':
	System.out.println("Calculus");
	break;
	default:
	System.out.println("Invalid input");
	break;
}
}
}
}
