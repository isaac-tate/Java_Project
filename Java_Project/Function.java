public abstract class Function{//a generalized function class that can contain a number of different functions for use in the rootfinding class, can be extended
  
 public abstract double setX(double x);
    
  /*private double xal,yag,kxa,kya;
  private double x;
  private EquilibriumData eqdata;
  private AbsorptionColumn mycolumn;
  private double z;
  
  
//this function is for the absorption column interface
  public AbsorptionColumn(double kxa, double kya, double xal, double yag, double x, EquilibriumData eqdata){
    this.xal = xal;
    this.yag = yag;
    this.eqdata = new EquilibriumData(eqdata);
    this.kxa = kxa;
    this.kya = kya;
    double y = eqdata.equilibriumDataY(x);//calculate y using the equilibrium data
    double lmlconc =((1-this.xal)-(1-x))/Math.log((1-this.xal)/(1-x));///log mean liquid concentration at interface
    double lmgconc =((1-y)-(1-this.yag))/Math.log((1-y)/(1-this.yag));//log mean gas concentration at interface
    double m = -((kxa/lmlconc)/(kya/lmgconc));
    double b = 0.5*(this.yag+y-m*(this.xal+x));
    this.x = y-(m*x+b);//calculate the function for the determination of xai
  }
  public double setX(double x){
    double y = this.eqdata.equilibriumDataY(x);//calculate y using the equilibrium data
    double lmlconc =((1-this.xal)-(1-x))/Math.log((1-this.xal)/(1-x));///log mean liquid concentration at interface
    double lmgconc =((1-y)-(1-this.yag))/Math.log((1-y)/(1-this.yag));//log mean gas concentration at interface
    double m = -((this.kxa/lmlconc)/(this.kya/lmgconc));
    double b = 0.5*(this.yag+y-m*(this.xal+x));
    double g = y-(m*x+b);//calculate the function for the determination of xai
    return g;
  }
  public AbsorptionColumn(AbsorptionColumn mycolumn, double l){
    double x = mycolumn.recalculateHeightDifference(l);
    this.mycolumn = new AbsorptionColumn(mycolumn);
    this.x = x;
  }
  public double setX(double l, String a){
    double x = this.mycolumn.recalculateHeightDifference(l);
    this.mycolumn = new AbsorptionColumn(mycolumn);
    this.z = mycolumn.z;
    return x;
  }
  public double getX(){
    return this.x;
  }
  public double getZ(){
    return this.z;
  }
  public double getXal(){
    return this.xal;
  }
  public double getYag(){
    return this.yag;
  }
  public double getKxa(){
    return this.kxa;
  }
  public double getKya(){
    return this.kya;
  }
  public AbsorptionColumn getColumn(){
    return this.mycolumn;
  }
  public EquilibriumData getEqdata(){
    return this.eqdata;
  }*/
}