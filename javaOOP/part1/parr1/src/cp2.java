public class cp2 {

  
  public boolean canJump(int[] nums) {
    int recable = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > recable) return false;
      recable = Math.max(recable,i +nums[i]);
    }
    return true;
  }

  public static void bazbuz(int nums) {
    for (int i = 1; i < nums; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("bazbuz");
      } else if(i % 3 == 0) {
        System.out.println("fazz");
      } else if (i % 5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
    }

  }
  
  public static int faktorial(int nums) {
   if (nums <= 0) {
    return 0;
   }
   int result = 1;
   for (int i = nums; i >= 1; i--) {
    result *= i;
   }
   return result;
}

  // public static String mira(String sentence) {
  //   if (sentence.length() < 50) {
  //     StringBuilder modifSentence = new StringBuilder(sentence);
  //     for (int i = 1; i < sentence.length(); i++) {
  //       if (sentence.charAt(i) == "+") {
  //         char perChar = sentence.charAt(i-1);
  //         if (Character.isLetter(prevChar)) {
  //           modifiedSentence.setCharAt(i - 1, Character.toUpperCase(prevChar));
  //         }
  //       }
  //       return modifSentence.toString();
  //     }
  //   }else {
  //     System.out.println("masukan kurang dari 50 huruf");
      
  //   }
  // }

  // public int jump(int[] nums) {
  //   // int jumps, currEnd, currFarthest = 0;
  //   // for (int i = 0; i < nums.length - 1; i++) {
  //   //   currFarthest = Math.max(currFarthest, i + nums[i]);
  //   //   if (i == currEnd) {
  //   //     currEnd = currFarthest;
  //   //     jumps++;
  //   //   }
  //   // }
  //   // return jumps;
  // }

  public static int devlop(int[] nums) {
    int j = 1;
    for (int i = 1; i < nums.length; i ++) {
      if (nums[i] != nums[i-1]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }



  public static void main(String[] args) {
    // bazbuz(50);
    System.out.println(faktorial(0));

    int nums[] ={0,0,1,1,1,2,2,3,3,4};

    var tesis = devlop(nums);
    System.out.println(tesis);
    
  }
}



