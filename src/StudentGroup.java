import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if (students == null) { 
			throw new IllegalArgumentException();
		}
		for(int i=0;i<students.length;i++) {
			students[i].setId(i);
			students[i].setAvgMark(60+i+i/10);
			students[i].setBirthDate(new Date());
			students[i].setFullName("Random" + i);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length) throw new IllegalArgumentException();
		else {
			students[index] = student;
		}
	}
	
	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		//Still to be Reviewed
		if (student == null ) throw new IllegalArgumentException();
		else {
			ArrayList <Student>at = new ArrayList<Student>();
			at = (ArrayList<Student>) Arrays.asList(students);
			at.add(0, student);
			students = null;
			students = (Student[]) at.toArray();
			
			/*
			Student []st = new Student[students.length+1];
			st[0] = student;
			for(int i=1;i<st.length;i++) {
				st[i] = students[i-1];
			}
			students  = null;
			Student []students = new Student[st.length];
			for(int i=0;i<st.length;i++) {
				students[i] = st[i];
			}*/
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		//Still to be Reviewed
		if (student == null ) throw new IllegalArgumentException();
		else {
			Student []st = new Student[students.length+1];
			st[st.length-1] = student;
			for(int i=st.length-2;i>=0;i--) {
				st[i] = students[i-1];
			}
			students  = null;
			Student []students = new Student[st.length];
			for(int i=0;i<st.length;i++) {
				students[i] = st[i];
			}
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student st[] = new Student[students.length];
		int count=0;
		for(int i=0;i<students.length;i++) if(students[i].getBirthDate().getYear() == age) {
			st[count] = students[i];
			count++;
		}
		return st;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if (student == null) throw new IllegalArgumentException();
		else
		for(int i=0;i<students.length;i++) {
			if(student.getId() == students[i].getId()) return students[i+1];
		}
		return null;
	}
}
