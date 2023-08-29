public class to_end {
    public static String xToEnd(StringBuilder str,int idx,int count){
        if(idx == str.length()){
            StringBuilder new_str = str;
            for(int i = 0; i < count; i++){
                new_str.append('x');
            }
            return new_str.toString();
        }
        if(str.charAt(idx) == 'x'){
            str.replace(idx,idx+1,"");
            return xToEnd(str, idx, count + 1);
        }
        return xToEnd(str, idx + 1, count);
    } 
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("axbcxxd");
        String c = xToEnd(str,0,0);
        System.out.println(c);
    }
}
