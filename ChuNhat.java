/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopvadoituong;

/**
 *
 * @author Tam Nguyen
 */
public class ChuNhat {
    double width , height;
    public ChuNhat(){

    }
    public ChuNhat(double width , double height){
        this.width = width;
        this.height = height;
    }
    public double DienTich(){
        return this.width * this.height;
    }
    public  double ChuVi(){
        return (this.width + this.height)*2;
    }
    public String HienThi()
    {
        return " Hình chữ Nhật {" + "width" + width + "height" + height +"}";
    }
    
}
