package SESSION02.DEMO;

import java.util.Scanner; // 1. Nhớ import Scanner

public class DEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("-------------MENU-------------");
//            System.out.println("1. Tính tiền phạt trả sách");
//            System.out.println("2. Đăng ký thẻ mượn sách VIP");
//            System.out.println("3. Thống kê số sách nhập kho");
//            System.out.println("4. Thoát chương trình");
//            System.out.println("----------------------------");
//
//            System.out.print("Mời bạn chọn chức năng: ");
//            choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                        System.out.print("Mời bạn nhập số lượng sách độc giả trả: ");
//                        int book = sc.nextInt();
//                        float priceDate = 0;
//                        for (int i = 0; i < book; i++){
//                            System.out.print("Số ngày quá hạn của book" + (i + 1) + " là: ");
//                            int date = sc.nextInt();
//                            for (int j =0; j < date; j ++){
//                                if((j + 1) <= 5){
//                                    priceDate += 2000;
//                                }else{
//                                    priceDate += 5000;
//                                }
//                            }
//                            System.out.println(priceDate);
//                            priceDate = 0;
//                        }
//                        break;
//                case 2:
//                    System.out.print("Nhập tuổi: ");
//                    int age = sc.nextInt();
//
//                    System.out.print("Số sách đã mượn trong tháng qua: ");
//                    int books = sc.nextInt();
//
//                    System.out.print("Sinh viên có thẻ ưu tiên (1: Có || 2: Không): ");
//                    int status = sc.nextInt();
//
//                    if((age >= 18 && books >= 10 )|| status == 1) {
//                        System.out.println("Đủ tiêu chuẩn nâng thẻ VIP");
//                    }else {
//                        System.out.println("Chưa đủ tiêu chuẩn!!!");
//                    }
//                    break;
//                case 3:
//                        int bookId;
//                        int count = 0;
//
//                        while (true){
//                            System.out.print("Mời bạn nhập mã sách: ");
//                            bookId = sc.nextInt();
//
//                            if(bookId < 0){
//                                System.out.println("Mã sách không hợp lệ!. Vui lòng nhập lại");
//                                continue;
//                            } else if (bookId == 0) {
//                                System.out.println("Dừng việc nhập kho!");
//                                break;
//                            }
//
//                            System.out.println("Thêm thành công mã sách "+ bookId);
//                            count++;
//                        }
//                    System.out.println("Tổng số sách đã thêm được: "+ count);
//                    break;
//                case 4:
//                    System.out.println("Dừng chương trình!");
//                    break;
//                default:
//                    System.out.println("Lựa chọn của bạn không hợp lệ!!!");
//            }
//        } while (choice != 4);
//
//        System.out.println("Đã thoát chương trình!");





        //Demo
//        Bài 1. Viết chương trình tìm max,min của 3 số
        System.out.print("Nhập số n1");
        int n1 = sc.nextInt();
        System.out.print("Nhập số n2");
        int n2 = sc.nextInt();
        System.out.print("Nhập số n3");
        int n3 = sc.nextInt();


//        Bài 2. Viết chương trình tìm max,min của 4 số
//        Bài 3 Viết chương trình giải ptb1 ax + b = 0
//        Bài 4 Viết chương trình giải ptb2: ax^2 + bx + c = 0
//        Bài 5. Viết chương trình nhập vào điểm thi gồm: Toán, lý, hoá, văn, sử, địa
//        Tính điểm trung bình
//        Đưa ra xếp loại dựa vào cách tính:
//        -	Từ [9 -> 10]: Xuất sắc
//        -	Từ [8 -> 9): Giỏi
//                -	Từ [6.5 -> 8): Khá
//                -	Từ [5 -> 6.5): Trung bình
//        -	Từ [3.5 -> 5): Yếu
//                -	Từ [0 -> 3.5]: Kém
//
//        Bài tập switch..case
//                Bài 6
//        Viết chương trình nhập vào 1 số có 1 chữ số. Hiển thị số ra dưới dạng chữ.
//
//                Bài 7.
//        Viết chương trình nhập vào 1 số có tối đa 2 chữ số. Hiển thị số dưới dạng chữ
//
//        Bài 8.
//        Viết chương trình nhập vào 1 số có tối đa 4 chữ số. Hiển thị số dưới dạng chữ
//        Bài tập về vòng lặp
//        Bài 9
//        Viết chương trình tính tổng từ n1 đến n2,
//                Tổng các số lẻ, tổng các số chẵn từ n1 đến n2
//
//        Bài 10
//        Viết chương trình nhập vào 2 số n1, n2. Hiển thị các số nguyên tố từ n1 đến n2
//
//        Bài 11
//        Viết chương trình in các số fibonacy với số cuối <=n (n được nhập vào từ bàn phím)
//
//        Bài 12.
//        Viết chương trình in ra hình * sau (yêu cầu nhập vào số dòng):
//*
//*	*
//*	*	*
//*	*	*	*
//*	*	*	*	*
//
//				*
//			*	*
//		*	*	*
//	*	*	*	*
//*	*	*	*	*
//
//
//				*
//			*	*	*
//		*	*	*	*	*
//	*	*	*	*	*	*	*
//*	*	*	*	*	*	*	*	*
    }
}