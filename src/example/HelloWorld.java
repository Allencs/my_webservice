package example;

public class HelloWorld {

  public String sayTitle(String title) {
    String result = "Operation of sayTitle, Got message: " + title;
    System.out.println(result);
    return result;
  }

  public String sayBody(String body){
    String result = "Operation of sayBody, Got message: " + body;
    System.out.println(result);
    return result;
  }

  public String sayOther(String other){
    String result = "Operation of sayOther, Got message: " + other;
    System.out.println(result);
    return result;
  }
}
