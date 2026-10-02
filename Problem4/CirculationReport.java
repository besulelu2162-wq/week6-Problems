public class CirculationReport {

    static String batchPrint(
            LibraryMember[] members) {

        StringBuilder report =
            new StringBuilder();

        for (LibraryMember member : members) {

            if (member instanceof StudentMember) {

                StudentMember student =
                    (StudentMember) member;

                report.append("Student | ");
                report.append("Course: ");
                report.append(student.getCourse());
                report.append(" | Books: ");
                report.append(
                    student.getBooksBorrowed()
                );

                report.append(
                    " [Course via downcast: "
                );
                report.append(student.getCourse());
                report.append("]");

            } else {

                report.append("General | Books: ");
                report.append(
                    member.getBooksBorrowed()
                );
            }

            report.append(" | ");
        }

        return report.toString();
    }

    public static void main(String[] args) {

        LibraryMember[] members = {

            new LibraryMember("LB5", 3),

            new StudentMember(
                "STU6",
                3,
                "ECE"
            )
        };

        System.out.println(
            batchPrint(members)
        );
    }
}