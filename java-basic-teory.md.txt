# Java Teory
## Material 
1. Java Object 
2. Java Class 
3. Variable Primitive 
4. Constructor 
5. Overloading 
6. Inheritance 
7. Overriding  
8. Super
9. Java Beans and Encapsulation
10. Polymorphism 
11. Access Modifier
12. substring

## Java Object 
* java object merupakan proses instansiasi dari sebuah java class
* example 
```java
    String[] data = new String[5];
	Object object = new Object(); //proses instansiasi object
	Employee employee = new Employee();
	Integer myinteger = new Integer(5);
	int myint = 5;
```

## Java Clas
* merupakan descripsi atau blue print dari sebuah object.
* example : 
```java
//java class
class Motor{
	//properties
	String merk;
	String color;
	String platNomor;
	Double price;
}

//ketika java class mau dipanggil maka, 
//Motor motor = new Motor(); //java object / instansiasi object
```

## Variable Primitive
* merupakan sebuah variable yang tidak mememiliki class reference 
atau hanya type data itu sendiri.
* contoh : 
```java
int a = 5;
char b= '5';
double c = 400.0;
```

## Constructor
* sebuah contructor akan dijalankan ketika 
terjadinya instansiasi dari sebuah class
* Contoh : 
```java
class Employee{
    //empty constructor
    Employee(){
        System.out.println("hallo constructor");
    }
    //parameter consturctor / overloading constructor
    Employee(String username){
        System.out.println("hallo : "+ username);
    }
    public void info(){
        System.out.println("hallo world");
    }
}

public class MyContructor {
    public static void main(String[] args) {
        Employee emp =  new Employee();
        Employee emp2 = new Employee("husni");
       // emp.info();
    }
}
```

## Overloading
* adalah sebuah method / constructor yang memiliki nama yang sama
namun memiliki perbedaan dalam : 
	1. jumlah paremeter
	2. Class Refference / datatype

* contoh : 
```java
public class MyOverloading {
    
    //method 1
    public void info(){
    }
    
    //overload jumlah parameter
    public void info(String username){
    }
    //overload
    public void info(String username, int age){
    }
    //overload
    public void info(int age){
    }
    
    public static void main(String[] args) {
        MyOverloading over = new MyOverloading();
        over.info();
    }
}
```	

## Inheritance 
* sebuah super class yang dapat diturunkan kepada subclass 
dengan memiliki kesamaan description / properties
* contoh : 
```java
class EmployeeX{
    String name;
    String email;
}

class ManagerX extends EmployeeX{
}

class DirectorX extends ManagerX{
}

//key dari inhiritance adalah 'IS'
public class MyInheritance {
    public static void main(String[] args) {
        EmployeeX emp = new EmployeeX();
        emp.name="rusdan";
        DirectorX dir = new DirectorX();
        dir.name = "dini";
        //polymorphism
//        EmployeeX manager = new ManagerX();
//        manager.name = "dono";       
    }
}
```

## Overriding
* re-define method dari super class
* contoh : 
```java
class EmployeeX{ //super class
    private String name;
    private String email;
    private double salary=2000;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    //getter
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
    
    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class ManagerX extends EmployeeX{ //subclass

    @Override
    public double getSalary() {
        return super.getSalary() * 2; //To change body of generated methods, choose Tools | Templates.
    }
    
}

class DirectorX extends ManagerX{

    @Override
    public double getSalary() {
        return super.getSalary() * 2; //To change body of generated methods, choose Tools | Templates.
    }
    
}

//key dari inhiritance adalah 'IS'
public class MyInheritance {
    public static void main(String[] args) {
        EmployeeX emp = new EmployeeX();
        //polymorphism
        EmployeeX mng = new ManagerX();
        DirectorX dir = new DirectorX();
        
        emp.setName("dono");
        System.out.println("name : "+ emp.getName() + ", salary : "+ emp.getSalary());
        //manager
        mng.setName("dini");
        System.out.println("name : "+ mng.getName() + ", salary : "+ mng.getSalary());
        
        //dir
        dir.setName("denis");
        System.out.println("name : "+ dir.getName() + ", salary : "+ dir.getSalary());       
    }
}

```

## Super keyword
* yaitu sebuah keyword yang merujuk / memanggil resource kepada superclass
* contoh: 
```java
@Override
public double getSalary() {
	return super.getSalary();
}
```

## Encapsulation
* yaitu teknik untuk membungkus / menyembunyikan properties pada suatu class (private)
dan mengaksesnya melalui method yang public
* Enkapsulasi adalah 
teknik dalam java dengan membuat properties class menjadi private 
dan membuat akses tersebut melalui method public modifier
```java
//encapsulation -> POJO -> java bean
class EmployeeX{ 
    //properties
    private String name;
    private String email;
    private double salary=2000;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    //getter
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
    
    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
```

## Polymorphism
* merupakan kemampuan dalam OOP untuk membuat object 
reference variable dengan banyak bentuk.
* contoh : 
```java
	EmployeeX employee = new DirectorX();
```

## Access Modifier
### public 
* yaitu bisa mengakses resource dalam sebuah project, pada : 
	1. class yang sama
	2. class yang berbeda 
	3. package yang berbeda
	
### protected
* yaitu bisa mengakses resource dalam sebuah project, pada :
	1. class yang sama
	2. class yang berbeda (masih dalam satu package yang sama)
	3. package yang berbeda (inheritance) 
		kecuali (hasil dari instance)

### default 
* yaitu bisa mengakses resource dalam sebuah project, pada :
	1. class yang sama
	2. class yang berbeda (masih dalam satu package yang sama)
	
### private 
* yaitu bisa mengakses resource dalam sebuah project, pada :
	1. class yang sama
	
RULES : 
## Logic 
1. kerjakan sesuatu / nomor yang dianggap paling mudah
2. tidak nyontek
3. kerjakan pola terlebih dahulu
4. pola harus dinamis
5. jangan lupa harus menggunakan scanner

## Database 
1. membuat serangkaian Relasi Table.
2. Isi table nya
2. JOIN ke tampilan data.

## Java Teory
1. sesuai yang sudah di pelajari

## GOOD LUCKy Luck ##
	
