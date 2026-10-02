public class Main{

    public static void main(String[] args) {

        StudentMember s =
            new StudentMember(
                "STU5",
                3,
                "CSE"
            );

        s.chargeFine(100);

        System.out.println(
            s.getTotalFine()
        );

        int[] history =
            s.getFineHistory();

        history[0] = 999;

        int[] safeHistory =
            s.getFineHistory();

        System.out.println(
            safeHistory[0]
        );
    }
}