import java.util.Objects;
public class eleventh {
    record Student(String Name,int id,int age) {
        static int count = 0;
        Student(String Name, int id, int age) {
            this.Name = Name;
            this.id = id;
            this.age = age;
            count++;
        }
        public static int getCount() {
            return count;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Student)) {
                return false;
            }
            Student other = (Student) obj;
            return Name.equals(other.Name) && Objects.equals(id, other.id) && Objects.equals(age, other.age);
        }
    }

        public static void main(String[] args){
            Student s1=new Student("Shreya",34,12);
            Student s2=new Student("Shruti",45,55);
            Student s3=new Student("Aarush",43,34);
            Student s4=new Student("Aarush",43,34);
            System.out.println("s4 equals s3 "+s4.equals(s3));
            System.out.println("s2 equals s1 "+s2.equals(s1));

            System.out.println(" count value "+  Student.getCount());

    }
}
