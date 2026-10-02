public class LibraryMember {

    protected String memberId;
    protected int borrowLimit;
    protected int booksBorrowed;

    private int[] fineHistory = new int[10];
    private int fineCount = 0;
    private int totalFine = 0;

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

    protected void chargeFine(int amount) {

        if (fineCount < fineHistory.length) {
            fineHistory[fineCount] = amount;
            fineCount++;
        }

        totalFine += amount;
    }

    public int[] getFineHistory() {

        int[] copy = new int[fineCount];

        for (int i = 0; i < fineCount; i++) {
            copy[i] = fineHistory[i];
        }

        return copy;
    }

    public int getTotalFine() {
        return totalFine;
    }

    public void displayInfo() {
        System.out.println(
            "General Member | Books Borrowed: "
            + booksBorrowed
        );
    }
}