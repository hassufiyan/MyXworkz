class Student{
String name;
int usn;
String dob;
String branch;
String college;
String grades;
void studying(){
System.out.println(name+" is the student of "+branch+" engineering branch"+" whose usn is "+usn+" and date of birth is "+dob+" studying in "+college);
}
void result(){
System.out.println(name+" has scored "+grades+" grade in all Subjects");
}
public static void main(String [] args)
{
Student sam=new Student();
sam.name="Sam";
sam.usn=1234;
sam.dob="10-10-1990";
sam.branch="civil";
sam.college="R.I.T";
sam.grades="\"A\"";
sam.studying();
sam.result();

Student jack=new Student();
jack.name="jack";
jack.usn=147369;
jack.dob="11-10-1995";
jack.branch="civil";
jack.college="R.I.T";
jack.grades="\"B\"";
jack.studying();
jack.result();
}
}
 