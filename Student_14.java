 class Student extends Person_14
{
    private String Class;
    private int rollNo,marks_obtained;
    
    Student(String name,String FN,String DOB,int A,String C,int RN,int M)
    {
        super(name,FN,DOB,A);
        Class = C;
        rollNo = RN;
        marks_obtained = M;
    }
    
    public String toString()
    {

        String S = super.toString();
        S += "\nClass: "+Class+"\nRoll No. : "+rollNo+"\nMarks Obtained: "+marks_obtained;
        return S;
    }
}
