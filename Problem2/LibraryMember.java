public class LibraryMember{

    protected String memberId;
    protected int borrowLimit;
    protected int booksBorrowed;

    public LibraryMember(
            String memberId,
            int borrowLimit) {

        if (memberId == null ||
            memberId.trim().isEmpty() ||
            memberId.length() < 4) {

            throw new IllegalArgumentException(
                "Invalid member ID"
            );
        }

        if (borrowLimit <= 0) {
            throw new IllegalArgumentException(
                "Borrow limit must be positive"
            );
        }

        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }

    public void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void displayInfo() {
        System.out.println(
            "General Member | Books Borrowed: "
            + booksBorrowed
        );
    }

    protected void chargeFine(int amount) {
        // Fine logic
    }
}