package ohtu;

public class Submission {
    private String student_number;
    private String week;
    private String hours;
    private String points;
    
    // This is so ridiculously ugly.
    private Boolean a1;
    private Boolean a2;
    private Boolean a3;
    private Boolean a4;
    private Boolean a5;
    private Boolean a6;
    private Boolean a7;
    private Boolean a8;
    private Boolean a9;
    private Boolean a10;
    private Boolean a11;
    private Boolean a12;
    private Boolean a13;
    private Boolean a14;
    private Boolean a15;
    private Boolean a16;
    private Boolean a17;
    private Boolean a18;
    private Boolean a19;
    private Boolean a20;
    private Boolean a21;



    private String done() {
        Boolean[] exercises = {
        this.a1,
        this.a2,
        this.a3,
        this.a4,
        this.a5,
        this.a6,
        this.a7,
        this.a8,
        this.a9,
        this.a10,
        this.a11,
        this.a12,
        this.a13,
        this.a14,
        this.a15,
        this.a16,
        this.a17,
        this.a18,
        this.a19,
        this.a20,
        this.a21};
        String ret = "";
        for (int i = 1; i <= 21; i++) {
            if (exercises[i-1] != null && exercises[i-1] != false) {
                ret += i + " ";
            }
        }
        return ret;
    }
    
    private int numberOfDone() {
        String ex = done();
        return ex.length() - ex.replaceAll(" ", "").length();
    }

    @Override
    public String toString() {
        String s = "Week: " + week + ", ";
        s += "Student number: " + student_number + ", ";
        s += "Completed exercises: " + numberOfDone() + ", ";
        s += "Time spent: " + hours + ", ";
        s += "Exercises: " + done();
        return s;
    }
    
}