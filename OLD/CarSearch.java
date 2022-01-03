public class CarSearch{
  public static void main(String[]args){
    Make Toyota = new Make("Toyota", 001, "Jepan");
    Make BMW = new Make("BMW", 002, "Germany");
    Model Cianna = new Model("Cianna", 001, Toyota);
    Model Corola = new Model("Corola", 002, Toyota);
    Model Xsix = new Model("Xsix", 001, BMW);
    Model Ithree = new Model("Ithree", 002, BMW);
    Car Jdcar = new Car(001, 1984, "Jackson", Toyota, Cianna);
    Car Jfcar = new Car(002, 1894, "Jeff", Toyota, Corola);
    Car Gdcar = new Car(003, 1988, "Garry", BMW, Xsix);
    Car Ctcar = new Car(004, 1989, "Cathy", BMW, Ithree);
    System.out.println(Gdcar.getMake().getMakeLocation());
  }
}
class Make{
  private String makeName;
  private int makeId;
  private String makeLocation;
  public Make(String makeName, int makeId, String makeLocation){
    this.makeName = makeName;
    this.makeId = makeId;
    this.makeLocation = makeLocation;
  }
	public String getMakeName() {
		return makeName;
	}
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	public int getMakeId() {
		return makeId;
	}
	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}
	public String getMakeLocation() {
		return makeLocation;
	}
	public void setMakeLocation(String makeLocation) {
		this.makeLocation = makeLocation;
	}

}
class Model{
  private String modelname;
  private int modelid;
  private Make make;
  public Model(String modelname, int modelid, Make make){
    this.modelname = modelname;
    this.modelid = modelid;
    this.make = make;
  }
  public String getModelName(){
    return modelname;
  }
  public void setModelName(String modelname){
    this.modelname = modelname;
  }
  public int getModelId(){
    return modelid;
  }
  public void setModelId(int modelid){
    this.modelid = modelid;
  }
  public Make getMake(){
    return make;
  }
  public void setMake(Make make){
    this.make = make;
  }
}
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
