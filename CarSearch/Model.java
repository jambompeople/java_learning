package CarSearch;
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
