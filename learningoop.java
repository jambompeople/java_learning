public class learningoop{
  public static void main(String[]args){
    car Volvo = new car();
    Volvo.show();
  }
}

class car{
  int weight;
  int hight;
  String brand;
  int price;
  public car(){
    weight = 33;
    hight = 22;
    brand = "volvo";
    price = 12223;
  }
  public void show(){
    System.out.println(weight+" "+hight+" "+brand+" ");
  }
}
