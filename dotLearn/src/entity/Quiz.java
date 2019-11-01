package entity;

public class Quiz {

    private String courseName,unitName, unitContain, quesContain,ans1,ans2,ans3,ans4,explain,comments;
    private int cid,realAns;

    public Quiz() {
    }

    public Quiz(String courseName, String unitName, String unitContain, String quesContain, String ans1, String ans2, String ans3, String ans4, String explain, String comments, int cid, int realAns) {
        this.courseName = courseName;
        this.unitName = unitName;
        this.unitContain = unitContain;
        this.quesContain = quesContain;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.explain = explain;
        this.comments = comments;
        this.cid = cid;
        this.realAns = realAns;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitContain() {
        return unitContain;
    }

    public void setUnitContain(String unitContain) {
        this.unitContain = unitContain;
    }

    public String getQuesContain() {
        return quesContain;
    }

    public void setQuesContain(String quesContain) {
        this.quesContain = quesContain;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getRealAns() {
        return realAns;
    }

    public void setRealAns(int realAns) {
        this.realAns = realAns;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "courseName='" + courseName + '\'' +
                ", unitName='" + unitName + '\'' +
                ", unitContain='" + unitContain + '\'' +
                ", quesContain='" + quesContain + '\'' +
                ", ans1='" + ans1 + '\'' +
                ", ans2='" + ans2 + '\'' +
                ", ans3='" + ans3 + '\'' +
                ", ans4='" + ans4 + '\'' +
                ", explain='" + explain + '\'' +
                ", comments='" + comments + '\'' +
                ", cid=" + cid +
                ", realAns=" + realAns +
                '}';
    }
}
