
public class MainClass {
    public static void main(String[] args) {
        Student obj= new Student();
        obj.setName("swikriti");
        obj.setId("120");
        obj.setSal(200000);
        System.out.println("Name: "+ obj.getName());
        System.out.println("Id: " + obj.getId());
        System.out.println("Salary: " +obj.getSal());
    }
}