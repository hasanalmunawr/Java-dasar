import java.net.Socket;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

import oopJava.person;

public class cp {
  public static void main(String[] args) {
    // int[] nums = {1,2,3,4,5,6,7};
    // int jang = 3;
  //   // output = [5,6,7,1,2,3,4]

  //   // rotate(nums,jang);
  //   reverse(nums, 0, nums.length-1);
  // }

  // public static void reverse(int[] nums, int awal, int akhir) {
  //   while (awal < akhir) {
  //     int temp = nums[awal];
  //     nums [awal] = nums[akhir];
  //     nums[akhir] = temp;

  //     awal++;
  //     akhir--;
  //   }
  //   printArray(nums);
  // } 


  // public static void rotate(int[] nums, int k) {
  //   k %= nums.length;

  //   reverse(nums, 0, nums.length);

  //   reverse(nums, 0, k-1);

  //   reverse(nums, 0, nums.length-1);

  // }
  
  
  
  int[] days = {7,1,5,3,6,4};
  
  /*Input: prices = [7,1,5,3,6,4]
  Output: 7 */
  
  
  //  int t = maxProfit(days);
  // System.out.println(t);
    int[] root = {1,2,3};
    // Output: 6
    
    //SOAL NO CP TENTANG DERET HURUF
    String hurfRandom = "PCPCCPC";
    // int ngecek = hurufGantian(hurfRandom);
    // System.out.println(ngecek);

    //SOAL CP NO 2 TENTANG PALINSINDROM
    String palindrom = "nasan";
    String ngecek = palinSindrom(palindrom);
    System.out.println(ngecek);
    
    //SOAL CP NO 3 MEMBALIKAN ARRAY
    int[] roo3t = {1,2,3};
    int[] hasie = reverse2(roo3t);
    // System.out.println(printArray(hasie));
    
    // soal cp no4 
    int[] no4 = {1,2,3,4};
    int n = no4.length; //hasilnya 4
    System.out.println(n-1);
    int[] hasil4 = tes12(no4);
    printArray(hasil4);

    // soal xp no 5
    int[] gas = {1,2,3,4,5};
    int[] con = {3,4,5,1,2};

    int hasil5 = canComplte(gas, con);
    System.out.println(hasil5);

    // soal cpp no 06
    System.out.println("\n");
    int[] child = {1,2,87,87,87,2,1};
    int hasil6 = Candy(child);
    System.out.println(hasil6);
    
    // soal cpp no 07
    System.out.println("\n");
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    int hasil7 = waterHight(height);
    System.out.println(hasil7);
    
    // soal cp no 08
    System.out.println("\n");
    String romawi = "LVIII";
    System.out.println(romanToInt(romawi));

    // soal cp no 09
    String kalimat = "hello world";
    System.out.println(lengOFwolrd(kalimat));
    // System.out.println(lengFor(kalimat));

    String[] asan = {"hasan","almu"};
    String almu = asan[asan.length-1];
    System.out.println(almu);

  }
  
  public static int[] tes12(int[] nums) {
    int n = nums.length;
    int[] prefix = new int[n];
    int[] suffix = new int[n];
    int[] answer = new int[n];

    // calculate prefix
    prefix[0] = 1;
    for (int i = 1; i < n; i++) {
      prefix[i] = prefix[i-1] * nums[i-1];
    }

    // calculate suffix
    suffix[n-1] = 1;
    for (int i = n-2; i >=0; i--) {
      suffix[i] = suffix[i+1] * nums[i+1];
    }

    // calculate final answer 
    for (int i = 0; i < n; i++) {
      answer[i] = prefix[i] * suffix[i];
  }
     return answer;
  }
  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.println(i);
    }
  }
  // public static String palinSindrom(String kalimat) {
  //   String wadah = " ";
  //   for (int i = 1; i < kalimat.length(); i++) {
  //     wadah.charAt(i) = kalimat.charAt(i-1);
  //   }
  //   wadah == kalimat ? return wadah: System.out.println("tidak palindrom");
  // } //BUATAN HASAN

  public static String palinSindrom(String kalimat) {
    StringBuilder wadah = new StringBuilder();
    for (int i = kalimat.length() - 1; i >= 0; i--) {
      wadah.append(kalimat.charAt(i));
    }
    if (wadah.toString().equals(kalimat)) {
      return wadah.toString();
    } else {
      return "bukan palindrom";
    }
  } //KODE YANG BEANR BUATAN AI DAN HASIN :V

  public static int hurufGantian(String huruf) {
    int hasil = 0;
    for (int i = 1; i < huruf.length(); i++) {
      if (huruf.charAt(i) == huruf.charAt(i-1)) {
        hasil += 1;
      }
    }
    return hasil;
  }

  public static int[] reverse2(int[] nums) {
    int[] hasil = new int[nums.length];
    int index = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      hasil[index] = nums[i];
      index++;
    }
    return hasil;
  }

  public static int max(int[] prices) { 
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i-1]) {
        profit += prices[i] - prices[i-1];
      }
    }
    return profit;

  }

  public static int maxPr(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        } 
    }
    return profit;
}

  public static int maxProfit(int[] prices) {
      int lsf = Integer.MAX_VALUE;
      int p = 0;
      int l = 0;

      for (int i = 0; i < prices.length; i++) {
        if (prices[i] < lsf) {
          lsf = prices[i];
        }
        l = prices[i] - lsf;
        if (p < l) {
          p = l;
        }
      }
      return p;

  }

  public int[] productExceptSelf(int[] nums) {
      
    int n = nums.length;
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        
        return ans;
 }

 
 public static int canComplte(int[] gas, int[] cost) {
  int index = 0, total = 0, avail = 0;
  for (int i = 0; i < gas.length; i++) {
    total += gas[i] - cost[i];
    avail += gas[i] - cost[i];

    if (avail < 0) {
      avail = 0;
      index = i + 1;
    }
  }
  if (total < 0) {
    total = 0;
    return -1;
  }
  return index;
 }

 public static int Candy(int[] nums) {
  int[] arr = new int[nums.length];
  Arrays.fill(arr,1);
  int ans = nums.length;

    while(true) {
      boolean bool = false;
      for(int i = 0; i < nums.length-1; i++) {

        if (nums[i] > nums[i+1] && arr[i] <= arr[i+1]) {
          arr[i]++;
          ans++;
          bool = true; 
        }

        if (nums[i] < nums[i+1] && arr[i] >= arr[i+1]) {
          arr[i+1]++;
          ans++;
          bool = true;
        }  
      }
      if (!bool) {
        break;
      }
    }
    return ans;
 } 

 public static int waterHight(int[] water) {
  int left = 0, right = water.length-1, leftMax = 0, rightMax = 0, waterTrapped = 0;

  while(left < right) {
    if (water[left] <= water[right]) {
      leftMax = Math.max(leftMax, water[left]);
      waterTrapped += leftMax - water[left];
      left++;
    } else {
      rightMax = Math.max(rightMax,water[right]);
      waterTrapped += rightMax - water[right];
      right--;
    }
  }
  return waterTrapped;
 }

 public static int romanToInt(String s) {
  int asn = 0, num = 0;
  for (int i = 0; i < s.length(); i++) {

    switch(s.charAt(i)) {
      case 'I': num = 1; break;
      case 'V': num = 5; break;
      case 'X': num = 10; break;
      case 'L': num = 50; break;
      case 'C': num = 100; break;
      case 'D': num = 500; break;
      case 'M': num = 1000; break;
    }
    if (4*num < asn)  {
      asn -= num;
    }
    else {
      asn += num;
    } 
  }
  return asn;
}

// public static String intToRoman(int num) {
//   int asn = 0; 
//   String wal;
//   for (int i =0; i < num; i++) {
//     switch(num) {
//       case 1: wal = 'I'; break;
//       case 5: wal = 'V'; break;
//       case 10: wal = 'X'; break;
//       case 50: wal = 'L'; break;
//       case 100: wal = 'C'; break;
//       case 500: wal = 'D'; break;
//       case 100: wal = 'M'; break;


//     }
//     if (4*num < asn)  {
//       asn -= num;
//     }
//     else {
//       asn += num;
//     } 

  // }
//  }

  public static int lengOFwolrd(String s) {
    String baru = s.trim();
    int count= 0;
    int i = s.length() -1;

    while(i >= 0 && baru.charAt(i) != ' ') {
      count++;
      i--;
    }
    return count;
  }

  public static int lengFor(String s) {
    String baru = s.trim();
    int cout = 0;
    for (int i = s.length()-1; i >= 0; i--) {
      if(baru.charAt(i) != ' ') {
        cout++;
      }
    }
    return cout;
  }
 


}

