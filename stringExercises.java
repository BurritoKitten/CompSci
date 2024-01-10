public class stringExercises {

  public static String scroll(String input) {
    return input.substring(1, input.length()) + input.charAt(0);
  }

  public static String convertName(String input) {
    String firstName = input.substring(input.indexOf(",") + 1, input.length());
    String lastName = input.substring(0, input.indexOf(","));
    return firstName.trim() + " " + lastName.trim();
  }

  public static String negative(String input) {
    //uses 'p' as a placeholder
    String output = input.replace('1', 'p');
    output = output.replace('0', '1');
    return output.replace('p', '0');
  }

  public static String convertDate(String americanDate) {
    return (
      americanDate.substring(3, 5) +
      '-' +
      americanDate.substring(0, 2) +
      '-' +
      americanDate.substring(6, 10)
    );
  }

  public static String convertDate2(String americanDate) {
    int loc1 = americanDate.indexOf('/');
    int loc2 = americanDate.indexOf('/', loc1 + 1);
    String month = americanDate.substring(0, loc1);
    String day = americanDate.substring(loc1 + 1, loc2);
    String year = americanDate.substring(loc2 + 1, americanDate.length());
    if (month.length() == 1) month = '0' + month;
    if (day.length() == 1) day = '0' + day;
    return (day + '-' + month + '-' + year);
  }

  public static boolean startsWith(String s, String prefix) {
    if (prefix.length() > s.length()) return false;
    return prefix.equals(s.substring(0, prefix.length()));
  }

  public static boolean endsWith(String s, String prefix) {
    if (prefix.length() > s.length()) return false;
    return prefix.equals(s.substring(s.length() - prefix.length(), s.length()));
  }

  public static String removeTag(String html, String tag) {
    int bPos = html.indexOf("<" + tag + ">");
    int ePos = html.indexOf("</" + tag + ">");
    if (bPos == -1 || ePos == -1 || ePos < bPos) {
      return html;
    }
    return html.substring(bPos + tag.length() + 2, ePos);
  }

  public static void main(String[] args) {
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));
    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));
    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));
    System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
    System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
    System.out.println("4/20/2014  becomes " + convertDate2("4/20/2014"));
    System.out.println("04/2/2014  becomes " + convertDate2("04/2/2014"));
    System.out.println("4/2/2014   becomes " + convertDate2("4/2/2014"));
    System.out.println("\nstartsWith");
    System.out.println(startsWith("architecture", "arch"));
    System.out.println(startsWith("architecture", "a"));
    System.out.println(startsWith("arch", "architecture"));
    System.out.println(startsWith("architecture", "rch"));
    System.out.println(startsWith("architecture", "architecture"));
    System.out.println("\nendsWith");
    System.out.println(endsWith("astronomy", "nomy"));
    System.out.println(endsWith("astronomy", "y"));
    System.out.println(endsWith("astronomy", "nom"));
    System.out.println(endsWith("nomy", "astronomy"));
    System.out.println(endsWith("astronomy", "astronomy"));
    System.out.println("\nremoveTag");
    System.out.println(removeTag("<b>Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World</b>", "head"));
    System.out.println(removeTag("Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World", "b"));
    System.out.println(removeTag("</img>Hello World<img>", "img"));
    System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
    System.out.println(
      removeTag("<title>Hello World</title> Happy Birthday", "title")
    );
    System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
  }
}
