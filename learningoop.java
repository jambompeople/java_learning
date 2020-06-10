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
    weight = 12;
    hight = 3;
    brand = "Volvo";
    price = 23;
  }
  public void show(){
    System.out.println(weight+" "+hight+" "+brand+" ");
  }
}
