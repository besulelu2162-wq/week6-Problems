public class Main{

    public static void main(String[] args) {

        try {
            LibraryMember m =
                new LibraryMember("LB1", 3);

        } catch (IllegalArgumentException e) {
            System.out.println("LB1 construction rejected");
        }

        StudentMember s =
            new StudentMember("STU10", 3, "CSE");

        s.borrowBook();
        s.borrowBook();

        System.out.println(
            s.getBooksBorrowed()
        );

        String[] ids = {
            "STU1",
            "LB1",
            "STU2",
            " ",
            "STU3"
        };

        System.out.println(
            LibraryMember.enrollBatch(ids, 3)
        );
    }
}