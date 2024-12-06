public class Patient{
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;
    private int currentYear;

    public Patient(int id, String name, int birthYear, double height, double weight,
                   String bloodGroup, String phoneNumber){
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }
    public int getID(){
        return this.id;
    }
    public String getNAME(){
        return this.name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public double getH(){
        return this.height;
    }

    public double getW(){
        return  this.weight;
    }
    public String getBG(){
        return this.bloodGroup;
    }
    public String getPN(){
        return this.phoneNumber;
    }
    public int getAge(int currentYear){
        return currentYear - this.birthYear;
    }
    public double getBMI() {
        if (height > 0) {
            double heightInMeters = height / 100; // Convert height from cm to meters
            return weight / (heightInMeters * heightInMeters);
        } else {
            return 0.0; // Return 0 or throw an exception for invalid height
        }
    }
//Math.abs(height)
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + (height > 0 ? height : "Invalid"));
        System.out.println("Patient Weight (kg): " + (weight > 0 ? weight : "Invalid"));
        System.out.println("Patient BloodGroup: " + bloodGroup);
        System.out.println("Patient PhoneNumber): " + phoneNumber);
        System.out.println("Patient BMI: " + String.format("%.1f", getBMI()));

    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,
                "A", "0631149442" );
        patient.displayDetails(currentYear);

        System.out.println();

        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,
                "AB", "0631149442" );
        invalidPatient.displayDetails(currentYear);
        System.out.println();
    }
}
