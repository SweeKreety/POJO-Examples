public class Patient {
    String name;
    String address;
    String id;
    String disease;
    double charges;
    String docname;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public double getCharges() {
        return charges;
    }

    public String getDocname() {
        return docname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }
    public void setDocname(String docname) {
        this.docname = docname;
    }
}
