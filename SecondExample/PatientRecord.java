public class PatientRecord {
    public static void main(String[] args) {
        Patient p= new Patient();
        p.setName ("Samir");
        p.setAddress ("Ktm");
        p.setId ("2205");
        p.setDisease ("Diabetes");
        p.setCharges(200000);
        p.setDocname("Dr Viswas Teja");

        System.out.println("Name:" +p.getName());
        System.out.println("Address:" +p.getAddress());
        System.out.println("Id:" +p.getId());
        System.out.println("Disease:" +p.getDisease());
        System.out.println("Charges:" +p.getCharges());
        System.out.println("Doctor's Name:" +p.getDocname());
    }
}
