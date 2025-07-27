package java_Practice_04;

public class SchoolApp {

    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student("홍길동", 90, 85, 80);
        Student s2 = new Student("김철수", 75, 80, 78);

        school.addStudent(s1);
        school.addStudent(s2);

        System.out.println("--- 전체 평균 출력 ---");
        school.printAllAverages();

        System.out.println("--- 이름으로 학생 찾기 ---");
        Student found = school.printStudent("홍길동");
        if (found != null) {
            System.out.println("찾은 학생: " + found.getStudent_Name());
        } else {
            System.out.println("학생을 찾을 수 없습니다.");
        }
    }
}
