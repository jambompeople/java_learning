package CarSearch;
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
