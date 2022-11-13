public class Teacher extends Persun {
    private double salary;
    private String subject;
    private int job_no;
    public Teacher(String fname,String sname,int a,double sal,String sub,int j)
    {
        super(fname,sname,a);
        salary=sal; subject=sub;job_no=j;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getSubject()
    {
        return subject;
    }
    public int getJob_no()
    {
        return job_no;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("the salary of teacher is : "+salary);
        System.out.println("the subject of teacher is  : "+subject);
        System.out.println("the number of teacher is : "+job_no);
    }
}


