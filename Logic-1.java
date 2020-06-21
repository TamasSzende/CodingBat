//cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
    return ((isWeekend && cigars>=40) || (cigars>=40 && cigars<=60));
}


//dateFashion
public int dateFashion(int you, int date) {
  if (you<=2 || date<=2) return 0;
  else if (you>8 || date>8 ) return 2;
  return 1;
}


//squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  return((temp>=60 && temp<=90)|| (temp>=60 && temp<=100 && isSummer));
}


//coughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday)	speed -= 5;
	if(speed <= 60)	return 0;
	else if(speed <= 80) return 1;
	return 2;
}


//sortaSum
public int sortaSum(int a, int b) {
  int sum = a+b;
  return (sum>=10 && sum <=19)? 20 : sum;
}


//alarmClock
public String alarmClock(int day, boolean vacation) {
  if(!vacation) {
    if(day>0 && day < 6) return "7:00";
    else return "10:00";
  } else if(day>0 && day < 6) return "10:00";
  else return "off";
}

//love6
public boolean love6(int a, int b) {
  return (a==6 || b==6 || (a+b)==6 || Math.abs(a-b)==6);
}


//in1To10
public boolean in1To10(int n, boolean outsideMode) {
  return (outsideMode) ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10);
}


//specialEleven
public boolean specialEleven(int n) {
  return ((n%11 == 0) || (n%11 == 1));
}


//more20
public boolean more20(int n) {
  return (n%20 == 1 || n%20 == 2);
}


//old35
public boolean old35(int n) {
  return n % 3 == 0 ^ n % 5 == 0;
}


//less20
public boolean less20(int n) {
  return (n%20==18 || n%20==19);
}


//near10
public boolean nearTen(int num) {
  int mod=num%10;
  return (mod==0 || mod==1 || mod==2 || mod==9 || mod==8);
}


//teenSum
public int teenSum(int a, int b) {
  int sum=a+b;
  return ((a>12 && a<20) || (b>12 && b<20)) ? 19 : sum;
}


//answerCell
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
 if(isAsleep)return false;
 if(isMom) return true;
 return (!isMorning);
}


//teaParty
public int teaParty(int tea, int candy) {
  if(tea<5 || candy<5) return 0;
  if((tea/candy>=2) || (candy/tea>=2)) return 2;
  return 1;
}


//fizzString
public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
  if(str.startsWith("f")) return "Fizz";
  if(str.endsWith("b")) return "Buzz";
  return str;
}


//fizzString2
public String fizzString2(int n) {
  if(n%3==0 && n%5==0) return "FizzBuzz!";
  if(n%3==0) return "Fizz!";
  if(n%5==0) return "Buzz!";
  return Integer.toString(n)+"!";
}


//twoAsOne
public boolean twoAsOne(int a, int b, int c) {
  return ((a + b) == c || (b + c) == a || (c + a) == b);
}


//inOrder
public boolean inOrder(int a, int b, int c, boolean bOk) {
  return (bOk && c>b) || (!bOk && b>a && c>b)? true : false;
}


//inOrderEqual
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return ((equalOk && (a<=b && b<=c )) || (a<b && b<c)) ? true : false;
}


//lastDigit
public boolean lastDigit(int a, int b, int c) {
  return (a%10==b%10 || b%10==c%10 || a%10==c%10)? true : false;
}


//lessBy10
public boolean lessBy10(int a, int b, int c) {
  return (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10);
}


//withoutDoubles
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles && (die1==die2) && die1<6 && die2<6) {
    die1++;
  } 
  if(noDoubles && die1==die2 && die1==6){
    die1=1;
  }
  return die1+die2;
}


//maxMod5
public int maxMod5(int a, int b) {
  if(a == b)	       return 0;
	if(a % 5 == b % 5) return (a < b) ? a : b;
	return (a > b) ? a : b;
}


//redTicket
public int redTicket(int a, int b, int c) {
  if(a == b && b == c){
		if(a == 2) return 10;
      else return 5;
	}
	if(a != b && a !=c)	return 1;
	return 0;
}


//greenTicket
public int greenTicket(int a, int b, int c) {
  if(a==b && b==c) return 20;
  if (a==b || b==c || a==c) return 10;
  return 0;
}


//blueTicket
public int blueTicket(int a, int b, int c) {
  if((a+b==10) || (b+c==10) || (a+c==10)) return 10;
  if((a+b-10)==(a+c) || (a+b-10)==(b+c)) return 5;
  return 0;
}


//shareDigit
public boolean shareDigit(int a, int b) {
  int a1=a/10;
  int a2=a%10;
  int b1=b/10;
  int b2=b%10;
  return (a1==b1 || a1==b2 || a2==b1 || a2==b2);
}


//sumLimit
public int sumLimit(int a, int b) {
 int sum=a+b;
 String stringSum=Integer.toString(sum);
 String stringA=Integer.toString(a);
 return (stringSum.length()>stringA.length())? a : a+b;
}
