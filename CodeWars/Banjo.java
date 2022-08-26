public class Banjo {
    public static void main(String args[]){ 
        String name = "Ricardo";
        areYouPlayingBanjo(name);
    }

    public static String areYouPlayingBanjo(String name) {
      char character = name.charAt(0);
      if (character == 'r' || character == 'R'){
        System.out.println(name + " plays banjo" );
              
      }
      else {
        System.out.println(name + " does not play banjo");
      }
      return name;
    }
  }