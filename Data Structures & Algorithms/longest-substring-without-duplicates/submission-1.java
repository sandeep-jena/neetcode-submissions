class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        Set<Character> set=new HashSet<>();
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){ //if the char isnt in the set i will add and count the size
                set.add(s.charAt(i));
                i++;
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(j));//if the char exist then i will remove it and will start again with same i value as it is not increased
                j++;
            }
        }
        return max;
    }
}


/*class Solution {

    public int lengthOfLongestSubstring(String s) {

        String sub="";

        for(int i=0;i<s.length();i++){

            String temp=String.valueOf(s.charAt(i));

            for(int j=i+1;j<s.length();j++){

                if(temp.indexOf(s.charAt(j))==-1)

                    temp+=s.charAt(j);

                else

                    break;

            }

            if(temp.length()>sub.length())

                sub=temp;

        }

        return sub.length();

    }

}*/
