public class Integration{//a generalized class that can hold a number of different integration methods
  
  public static double Simpsons(double [] x, double [] y){
    
    double intapprox,a,b,delx,b2;
    
    for(int i = 0;i<x.length;i++){
    }
    a = x[0];
    b = x[x.length-1];
    
    if(x.length%2!=0){
      delx = (b-a)/(x.length-1);
      intapprox = y[0];
      
      for(int i = 1;i<x.length-1;i++){
        if(i%2 == 0){
          intapprox = intapprox+4*y[i];
        }
        else{
          intapprox = intapprox+2*y[i];
        }
      }
      intapprox = intapprox+y[y.length-1];
      intapprox = intapprox*delx/3;
    }
    else{
      b2 = x[x.length-3];
      delx = (b2-a)/(x.length-4);
      intapprox = y[0];
      
      for(int i = 1;i<x.length-4;i++){
        if(i%2 == 0){
          intapprox = intapprox+4*y[i];
        }
        else{
          intapprox = intapprox+2*y[i];
        }
      }
      intapprox = intapprox+y[y.length-3];
      intapprox = intapprox*delx/3;
      
      intapprox = intapprox+(3/8)*(y[y.length-4]+3*y[y.length-3]+3*y[y.length-2]+y[y.length-1]);
      
    }
    return intapprox;
  }
}
                                   
     