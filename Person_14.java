class Person_14
{
    private String name,fathersName,dob;
    private int age;
    
    Person_14(String name,String FN,String DOB,int A)
    {
        this.name = name;
        fathersName = FN;
        dob = DOB;
        age = A;
    }
    
     public String toString()
    {
        String S = "";
        S = "Name: "+name+"\nFather's Name: "+fathersName+"\nDate Of Birth: "+dob;
        S = S + "\nAge: "+age;
        return S;
    }
}
