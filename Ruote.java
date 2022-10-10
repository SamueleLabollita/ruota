import java.util.Random;
class RuotaOtto extends Thread{
  private String citta;

  public RuotaOtto(String citta){
    this.citta=citta;
  }
  public void run(){
    for(int i=0;i<5;i++){
      Random r=new Random();
      System.out.println(citta+""+(r.nextInt(90)+1));
    }
  }
}