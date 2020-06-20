//firstLast6
public boolean firstLast6(int[] nums) {
    return (nums[0]==6 || nums[nums.length-1]==6);
}


//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  return (nums.length>=1 && (nums[0]==nums[nums.length-1]));
}


//makePi
public int[] makePi() {
  int[] pi={3,1,4};
  return pi;
}


//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
}


//sum3
public int sum3(int[] nums) {
  return (nums[0] + nums[1] + nums[2]);
}


//rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int temp;
  temp=nums[0]; nums[0]=nums[1]; nums[1]=nums[2]; nums[2]=temp;
  return nums;
}


//reverse3
public int[] reverse3(int[] nums) {
  int [] tomb=new int[3];
  for (int i=0; i<3; i++) {
    tomb[2-i]=nums[i];
  }return tomb;
}


//maxEnd3
public int[] maxEnd3(int[] nums) {
  int max=0;
    if (nums[0]>nums[2]) max=nums[0];
    else max=nums[2];
  for(int i=0; i<nums.length;i++) {
    nums[i]=max;
  }return nums;
}


//sum2
public int sum2(int[] nums) {
  if (nums.length>=2) return nums[0]+ nums[1];
  if (nums.length==1) return nums[0];
  return 0;
}


//middleWay
public int[] middleWay(int[] a, int[] b) {
  int [] tomb=new int [2];
  tomb[0]=a[a.length/2];
  tomb[1]=b[b.length/2];
  return tomb;
}


//makeEnds
public int[] makeEnds(int[] nums) {
  int [] tomb=new int [2];
  tomb[0]=nums[0];
  tomb[1]=nums[nums.length-1];
  return tomb;
}


//has23
public boolean has23(int[] nums) {
  for(int i=0; i<nums.length; i++ ) {
    if(nums[i]==2 || nums[i]==3) return true;
  }return false;
}


//no23
public boolean no23(int[] nums) {
  for(int i=0; i<2;i++){
    if(nums[i]==2 || nums[i]==3) return false;
  } return true;
}


//makeLast
public int[] makeLast(int[] nums) {
  int [] tomb= new int[2*nums.length];
  tomb[tomb.length-1]=nums[nums.length-1];
  return tomb;
}


//double23
public boolean double23(int[] nums) {
  if(nums.length>1  && ((nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3))) return true;
  return false;
}


//fix23
public int[] fix23(int[] nums) {
  for(int i=0; i<nums.length-1;i++) {
    if(nums[i]==2 && nums[i+1]==3) nums[i+1]=0;
  } return nums;
}


//start1
public int start1(int[] a, int[] b) {
  int count=0;
  if(a.length>0 && a[0]==1) {
    count++;}
    if (b.length>0 && b[0]==1) count++;
  return count;
}


//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  int sum=0;
  if((a[0]+a[1])>=(b[0]+b[1])) return a;
  return b;
}


//makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] temp= new int[2];
  if (nums.length==2) return nums;
  if(nums.length>2){
    temp[0]=nums[nums.length/2-1];
    temp[1]=nums[nums.length/2];
  }
  return temp;
}


//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] temp = new int [4];
  int count=0;
  for(int i=0; i<a.length;i++){
    temp[i]=a[i]; count++;}
    for(int j=0;j<b.length;j++) { 
    temp[count]=b[j]; count++;}
  return temp;
}


//swapEnds
public int[] swapEnds(int[] nums) {
  int temp;
  temp=nums[0]; nums[0]=nums[nums.length-1]; nums[nums.length-1]=temp;
  return nums;
}


//midThree
public int[] midThree(int[] nums) {
  int [] tomb=new int[3];
  if(nums.length<4) return nums;
  if(nums.length>3) {
    int temp=nums.length/2-1;
    for(int i=0; i<3;i++)
    tomb[i]=nums[temp+i]; 
  } return tomb;
}


//maxTriple
public int maxTriple(int[] nums) {
  int max=0;
  int [] newArray=new int[3];
  newArray[0]=nums[0];
  newArray[1]=nums[nums.length/2];
  newArray[2]=nums[nums.length-1];
  for(int i=0; i<newArray.length; i++) {
    if(newArray[i]>max) max=newArray[i];
  }
  return max;
}


//frontPiece
public int[] frontPiece(int[] nums) {
  int [] array= new int[2];
  if(nums.length<2) return nums;
  if(nums.length>=2) {
    array[0]=nums[0]; array[1]=nums[1];
  }
  return array;
}


//unlucky1
public boolean unlucky1(int[] nums) {
  for(int i=0; i<nums.length-1;i++) {
    if((i<2 && (nums[i]==1 && nums[i+1]==3) ) || (nums[nums.length-2]==1 && nums[nums.length-1]==3)) {
      return true;
    }
  }return false;
}


//make2
public int[] make2(int[] a, int[] b) {
  int [] array=new int [2];
  if(a.length==0) return b;
  if (a.length==1) {
    array[0]=a[0]; array[1]=b[0];
  }
  if(a.length>=2){
     array[0]=a[0]; array[1]=a[1];
  }
  return array;
}


//front11
public int[] front11(int[] a, int[] b) {
  
  int [] array=new int[2];
  if(a.length>=1 && b.length>=1) {
    array[0]=a[0]; array[1]=b[0];
  }
  if(a.length<1 && b.length<1) {
  array=new int[0];
  }
  if(a.length<1 && b.length>1)  {
    array=new int[1];
    array[0]=b[0];
  }
  if(b.length<1 && a.length>1)  {
    array=new int[1];
    array[0]=a[0];
  }
  return array;
}
