public class Student {
    private String name;
    private int roll_no;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void printGrade(){
        if(score>= 80){
            System.out.println(name+ " got an A");

        }else {
            System.out.println(name+ "didnt get A");
        }


    }
}
