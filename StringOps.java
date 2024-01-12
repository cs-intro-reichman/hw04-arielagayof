public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int [] a = allIndexOf("Hello world",'d');
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

   public static String capVowelsLowRest (String string) {
    
        String newWord = "";
        for (int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            if (currentChar == 'a' ||currentChar ==  'e' ||currentChar ==  'i' ||currentChar ==  'o' ||currentChar ==  'u'){
                newWord += (char)(currentChar - 32);
            }
            else if (currentChar >= 'A' && currentChar <= 'Z' && (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U')) {
                newWord += (char)(currentChar + 32);
            }
            else {
                newWord += currentChar;
            }
        }
        return newWord;
    }

    public static String camelCase (String string) {
        String res = "";

        for (int i = 0; i < string.length() ; i++) {
            while (string.charAt(i) == ' ') {
                i= i+1;
                if (res != ""){
                  if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                    res += (char)(string.charAt(i) - 32);
                    i++;
                  }
                  else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                    res += string.charAt(i);
                    i++;
                  }
                }
            }
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                res += (char)(string.charAt(i) + 32);
            }
            else {
                res += string.charAt(i);
            }
        }
                return res;
    }
    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count ++;
            }
        }
        int [] allIndex = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                allIndex[index] = i;
                index++;
            }
        }
        return allIndex;
    }
}
