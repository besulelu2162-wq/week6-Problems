public class LibraryMember{

    private static int membersEnrolled = 0;

    public final String memberNumber;

    protected int borrowLimit;
    protected int booksBorrowed;

    private String lastGenre;

    public LibraryMember(int borrowLimit) {

        if (borrowLimit <= 0) {
            throw new IllegalArgumentException(
                "Borrow limit must be positive"
            );
        }

        membersEnrolled++;

        memberNumber =
            "LIB-" + (100 + membersEnrolled);

        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }

    public void borrowBook() {

        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }

    public void borrowBook(String genre) {

        lastGenre = genre;

        borrowBook();
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public static boolean isValidRenewalCode(
            String code) {

        if (code == null || code.length() != 4) {
            return false;
        }

        if (code.charAt(0) != 'R') {
            return false;
        }

        if (!Character.isDigit(code.charAt(1))) {
            return false;
        }

        if (!Character.isDigit(code.charAt(2))) {
            return false;
        }

        if (!Character.isUpperCase(code.charAt(3))) {
            return false;
        }

        return true;
    }

    public static int getMembersEnrolled() {
        return membersEnrolled;
    }
}