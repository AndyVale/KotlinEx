import kotlin.String

class University(
    val name:String = "Unige", 
    val fYear:Int=1980, 
    val students:MutableList <String> = mutableListOf(),
    val professors:MutableList <Professor> = mutableListOf()
){
    fun hireProfessor(p:Professor){
        professors.add(p);
    }
    fun enrollStudent(s:Student){
        students.add(s.name);
    }
}

class Professor(
    val name:String = "Giovanni",
    var age:Int = 40,
    var ySalary:Float = 2000.0f,
    val courses:MutableList <Course> = mutableListOf() 
){
    fun startTeaching(c:Course){courses.add(c)};
    fun oralExam(s:Student, c:Course){
        if(!courses.contains(c) || !s.enrolled.contains(c)) return
        s.grade.add(Pair(c, 18))
    };
}

class Student(
    val name:String = "Marco",
    var age:Int = 21,
    val mNo:Int = 1
){
    val enrolled:MutableList <Course> = mutableListOf()
    val grade:MutableList <Pair<Course, Int?>> = mutableListOf()
    var likelihood:Int= 50
    fun enroll(c:Course){
        enrolled.add(c)
    }
    fun takeExam(c:Course, p:Professor){
        p.oralExam(this, c)
    }
    fun study(){if(likelihood < 99) likelihood += 2}
    fun party(){if(likelihood > 1) likelihood -= 2}
}

data class Course(
    val title:String="Programmazione Mobile",
    var description:String="Corso bellissimissimissimo"
){}

fun main(){
    val unige = University()
    val p = Professor()
    val s = Student()
    val c = Course()
    unige.hireProfessor(p)
    println(unige.professors)
    p.startTeaching(c)

    unige.enrollStudent(s)
    s.enroll(c)
    println(s.enrolled)

    s.takeExam(c, p)
    println(s.grade)

    s.study()
    println(s.likelihood)
    s.party()
    println(s.likelihood)
}