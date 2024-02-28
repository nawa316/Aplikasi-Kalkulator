/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package belajar.aplikasikalkulator;
/**
 *
 * @author users_gc6i8
 */
public class AplikasiKalkulator {
    
    public static int[] number1 = new int[2];
    public static int hasil;
    public static boolean keluar = true;
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewDashboard();
        
    }
    
    
    //Penjumlahan
    public static int operationSum(int[] number){
        int sum = 0;
        for(var i = 0; i < number.length; i++){
            sum += number[i];
        }
        return sum;
    }
    
    public static void testOperationSum(){
        int[] array = new int[]{
            1, 3, 4, 5, 6};
        System.out.println(operationSum(array));
        
    }
    
    //Pengurangan
    public static int operationSub(int[] number){
        int sub = 0;
        for(var i = 0; i < number.length; i++){
            if (i == 0){
                sub = number[i];
            } else{
            sub -= number[i];
            }
        }
        return sub;
    }
    
    public static void testOperationSub(){
        int[] array = new int[]{
            5, 20, 3, 5, 7, 9
        };
        System.out.println(operationSub(array));
        
    }
    
    //Perkalian
    public static int operationMul(int[] number){
        int mul = 0;
        for(var i = 0; i < number.length; i++){
            if (i == 0){
                mul = number[i];
            } else {
               mul *= number[i];
            }
        }
        return mul;
    }
    
    public static void testOperationMul(){
        int[] array = new int[]{
            1, 2, 3, 4, 5, 6
        };
        System.out.println(operationMul(array));
    }
    
    //Pembagian
    public static int operationDiv(int[] number){
        int div = 0;
        for(var i = 0; i < number.length; i++){
            if (i == 0){
                div = number[i];
            } else {
                div /= number[i];
            }
        }
        return div;
    }
    
    public static void testOperationDiv(){
        int[] array = new int[]{
            4,2,2
        };
        System.out.println(operationDiv(array));
    }
    
    //Modulo
    public static int operationMod(int[] number){
        int mod = 0;
        for (var i = 0; i < number.length; i++){
            if (i == 0){
                mod = number[i];
            } else {
                mod %= number[i];
            }
        }
        return mod;
    }
    
    public static void testOperationMod(){
        int[] array = new int[]{
            4,3
        };
        System.out.println(operationMod(array));
    }
    
    //Perpangkatan
    public static int operationRank(int[] number){
        int rank = (int) Math.pow(number[0], number[1]);
        return rank;
    }
    
    public static void testOperationRank(){
        int[] array = new int[]{
            2,3
        };
        System.out.println(operationRank(array));
    }
    
    //Rumus Cepat
    public static int operationPhy1(int[] number){
        int phy = (int)Math.sqrt(number[0]*number[0] - number[1]*number[1]);
        return phy;
    }
    public static void testOperationPhy1(){
        int[] array = new int[]{
            5, 3,
        };
        System.out.println(operationPhy1(array));
    }
    
    public static int operationPhy2(int[] number){ 
        int phy = (int)Math.sqrt(number[0]*number[0] + number[1]*number[1]);
        return phy;
    } //Tidak ada hipotenusa
    
    public static void testOperationPhy2(){
        int[] array = new int[]{
            3, 4,
        };
        System.out.println(operationPhy2(array));
    }
    
    public static int operationTri(int[] number){
       int tri = (number[0] * number[1])/ 2;
       return tri;
    }
    
    //Input segment
    public static int inputPilih(String info){
        System.out.println(info + ": ");
        return scanner.nextInt();
    }
    
    public static void testInputPilih(){
        var angka = inputPilih("angka");
        System.out.println(angka);
    }
    
    public static int[] inputData1(String info){
        System.out.println(info + ": ");
        for (int i = 0; i < number1.length; i++){
            number1[i] = scanner.nextInt();
        }
        return number1;
    }
    
    public static void testInputData1(){
        var angka = inputData1("angka");
        System.out.println(angka[0]);
        System.out.println(angka[1]);
    }
    
    public static int[] inputData2(String info){
        var size = inputPilih("Jumlah data");
        int[] data = new int[size];
        System.out.println(info + ": ");
        for (int i = 0; i < data.length; i++){
            data[i] = scanner.nextInt();
        }
        return data;
    }
    
    public static void testInputData2(){
        var angka = inputData2("Jumlahkan");
        for(int i = 0; i < angka.length; i++){
            System.out.println(angka[i]);  
        }
    }
    
    
    
    //View Method
    public static void viewDashboard(){
        while(keluar == true){
            System.out.println("");
            System.out.println("KALKULATOR");
            System.out.println("Menu:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulo");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Rumus Cepat");
            System.out.println("0. Keluar");
        
            var input = inputPilih("Pilih");
        
            if(input == 1){
                viewOperationSum();
            } else if (input == 2){
                viewOperationSub();
            } else if (input == 3){
                viewOperationMul();
            } else if (input == 4){
                viewOperationDiv();
            } else if (input == 5){
            viewOperationMod();
            } else if (input == 6){
                viewOperationRank();
            } else if (input == 7){
                viewOperationRumus();
            } else if (input == 0 || keluar == false){
                break;
            } else {
                System.out.println("Input " + input + " Tidak Dapat Dipahami");
            }
        }
    }
    
    
    public static void viewOperationSum(){
        System.out.println("");
        System.out.println("PENJUMLAHAN");
        
        var array = inputData2("Jumlahkan");
        hasil = operationSum(array);
        viewHasil();
    }
    
    public static void viewOperationSub(){
        System.out.println("");
        System.out.println("PENGURANGAN");
        
        var array = inputData2("Kurangkan");
        hasil = operationSub(array);
        viewHasil();
        
    }
    
    public static void viewOperationMul(){
        System.out.println("");
        System.out.println("PERKALIAN");
        
        var array = inputData2("Kalikan");
        hasil = operationMul(array);
        viewHasil();
        
    }
    
    public static void viewOperationDiv(){
        System.out.println("");
        System.out.println("PEMBAGIAN");
        
        var array = inputData2("Bagikan");
        hasil = operationDiv(array);
        viewHasil();
    }
    
    public static void viewOperationMod(){
        System.out.println("");
        System.out.println("MODULO");
        
        var array = inputData1("Data Angka");
        hasil = operationMod(array);
        viewHasil();
    }
    
    public static void viewOperationRank(){
        System.out.println("");
        System.out.println("PERPANGKATAN");
        System.out.println("Masukkan data pertama untuk bilangan");
        System.out.println("Masukkan data kedua untuk pangkat");
        
        var array = inputData1("Data");
        hasil = operationRank(array);
        viewHasil();
        
    }
    
    public static void viewOperationRumus(){
        System.out.println("");
        System.out.println("RUMUS CEPAT");
        System.out.println("Menu:");
        System.out.println("1. Phytagoras");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Kembali");
        System.out.println("0. Keluar");
        
        var input = inputPilih("Pilih");
        if (input == 1){
            viewOperationPhy();
        } else if (input == 2){
            viewOperationTri();
        } else if (input == 3){
           //Kembali
        } else if (input == 0){
            keluar = false;
        } else {
            System.out.println("Input " + input + " Tidak Dapat Dipahami"); 
        }
    }
    
    public static void viewOperationPhy(){
        System.out.println("");
        System.out.println("MENU PHYTAGORAS");
        System.out.println("Apakah ada hipotenusa?");
        System.out.println("1. Iya");
        System.out.println("2. Tidak");
        System.out.println("3. Kembali");
        System.out.println("0. Keluar");
        
        var input = inputPilih("Pilih");
        if (input == 1){
            viewOperationPhy1();
        } else if (input == 2){
            viewOperationPhy2();
        } else if (input == 3){
            viewOperationRumus();
        } else if (input == 0){
            keluar = false;
        } else {
            System.out.println("Input " + input + " Tidak Dapat Dipahami");
        }
    }
    
    public static void viewOperationPhy1(){
        System.out.println("");
        System.out.println("Masukkan Sisi Sisi Segitiganya");
        System.out.println("Data pertama adalah hipotenusa");
        System.out.println("Data kedua adalah sisi yang lain");
        
        var array = inputData1("Data");
        hasil = operationPhy1(array);
        viewHasil(); 
    }
    
    public static void viewOperationPhy2(){
        System.out.println("");
        System.out.println("Masukkan Sisi Sisi Segitiganya");
        System.out.println("Data pertama adalah sisi yang pertama");
        System.out.println("Data kedua adalah sisi yang lain");
        
        var array = inputData1("Data");
        hasil = operationPhy2(array);
        viewHasil(); 
    }
    
    public static void viewOperationTri(){
        System.out.println("");
        System.out.println("LUAS SEGITIGA");
        System.out.println("Masukkan nilai panjang alas dan tingginya");
        
        var array = inputData1("Data");
        hasil = operationTri(array);
        viewHasil();
    }
    
    public static void viewHasil(){
            System.out.println("");
            System.out.println("HASIL");
            System.out.println("Hasilnya adalah: " + hasil);
        
            System.out.println("Menu:");
            System.out.println("1. Lanjut Operasi Lain");
            System.out.println("2. Keluar");
            
            var input = inputPilih("Pilih");
        
            if (input == 1){
            //Balik
            } else if (input == 2){
                keluar = false;
            } else {
                System.out.println("Input " + input + " Tidak Dapat Dipahami");      
        }
    }   
}
