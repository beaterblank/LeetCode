class Solution {
    public int romanToInt(String s) {
        int decimal = 0;
        int prevValue = 0;
        int value =0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I':value = 1;break;
                case 'V':value = 5;break;
                case 'X':value = 10;break;
                case 'L':value = 50;break;
                case 'C':value = 100;break;
                case 'D':value = 500;break;
                case 'M':value = 1000;break;        
            }
            decimal+=value;
            if(value>prevValue){
                decimal-=2*prevValue;
            }
            prevValue=value;
        }
        return decimal;
    }
}
