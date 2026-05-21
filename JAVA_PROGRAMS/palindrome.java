class palidrome{
    public static void main(String[] args){
        
        
        String Pal = "MOM";
        String Reveresed = "";
        
        
        for (int i= Pal.length()-1; i>=0; i--){
            Reveresed = Reveresed + Pal.charAt(i);
        }
        if(Reveresed.equals(Pal)){
            System.out.println("The String " + Pal + "is an palindrome" );
        }
        else{
             System.out.println("The String " + Pal + " is not an palindrome");
        }
    }
}

