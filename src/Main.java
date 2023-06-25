public class Main {
    public static void printStudentInfo(Student student) {
        System.out.print(student.getName());
        if (student.getAddress().isPresent()) {
            Address address = student.getAddress().get();
            System.out.print(", " + address.getCity() + ", " + address.getRegion());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Address address1 = new Address("Чернобль", "10");
        Address address2 = new Address("Припять", "4499");

        Student student1 = new Student("Лестер Меченный", address1);
        Student student2 = new Student("Владимир Сидорович", address2);
        Student student3 = new Student("Лис");

        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
    }
}