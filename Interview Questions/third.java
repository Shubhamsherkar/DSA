public class third {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int even=0;
        int l=a.length;
        for(int i=0;i<l;i++){
            if(a[i]%2==0) even++;
        }
        int d=0;
        int b[]=new int[l];
        for(int i=0;i<l;i++){
            if(a[i]%2==0){
               b[d]=a[i];
               d++;
            }
            else{
               b[even]=a[i];
               even++;
            }
        }
        for(int e:b){
            System.out.println(e);
        }
    }
}
