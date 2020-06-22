//doubleChar
public String doubleChar(String str) {
    String result="";
    for(int i=0; i<str.length(); i++){
       result+=""+str.charAt(i)+str.charAt(i);
    }
  return result;
}


//countHi
public int countHi(String str) {
  int count=0;
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i, i+2).equals("hi")) count++;
  }
  return count;
}


//catDog
public boolean catDog(String str) {
  int count1=0;
  int count2=0;
  for(int i=0; i<str.length()-2;i++){
    if(str.substring(i, i+3).equals("cat")) count1++;
    if(str.substring(i, i+3).equals("dog")) count2++;
  }
  return count1==count2 ? true : false;
}


//countCode
public int countCode(String str) {
  int count=0;
  for(int i=0; i<str.length()-3;i++){
    if(str.substring(i, i+2).equals("co") 
    && (str.substring(i+3,i+4).equals("e"))) count++;
  }
  return count;
}


//endOther
public boolean endOther(String a, String b) {
  a=a.toLowerCase();
  b=b.toLowerCase();
  return (a.endsWith(b) || b.endsWith(a));
}


//xyzThere
public boolean xyzThere(String str) {
    if(str.length() >= 3 && str.substring(0, 3).equals("xyz"))
        return true;
    for(int i = 1; i < str.length() - 2; i++) {
        if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
            return true;
    }
    return false;
}


//bobThere
public boolean bobThere(String str) {
  for( int i=0; i<str.length()-2; i++) {
    if(str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")) return true;
  } return false;
}


//xyBalance
public boolean xyBalance(String str) {
	for(int i = str.length() - 1; i >= 0; i--){
		if(str.charAt(i) == 'x')      return false;
		else if(str.charAt(i) == 'y')	return true;
	}
	return true;  
}


//mixString
public String mixString(String a, String b) {
String newWord = "";
    for (int i = 0; i < Math.min(a.length(), b.length()); i++)
        newWord += "" + a.charAt(i) + b.charAt(i);
    if (a.length() > b.length())
        return newWord + a.substring(b.length());
    return newWord + b.substring(a.length());
}


//repeatEnd
public String repeatEnd(String str, int n) {
  String result="";
  for(int i=0; i<n; i++){
    result+=str.substring(str.length()-n);
  }return result;
}


//repeatFront
public String repeatFront(String str, int n) {
   String result="";
  for(int i=0; i<n; i++) {
    result+=str.substring(0,n-i);
  }return result;
}


//repeatSeparator
public String repeatSeparator(String word, String sep, int count) {
   String result="";
  while (count>1) {
    for(int i=0; i<count-1;i++) {
      result+=word+sep;
    }result+=word; return result;
  }
  if (count==0)  return "";
  return word;
}


//prefixAgain
public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n);
	return (str.indexOf(prefix, 1) != -1);
}


//xyzMiddle
public boolean xyzMiddle(String str) {
  int length = str.length();
  if (length < 3) return false;
  if (length % 2 == 1){
        return str.substring(length/2 - 1, length/2 + 2).equals("xyz");
  }
  return (str.substring(length/2 - 2, length/2 + 1).equals("xyz") 
            || str.substring(length/2 - 1, length/2 + 2).equals("xyz"));
}


//getSandwich
public String getSandwich(String str) {
  if(str.indexOf("bread")==str.lastIndexOf("bread")) return "";
  return (str.substring(str.indexOf(("bread"))+5, str.lastIndexOf("bread")));
}


//sameStarChar
public boolean sameStarChar(String str) {
  for (int i = 1; i < str.length()-1; i++){
        if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
          return false;
        }
  }
  return true;
}


//oneTwo
public String oneTwo(String str) {
  String result = "";
  for(int i=0; i<str.length()-2; i+=3) {
      result = result+str.substring(i+1,i+3)+str.charAt(i);
  }
  return result;
}


//zipZap
public String zipZap(String str) {
  for (int i = 0; i < str.length()-2; i++){
        if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
            str = str.substring(0,i+1) + str.substring(i+2);
        }
  }
  return str;
}


//starOut
public String starOut(String str) {
 String pattern = "([^*]{0,1})\\*+([^*]{0,1})";
    return str.replaceAll(pattern, "");
}


//plusOut
public String plusOut(String str, String word) {
  String result = "";
  int i = 0 ;
  while(i < str.length()){
    if (str.substring(i).startsWith(word)){
        result = result + word;
        i = i + word.length();
    } else {
        result = result + "+" ;
        i++;
    }
  }
  return result ;
}


//wordEnds
public String wordEnds(String str, String word) {
  int position = str.indexOf(word);
  String result = "";
   
  while (position != -1) {
        if (position > 0){
          result += str.charAt(position-1);
        }
        if (position + word.length() >= str.length()){
          break; 
        }
        result += str.charAt(position + word.length());
        position = str.indexOf(word, position+1);
    }
 return result; 
}
