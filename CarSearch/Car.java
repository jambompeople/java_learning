package CarSearch;
class Car{
  private int carid;
  private int year;
  private String owner;
  public Car(int carid, int year, String owner){
    this.carid = carid;
    this.year = year;
    this.owner = owner;
  }
  public int getCarid(){
    return carid;
  }
  public void setCarid(int carid){
    this.carid = carid;
  }
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
