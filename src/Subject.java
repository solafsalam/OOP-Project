public class Subject {
    private String subjectID;
    private int credit_Hour;
    private double pricePerHour;
    private String name;

    public Subject(String subjectID, int credit_Hour, double pricePerHour,String name) {
        this.subjectID = subjectID;
        this.credit_Hour = credit_Hour;
        this.pricePerHour = pricePerHour;
        this.name=name;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public int getCredit_Hour() {
        return credit_Hour;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public String getName() {
        return name;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public void setCredit_Hour(int credit_Hour) {
        if (credit_Hour > 0)
            this.credit_Hour = credit_Hour;
    }

    public void setPricePerHour(double pricePerHour) {
        if (pricePerHour >= 0)
            this.pricePerHour = pricePerHour;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Subject ID: " + subjectID +
                "\nName: " + name +
                "\nCredit Hours: " + credit_Hour +
                "\nPrice per Hour: " + pricePerHour;
    }
}
