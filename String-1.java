//helloName
public String helloName(String name) {
  return "Hello "+name+"!";
}


//makeAbba
public String makeAbba(String a, String b) {
  return a+b+b+a;
}


//makeTags
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"</"+tag+">";
}


//makeOutWord
public String makeOutWord(String out, String word) {
  return out.substring(0,2)+word+out.substring(2);
}


//extraEnd
public String extraEnd(String str) {
  String result="";
  for(int i=0; i<3;i++) {
    result+=str.substring(str.length()-2);
  } return result;
}


//firstTwo
public String firstTwo(String str) {
  return (str.length()<3) ? str: str.substring(0,2);
}


//firstHalf
public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
}


//withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}


//comboString
public String comboString(String a, String b) {
  return (a.length()<b.length())? a+b+a : b+a+b;
}


//nonStart
public String nonStart(String a, String b) {
  return a.substring(1)+b.substring(1);
}



//left2
public String left2(String str) {
  while(str.length()<3) return str;
  return str.substring(2)+str.substring(0,2);
}


//right2
public String right2(String str) {
  return (str.length()<3) ? str :
    str.substring(str.length()-2)+str.substring(0,str.length()-2);
}


//theEnd
public String theEnd(String str, boolean front) {
  return (front)? str.substring(0,1): str.substring(str.length()-1);
}


//withoutEnd2
public String withouEnd2(String str) {
  return (str.length()<3)? "" : str.substring(1,str.length()-1);
}


//middleTwo
public String middleTwo(String str) {
  return str.substring(str.length()/2-1, str.length()/2+1);
}


//endsLy
public boolean endsLy(String str) {
  return (str.endsWith("ly")) ? true : false;
}


//nTwice
public String nTwice(String str, int n) {
  return str.substring(0,n)+str.substring(str.length()-n);
}


//twoChar
public String twoChar(String str, int index) {
  while(index>=str.length()-1|| index<0) return str.substring(0,2);
  return str.substring(index,index+2);
}


//middleThree
public String middleThree(String str) {
  return str.substring(str.length()/2-1, str.length()/2+2);
}


//hasBad
public boolean hasBad(String str) {
  if(str.contains("bad")){
    if(str.startsWith("bad") || str.substring(1,4).equals("bad")) return true;
  }
  return false;
}


//atFirst
public String atFirst(String str) {
  while (str.isEmpty()) return "@"+"@";
  while (str.length()>1) return str.substring(0,2);
  return str+"@";
}


//lastChars
public String lastChars(String a, String b) {
  if(a.length() == 0)
    a = "@";
  if(b.length() == 0)
    b = "@";
  return a.substring(0,1) + b.substring(b.length()-1, b.length());
}


//conCat
public String conCat(String a, String b) {
  while(a.length()!=0 && b.length()!=0 && a.charAt(a.length()-1)==b.charAt(0) ) return a+b.substring(1);
  return a+b;
}


//lastTwo
public String lastTwo(String str) {
  if (str.length()<2) return str;
  String res="";
  if(str.length()>=2) {
    res=str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
  }return res;
}


//seeColor
public String seeColor(String str) {
  if (str.startsWith("red")) return "red";
  if (str.startsWith("blue")) return "blue";
  else return "";
}


//frontAgain
public boolean frontAgain(String str) {
  return (str.length()>1 && (str.substring(0,2).equals(str.substring(str.length()-2))));
}


//minCat
public String minCat(String a, String b) {
  String result="";
  if ( a.length()>b.length()) {
    result=(a.substring(a.length()-b.length())+b);
  }
  else if (b.length()>a.length()) {
    result=a+b.substring(b.length()-a.length());
  }
  else {
    result=a+b;
  }
  return result;
}


//extraFront
public String extraFront(String str) {
  String result="";
  for (int i=0; i<3; i++) {
    if (str.length()<2) {
      result+=str;
    }  else {
      result+=str.substring(0,2);
    }
  }
  return result;
}


//without2
public String without2(String str) {
  String result="";
  if (str.length()==2 ||str.isEmpty()) {
    result="";
  }
  else if  (str.length()>2 && str.substring(0,2).equals(str.substring(str.length()-2))) {
    result=str.substring(2);
  }
  else result=str;
  return result;
}


//deFront
public String deFront(String str) {    
  String result="";
  if (str.startsWith("a")) result=str.substring(0,1)+str.substring(2);
  else if (str.substring(1,2).equals("b")) result=str.substring(1);
  else if(str.length()==3) result=str.substring(str.length()-1);
  else if(str.length()>=4) result = str.substring(2);
  if(str.startsWith("a") && str.substring(1,2).equals("b")) result=str;
  return result;
}


//startWord
public String startWord(String str, String word) {
  String result="";
  if (str.isEmpty() || word.length()>str.length()) result=""; 
  else if (str.substring(0,word.length()).equals(word)){
    result=word;
  }
  else if (str.substring(1,word.length()).equals(word.substring(1))){
    result=str.substring(0,word.length());
  }
  return result;
}


//withoutX
public String withoutX(String str) {
  String result="";
  if (str.isEmpty() || str.length()==1) result="";
  else if (str.startsWith("x") && str.endsWith("x")) result=str.substring(1,str.length()-1);
  else if(str.startsWith("x")) result=str.substring(1);
  else if(str.endsWith("x")) result=str.substring(0,str.length()-1);
  else result=str;
  return result;
}


//withoutX2
public String withoutX2(String str) {
  if(str.isEmpty()) return "";
  if(str.length()==1 && str.charAt(0)=='x') return "";
  if(str.charAt(0)=='x' && str.charAt(1)=='x')  return str.substring(2);
  if(str.charAt(0)=='x'&& str.charAt(1)!='x') return str.substring(1);
  if(str.charAt(0)!='x'&& str.charAt(1)=='x') return str.substring(0,1)+str.substring(2);  
  else return str;
}
