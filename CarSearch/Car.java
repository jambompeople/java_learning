package CarSearch;
class Car{
  private int carid;
  private int year;
  private String owner;
  private Make make;
  private Model model;
  public Car(int carid, int year, String owner, Make make, Model model){
    this.carid = carid;
    this.year = year;
    this.owner = owner;
    this.make = make;
    this.model = model;
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
  public Make getMake(){
    return make;
  }
  public void setMake(Make make){
    this.make = make;
  }
  public Model getModel(){
    return model;
  }
  public void setModel(Model model){
    this.model = model;
  }
}
