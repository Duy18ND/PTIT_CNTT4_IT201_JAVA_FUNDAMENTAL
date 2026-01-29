package session05.miniProject;

import java.util.Arrays;
import java.util.Scanner;

public class miniProject_SS05 {
    // FR1
    public static void twoSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mảng rỗng!");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tìm thấy cặp chỉ số: (" + i + ", " + j + ")");
                    return;
                }
            }
        }

        System.out.println("Không tìm thấy cặp số phù hợp!");
    }

    // CASE 2
    public static void moveZeroes(int[] nums) {
        int viTri = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[viTri++] = nums[i];
            }
        }

        for (int i = viTri; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void caseMoveZeroes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi dồn 0: " + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("Mảng sau khi dồn 0: " + Arrays.toString(arr));
    }

    // CASE 3
    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.print("Nhập vào câu cần kiểm tra: ");
        String title = sc.nextLine();

        String cleanStr = title.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        System.out.println("Chuỗi sau khi làm sạch: " + cleanStr);
        System.out.println("Kết quả đối xứng: " + cleanStr.equals(reversedStr));
    }

    // CASE 4
    public static void reverseWords() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
