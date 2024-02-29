Your local university hired you to model a (very simplified) version of the university as an
object‐ oriented system. The entities you should implement are University, Professor,
Student, and Course. These entities have the following properties and capabilities (which
can be modeled as properties and methods):

● A university has a name and a founding year. It can hire new professors and enroll
new students—which should add them to the university’s list of professors or
students, respectively.
● A professor has a name, an age, and a yearly salary. He or she can teach courses
and test students in an oral exam—which gives the student a grade for that course.
● A student has a name, an age, a matriculation number, a grade for every course he
or she completed in the past (by taking the exam), and a likelihood to succeed in
their studies that starts out at 50%.
● A student can enroll in courses and take exams for courses. Additionally, he or she
can study (which increases the likelihood of succeeding in their studies by 2% up to a
maximum of 100%), or party (which has the adverse effect).
● Every course has a title and a description.
