//word0
public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String letters: strings){
    map.put(letters, 0);
  }
  return map;
}


//wordLen
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for(String words: strings){
    map.put(words, words.length());
  }
  return map;
}


//pairs
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(String words: strings){
    map.put(""+words.charAt(0), ""+words.charAt(words.length()-1));
  }
  return map;
}


//wordCount
public Map<String, Integer> wordCount(String[] strings) {
  Map<String,Integer> map = new HashMap<>();
  
  for(String letters: strings){
    if(map.containsKey(letters)){
      map.put(letters, map.get(letters)+1);
    }
   else  map.put(letters, 1);
  }
  return map;
}


//firstChar
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(String word : strings) {
    String firstLetter = word.substring(0,1);
    
    if(map.containsKey(firstLetter)){
      map.put(firstLetter, (map.get(firstLetter)+word));
    }else map.put(firstLetter, word);
  }
  return map;
}


//wordAppend
public String wordAppend(String[] strings) {
     Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            map.put(string, 0);
        }
        String result = "";
        for (String string : strings) {

            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
                if (map.get(string)%2==0){
                    result+=string;
                }
            }
        }
    return result;
}


//wordMultiple
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<>();
  for(String letter: strings){
    if(map.containsKey(letter)){
      map.put(letter, true);
    }else map.put(letter, false);
  }
  return map;
}


//allSwap
public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  String temp="";
           for (int i = 0; i < strings.length  ;i++) {
            if (map.containsKey(strings[i].substring(0, 1))) {

                temp = strings[map.get(strings[i].substring(0,1))];
                String  firstLetterKey= strings[i].substring(0,1);
                int prevLetterIndex = map.get(firstLetterKey);
                strings[prevLetterIndex] = strings[i];
                strings[i]=temp;
                map.put(firstLetterKey,-1);
                map.remove(firstLetterKey);

            }else
                map.put(strings[i].substring(0, 1), i);
        }
        return strings;
}


//firstSwap
public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  String temp="";
            for (int i = 0; i < strings.length  ;i++) {

            if (map.containsKey(strings[i].substring(0, 1))) {
                if (map.get(strings[i].substring(0,1))==-1) break;
                else {
                    temp = strings[map.get(strings[i].substring(0, 1))];
                    String firstLetterKey = strings[i].substring(0, 1);
                    int prevLetterIndex = map.get(firstLetterKey);
                    strings[prevLetterIndex] = strings[i];
                    strings[i] = temp;
                    map.put(firstLetterKey, -1);
                }
            }else
                map.put(strings[i].substring(0, 1), i);
        }
  return strings;
}
