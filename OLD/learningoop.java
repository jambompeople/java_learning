package OLD;

public class learningoop{
  public static void main(String[]args){
    car jd = new car();
    System.out.println(jd.carname+jd.carweight+jd.carheight);
  }
}
class car{
  String carname = "jd's car";
  int carweight = 12345;
  int carheight = 23123132;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarweight() {
		return carweight;
	}
	public void setCarweight(int carweight) {
		this.carweight = carweight;
	}
	public int getCarheight() {
		return carheight;
	}
	public void setCarheight(int carheight) {
		this.carheight = carheight;
	}
}
