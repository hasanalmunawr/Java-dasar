import java.util.Arrays;
import java.util.Map;

public class App {
 public static void main(String[] args) {
    // soal logika backend
    /*studi kasus mengcek kebalikan string
     * input = nawan
     * output = benar
     */
    // String[] dataArray = {"n","a","w","a","n"};

    // String[] ngecek = cek(dataArray);
    // // var kondisi1 = printArray(ngecek);

    // if (ngecek == dataArray ) {
    //     System.out.println("benar");
    // } else {
    //     System.out.println("salah");
    // }

//     var a = 112;
//     var b = 221;
   
//     System.out.printf("var a = %d",a);
//     System.out.printf("\n var b = %d",b);
   
//    //  coding
//     a -= b;
//     b += a;
//     a = b - a;
        

//     System.out.printf("\nfinal a = %d",a);
//     System.out.printf("\nfinal b = %d",b);
//     }
//  public static String[] cek(String[] inpute) {
//     String[] arrayBufer = new String[inpute.length];
//     for (int i = 0; i < inpute.length ; i++) {
//         arrayBufer[i] = inpute[(inpute.length - 1) -i];
        
//     }
//     return arrayBufer;
//  }
//  public static void printArray(String[] masuk) {
//     for (var ngene : masuk) {
//         System.out.print(ngene);
//     }






 
// //  System.out.println(10^6);
// int n = 5; // Ganti dengan nilai n yang diinginkan
// int k = 111; // Ganti dengan nilai k yang diinginkan
// int factorialMod = MODULARFACTORIAL(n, k);
// System.out.println("Hasil faktorial modular dari " + n + " mod " + k + " adalah: " + factorialMod);
 
//  }
// //  public class ModularFactorial {

//     public static int MODULARFACTORIAL(int n, int k) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result = (result * i) % k;
//         }
//         return result;
//     }

//    //  public static void main(String[] args) {
   //  }
// }



// int[] angka = {1,2,3,2,2,3};
// // int vare = 3;
// int index = 0;

// for (int i = 1; i < angka.length; i++) { 
//     if (angka[i] != angka[i - 1]); {
//         angka[index] = angka[i];
//         index++;
//     }
// }
// System.out.println(index);

// for (int i = 0; i < 5; i++) {
//     System.out.println(++i);
// }

// for (int j = 0; j < 5; j++) {
//     System.out.println(j++);
// }



// int[] nums = {1,1,1,2,2,3};

//  System.out.println( removeDuplicates(nums));

// }

//  static int removeDuplicates(int[] nums) {
//         int j=1;
//         for(int i=2;i<nums.length;i++)
//             if(nums[i]!=nums[j-1])
//                 nums[j++]=nums[i];
//         return j+1;


}
    
    

    public  int solusi(int[] nums) {
         int count = 0;
        int candidate = 0;

        for (int num: nums) {
            if (count == 0 ) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }

        }

        return candidate;
    }
}

