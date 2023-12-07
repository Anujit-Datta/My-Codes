abstract class Role{
  void displayRole(String role);
}

class Person implements Role{
  String name='';
  String address='';
  int age=0;
  Person(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
  }
  @override
  void displayRole(String role) {
    print('Role: $role');
  }
}

class Student extends Person{
  int studentID=0;
  double grade=0.0;
  List courseScores=[];
  double averageCalculator(){
    double temp=0;
    courseScores.forEach((element) {temp+=element;});
    return temp/courseScores.length;
  }
  _printInfo(){
    print('Name: $name \nAge: $age \nAddress: $address \nAverage Score: $grade');
  }
  Student(String name,int age,String address,int id,List courseScores) : super(name, age, address){
    this.studentID=id;
    this.courseScores=courseScores;
    this.grade=averageCalculator();
    print('Student Information:');
    displayRole('Student');
    _printInfo();
  }
}

class Teacher extends Person{
  int teacherID=0;
  List courseTought=[];
  _printInfo(){
    print('Name: $name \nAge: $age \nAddress: $address \nCourses Taught:');
    courseTought.forEach((element) {print('- $element');});
  }
  Teacher(String name,int age,String address,int id,List courseTought) : super(name, age, address){
    this.teacherID=id;
    this.courseTought=courseTought;
    print('Teacher Information:');
    displayRole('Teacher');
    _printInfo();
  }
}

void main(){
  Student('John Doe', 20, '123 Main St', 1, [90,85,82]);
  Teacher('Mrs. Smith', 35, '456 Oak St', 1, ['Math','English','Bangla']);
}