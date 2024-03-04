package linear_algo_question;

public class find_num_in_2d {
    public static void main(String[] args) {
        
    
    int[] a={12,143};
    int x=3;
    }
    static int find(int[] a,int x){
        if(a.length==0){System.out.println("empty string"); return 0;}
        else{
            for(int i=0;i<a.length;i++){
               while (a[i]>0) {
                int z=a[i]%10;
                a[i]=a[i]/10;
                if(z==x){System.out.println("number found insde "+a[i]+"at index of "); break;}
                else{ return 0;}

               }
        }
        
        
        return 0;}
       
}
}
