//1.
public void f1(int rows,int columns)
{
        Random r=new Random();
        int[][] arr1=new int[rows][columns];
        int i,j;
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
                arr1[i][j]=r.nextInt(101);
        }
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
}
//2.
public void f2()
{
        Scanner scan=new Scanner(System.in);
        int[][] arr2=new int[3][3];
        int i,j,maxLine=0;
        for(i=0;i<arr2.length;i++)
        {
            for(j=0;j<arr2[i].length;j++)
            {
                System.out.println("Enter number between 0-100:");
                arr2[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<arr2.length;i++)
        {
            int sumLine=0;
            for(j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
                sumLine = sumLine + arr2[i][j];
            }
            System.out.println();
            if(sumLine>maxLine)
                maxLine=sumLine;
        }
        System.out.println(maxLine);
}