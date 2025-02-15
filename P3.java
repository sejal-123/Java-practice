import java.io.*;

class Student{
private int rno;
private String name;

public Student(int rno, String name) {
this.rno = rno;
this.name = name;
}

public void showData() {
System.out.println("Rno = " + rno + " Name = " + name);
}
}

class P3 {
public static void main(String args[]) throws IOException {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
Console c = System.console();
System.out.println("Enter rno: ");
int rno = Integer.parseInt(br.readLine());
String name = c.readLine("Enter name: ");

Student s = new Student(rno, name);
s.showData();

}
}