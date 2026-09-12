class HallTicket {
    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class M4ExamHallTicketReferenceManagement {
    public static void main(String[] args) {
        HallTicket firstTicket = new HallTicket("Priya", 12);
        HallTicket secondTicket = firstTicket;

        secondTicket.seatNumber = 24;

        System.out.println("Seat through first variable: " + firstTicket.seatNumber);
        System.out.println("First and second refer to the same object: "
                + (firstTicket == secondTicket));

        HallTicket thirdTicket = new HallTicket("Priya", 24);
        System.out.println("Third ticket and first ticket are the same object: "
                + (thirdTicket == firstTicket));
    }
}