package LAB_4.Part2.Service;

public class Grades {
    String math;
    String history;
    String english;

    public String getMath() {

        return math;
    }

    public void setMath(String math) {
        this.math = "Math:  " + math;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = "History: " + history;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = "English: " + english;
    }
}
