//Video 49
public class displayHighScorePosition {

   static int newscore = 0;
   
   public static void main(String[] args) {
   displayHighScorePosition a = new displayHighScorePosition();
   a.calculateHighScorePosition(1500);
   a.displayHighScorePosition("Jacob", newscore);
   a.calculateHighScorePosition(900);
   a.displayHighScorePosition("Jacob", newscore);
   a.calculateHighScorePosition(400);
   a.displayHighScorePosition("Jacob", newscore);
   a.calculateHighScorePosition(50);
   a.displayHighScorePosition("Jacob", newscore);
   }
   
   public static void displayHighScorePosition(String playersName, int position) {
   String aa = (playersName + " managed to get into position " + position + " on the high score table");
   System.out.println(aa);
   
   }
   public static int calculateHighScorePosition(int score) {
  
   if (score > 1000) {
   newscore = 1; }
   else if (score > 500 && score < 1000) {
   newscore = 2; }
   else if (score > 100 && score < 500) {
   newscore = 3; }
   else {
   newscore = 4; }
   
   return newscore;
}
}
