class TestStatic{
     int rollno;
     String name;
     static String college = "ITS";
     
     static void change(){
     college = "BBDIT";
     }
     
     TestStatic(int r, String n){
     rollno = r;
     name = n;
     }

     void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
    TestStatic.change();

    TestStatic s1 = new TestStatic (111,"Karan");
    TestStatic s2 = new TestStatic (222,"Aryan");
    TestStatic s3 = new TestStatic (333,"Sonoo");

    s1.display();
    s2.display();
    s3.display();
    TestStatic.college = "s";
    System.out.println(TestStatic.college);
    
    TestStatic s4 = new TestStatic (433,"Ponoo");
    s4.display();
    }
}
