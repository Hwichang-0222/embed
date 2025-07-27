package java_Practice_04;

public class Student {
	
	private String student_Name;
	private int korean_Score;
	private int english_Score;
	private int math_Score;
	
	public Student(String student_Name, int korean_Score, int english_Score, int math_Score) {
		super();
		this.student_Name = student_Name;
		this.korean_Score = korean_Score;
		this.english_Score = english_Score;
		this.math_Score = math_Score;
	}

	public int getKorean_Score() {
		return korean_Score;
	}

	public void setKorean_Score(int korean_Score) {
		this.korean_Score = korean_Score;
	}

	public int getEnglish_Score() {
		return english_Score;
	}

	public void setEnglish_Score(int english_Score) {
		this.english_Score = english_Score;
	}

	public int getMath_Score() {
		return math_Score;
	}

	public void setMath_Score(int math_Score) {
		this.math_Score = math_Score;
	}

	public String getStudent_Name() {
		return student_Name;
	}
	
	public double getAverageScore() {
		double average_Score = 0;
		average_Score = (korean_Score + english_Score + math_Score) / 3.0 ;
		
		return average_Score; 
	}
	
	@Override
	public String toString() {
		String result = "";
		result = "Name : " + student_Name + ", Korean Score : " + korean_Score + 
				", English Score : " + english_Score + ", Math Score : " + math_Score + 
				", AverageScore : " + getAverageScore();
		return result;
	}
	

}
