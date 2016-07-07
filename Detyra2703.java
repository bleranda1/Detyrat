import javax.swing.*;

public class Detyra2703 {
  
  
  public Detyra2703(){}


  public int summation(int n){ 
   int answer=0;
   int i=0;
   if(n<0){answer =-1;}
   else { while(i<=n){
            answer +=i;
            i++;
        }
   } 
   return answer; 
  }


  public int product(int a,int b){
    int answer =1;
    int i=a;
    if(a<0 || b<0 || a>b ){ answer =-1; } 
    else { while (i<=b){
            answer *=i;
            i++;
         }
    }return answer;
  } 

 
  public long factorial(int c) 
  { int factor=0;
    long answer=1;
    if (factor<0) JOptionPane.showMessageDialog(null, "Error ");
    else {
       while(factor<c){
       factor++;
       answer *=factor;
       } 
     }return answer;
   }  


  /**sin calculates the sin value of its argument , using the formula
   * sin(x)= x-(x^3/3!)+(x^5/5!)-(x^7/7!)+...-(x^19/19!)
   * @param x- the value, in radians , whose sine is desired 
   * (i.e., sin(0)=0, sin(pi/2)=1 , sin(pi)=0 , sin(3pi/2)=-1, etc..)
   * return the sin as calculated by the formula */
  public double sin(double x){
    double answer =x;
    int n=3;
    while (n<=19)
    { double num= Math.pow(x,n)/factorial(n);
     if (n%4==3) answer -=num;
     else answer += num;
     n +=2;  } 
     return answer;
  }


  /** cos calculates the cos value of its parameter, using the formula
    * cosin(x) =1-(x^2/2!)+(x^4/4!)-(x^6/6!)+...-(x^20/20!)
    * @param x- the value, in radians , whose cosine is desired
    * @return the cosine as calculated by the formula*/
   public double cos(double x){
     double answer=1.0;
     int n=2;
     while(n<=20)
     { double num = Math.pow(x,n)/factorial(n);
       if (n%4==2) answer -=num;
       else answer +=num;
       n+=2;
     } return answer;
   }

   public static void main(String [] args){
    
    Detyra2703 m = new Detyra2703();
   
   
   System.out.println(m.summation(4));
   System.out.println(m.product(3,6));
   System.out.println(m.factorial(7));
   System.out.println(m.sin(Math.toRadians(60))); 
   System.out.println(m.cos(Math.toRadians(60)));
  }

}