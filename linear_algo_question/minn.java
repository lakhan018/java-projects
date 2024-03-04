package linear_algo_question;

public class minn {
  
        public static void main(String[] args) {
            int[] z={};
            int[] x={1,2,3,5,6,6,7,8,8,8,8,8,8,7,1,2,2,3,3,3,3,22,2,2,2,2,2,3,3,3};
    minNum(z);
        }
    static int minNum(int[] x){
        int minind=0, a=1985250,i=0;
        if(x.length==0){System.out.println("empty list");}
        else{
            for( i =0; i<x.length;i++){
                if(a>x[i]){a=x[i];
                minind=i;}
    
            }
            System.err.println("minum numbee is "+a+"at index of ");
        }
        
        
        return 0;
    }
    }
    
    
