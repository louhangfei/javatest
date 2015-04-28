 class CodeBlock01{
      public static void main(String[] args){
          
            {
              int x=3;
              System.out.println("1,普通代码块内的变量x="+x);    
            }
            
            int x=1;
            System.out.println("主方法内的变量x="+x);
            
            {
               int y=7;
               System.out.println("2,普通代码块内的变量y="+y);    
            }
          }
    }