public class TestForAll {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", "asmeyl", 22, 2000);
        Student s2 = new Student("Ahmed", "Alhedad", 20, 2525);
        Student s3 = new Student("Ahmed", "Alhedad", 23, 6543);


        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        Teacher t1 = new Teacher("Amjad", "Adel", 30, 90.50, "math", 2454);
        Teacher t2 = new Teacher("Ali", "Salah", 35, 50.70, "English", 8787);
        Teacher t3 = new Teacher("Afif", "fahd", 40, 80.90, "Arabic", 3232);

        t1.displayDetails();
        t2.displayDetails();
        t3.displayDetails();

        Family Father = new Family("khalid", "waleed", 60);
        Family Mother = new Family("Araw", "Naji", 50);
        Father.displayDetails();
        Mother.displayDetails();


    }

}
