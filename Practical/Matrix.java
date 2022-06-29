class Matrix{
public static void main(String args[])
{
int rows,cols;
Scanner sc=new Scanner(System.in)
System.out.println("How many rows");
rows=sc.nextInt();
System.out.println("How many columns");
cols=sc.nextInt();
int arr[][]=new int[rows][cols];

for(int i=0;i<rows;i++)
{
	for(j=0;j<cols;j++)
	{
		SYstem.out.print("Enter values for the array")
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0; i<rows;i++)
{
	for(intj=0;j<cols;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
sc.close();
}
}
