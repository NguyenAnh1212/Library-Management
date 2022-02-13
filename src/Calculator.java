import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Book [] listBook = new Book[5];
        listBook[0] = new Book("Ngọn gió", "Văn Bảo", 20000, 22, 0.8);
        listBook[1] = new Book("Ngọn lửa", "Minh Hải", 45000, 10, 1.5);
        listBook[2] = new Book("Ngọn cây", "Hà Hiển", 55000, 5, 2.0);
        listBook[3] = new Book("Ngọn núi", "Minh Quốc", 48000, 8, 2.1);
        listBook[4] = new Book("Ngọn đồi", "Quốc Định", 18000, 11, 0.5);
        //Gọi hàm tính tổng giá.
        System.out.print("Sum Price: ");
        int sumprice = getSumPrice(listBook);
        System.out.println(sumprice);
        // Gọi hàm tính tổng số lượng.
        System.out.print("Sum Quantity: ");
        int sum = getSumQuatity(listBook);
        System.out.println(sum);
        // Gọi hàm tìm kiếm và in thông tin sách.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book's name: ");
        String name = scanner.nextLine();
        findName(listBook,name);
    }
    // tạo các hàm sử dụng để gọi ở main.
    // Tổng giá
    public static int getSumPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length ; i++) {
            sum += books[i].getTotalPrice();
        }
        return sum;
    }
    // Tổng số sách
    public static int getSumQuatity(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length ; i++) {
            sum += books[i].getQuantity();
        }
        return sum;
    }
    // Tìm và in ra thông tin sách.
    public static void findName(Book[] books,String name) {
        boolean find = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                find = true;
               System.out.printf(name +"'s infomation is: "+"\n" );
                System.out.printf("%-20s%s","Author:",books[i].getAuthor()+"\n");
                System.out.printf("%-20s%s","Price:",books[i].getPrice()+"\n");
                System.out.printf("%-20s%s","Quantity:",books[i].getQuantity()+"\n");
                System.out.printf("%-20s%s","Weight:",books[i].getWeight()+"\n");
            }
        }
        if (find = false) {
            System.out.println("Not found " + name + " on the stocks");
        }
    }
}
