class reverseStringBuilder{
    public static void main(String[] args) {
        // reverse string withou builtin functions
        StringBuilder sb=new StringBuilder("abcde");
        int high=sb.length()-1;
        int st=0;
        sb.reverse();
        System.out.println(sb);
        while(st<high){
            char temp=sb.charAt(st);
            sb.setCharAt(st,sb.charAt(high));
            sb.setCharAt(high,temp);
            st++;
            high--;



        }
        System.out.println(sb);
    }
}