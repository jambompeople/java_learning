package CarSearch;
class Model{
  private String modelname;
  private int modelid;
  public Model(String modelname, int modelid){
    this.modelname = modelname;
    this.modelid = modelid;
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
}
