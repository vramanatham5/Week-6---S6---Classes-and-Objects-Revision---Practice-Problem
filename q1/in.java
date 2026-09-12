class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.printf("Student: %s | Company: %s | Package: %.2f LPA%n",
                studentName, company, packageLpa);
    }
}

public class in {
    public static void main(String[] args) {
        PlacementRecord[] records = {
                new PlacementRecord("Ananya", "Google", 18.50),
                new PlacementRecord("Rahul", "Microsoft", 16.00),
                new PlacementRecord("Meera", "Infosys", 8.75)
        };

        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}