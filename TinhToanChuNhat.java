/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopvadoituong;

import java.util.Scanner;

/**
 *
 * @author Tam Nguyen
 */
public class TnhToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng :");
        double width = sc.nextDouble();
        System.out.println("Nhập vào chiều cao :");
        double height = sc.nextDouble();
        ChuNhat chuNhat = new ChuNhat(width, height);
        System.out.println("Hình Chữ Nhật :"+chuNhat.HienThi());
         System.out.println("Hình Chữ Nhật :"+chuNhat.ChuVi());
          System.out.println("Hình Chữ Nhật :"+chuNhat.DienTich());
        
    }
    
}
