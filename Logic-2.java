//makeBricks
public boolean makeBricks(int small, int big, int goal) {
  return goal<=(small+big*5) &&  goal%5<=small;
}


//loneSum
public int loneSum(int a, int b, int c) {
  if(a==b && b==c) return 0;
  if(a==b) return c;
  if(b==c) return a;
  if(a==c) return b;  
  return a+b+c;
}


//luckySum
public int luckySum(int a, int b, int c) {
  if(a==13)   return 0;
  if (b==13) return a;
  if(c==13)   return a+b;
  return a+b+c;
}


//noTeenSum
public int noTeenSum(int a, int b, int c) {
    return teen(a)+teen(b)+teen(c);
}

public int teen(int t){
  if(t<13 || t>19 || t==15 || t==16){
    return t;
  }
  return 0;
}


//roundSum
public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}

public int round10(int num){
  return (num%10<5)? num - num%10 : num+(10-num%10);
}


//closeFar
public boolean closeFar(int a, int b, int c) {
	return (Math.abs(b-a) <= 1 && Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2
		|| Math.abs(c-a) <= 1 && Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2);
}


//blackJack
public int blackjack(int a, int b) {
  if(a > 21){
		if(b > 21) return 0;
		return b;
	}
	if(a < b && b <= 21) return b;
	return a;
}


//evenlySpaced
public boolean evenlySpaced(int a, int b, int c) {
    int tmp;
    if (a > b) { tmp = a; a = b; b = tmp; }
    if (a > c) { tmp = a; a = c; c = tmp; }
    if (b > c) { tmp = b; b = c; c = tmp; }
  return (a-b==b-c);
}


//makeChocolate
public int makeChocolate(int small, int big, int goal) {
  int maxBig=goal/5;
  if(maxBig<=big){
    goal-=maxBig*5;
  }else goal-=big*5;
  
 if(goal<=small) return goal;
 return -1;
}
