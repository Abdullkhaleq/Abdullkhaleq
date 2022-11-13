public class Persun {
    private String firstname;
    private String surname;
    private int age;
    public Persun(String fname,String sname)
    {
        firstname=fname;surname =sname;age=0;
    }
    public Persun(String fname,String sname,int a)
    {
        firstname=fname;surname=sname;age=a;
    }
    public void setName(String fname,String sname)
    {
        firstname=fname;surname=sname;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public String getName(){return surname;}
    public int getAge(){return age;}

    public void displayDetails()
    {
        printHeader();
        System.out.println("the name is :"+firstname+" "+surname);
        System.out.println("the age is : "+age);

    }
    private void printHeader()
    {
        System.out.println("**************************************");
        System.out.println("Details");
        System.out.println("****************************************");
    }

}
