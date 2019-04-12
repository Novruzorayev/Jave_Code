package syntaxDay01;

public class Student {
	public static void main(String[] args) {
		Student obj = new Student();
		char myGrade = obj.getGrade(91);
	}
char getGrade(int score) {
	char grade;
	if(score > 90) {
		grade = 'A';
	}else if(score > 80) {
		grade = 'B';
	}else if(score > 70) {
		grade = 'C';
	}else if(score > 50) {
		grade = 'D';
	}else {
		grade
		