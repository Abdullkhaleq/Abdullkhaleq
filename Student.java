public class Student extends Persun {
    private int student_no;
    public Student (String fname,String sname,int a,int num)
    {
        super(fname,sname,a);
        student_no=num;
    }
    public int getStuden_no()
    {
        return student_no;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("the number of student is : "+student_no);
    }


}
