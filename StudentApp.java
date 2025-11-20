public class StudentApp{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter student name:");
String name=sc.nextLine();
System.out.println("Enter student age");
int age=sc.nextInt();
System.out.println("Student Registered:"+name+"(Age"+age+")");
}
}
