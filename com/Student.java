package task2.com;

public class Student {
   private int stdId;
   private String stdName;
   private float stdMarks;
   
public Student(int stdId, String stdName, float stdMarks) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
	this.stdMarks = stdMarks;
}

public int getStdId() {
	return stdId;
}

public void setStdId(int stdId) {
	this.stdId = stdId;
}

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

public float getStdMarks() {
	return stdMarks;
}

public void setStdMarks(float stdMarks) {
	this.stdMarks = stdMarks;
}

@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
}
   
   
}
