//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("PB001", "Java Basics", 150, "Author A", "Java", "Spring");
        ProgrammingBook pb2 = new ProgrammingBook("PB002", "Advanced Java", 200, "Author B", "Java", "Hibernate");
        ProgrammingBook pb3 = new ProgrammingBook("PB003", "Python Basics", 120, "Author C", "Python", "Django");

        FictionBook fb1 = new FictionBook("FB001", "Fantasy World", 80, "Author D", "Viễn tưởng 1");
        FictionBook fb2 = new FictionBook("FB002", "Mystery Night", 90, "Author E", "Viễn tưởng 2");
        FictionBook fb3 = new FictionBook("FB003", "Science Fiction", 110, "Author F", "Viễn tưởng 1");

        Book[] books = {pb1, pb2, pb3, fb1, fb2, fb3};

        double totalAmount = 0;
        int countJavaBooks = 0;
        int countVientuong1Books = 0;
        int countFictionBooksUnder100 = 0;

        for (Book book : books) {
            totalAmount += book.getAmount();

            if (book instanceof ProgrammingBook) {
                ProgrammingBook pb = (ProgrammingBook) book;
                if (pb.getLanguage().equals("Java")) {
                    countJavaBooks++;
                }
            } else if (book instanceof FictionBook) {
                FictionBook fb = (FictionBook) book;
                if (fb.getCategory().equals("Viễn tưởng 1")) {
                    countVientuong1Books++;
                }
                if (fb.getPrice() < 100) {
                    countFictionBooksUnder100++;
                }
            }
        }

        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of ProgrammingBooks with language 'Java': " + countJavaBooks);
        System.out.println("Number of FictionBooks with category 'Viễn tưởng 1': " + countVientuong1Books);
        System.out.println("Number of FictionBooks with price < 100: " + countFictionBooksUnder100);
    }
}
