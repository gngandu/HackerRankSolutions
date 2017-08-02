/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
 
private static int B;
private static int H;
private static  boolean flag;

static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    try{
               
        if(B <= 0){
            flag = false;
              throw new Exception("Breadth and height must be positive");
            
        } else if(H <= 0){
             flag = false;
              throw new Exception("Breadth and height must be positive");
        } else {
             flag = true;
        }
        
    } catch(Exception e){
        System.out.println(e);
    }
}