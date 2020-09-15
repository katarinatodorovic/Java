import java.util.Scanner;

public class Cards {
    private static int two=4;
    private static int three=4;
    private static int four=4;
    private static int five=4;
    private static int six=4;
    private static int seven=4;
    private static int eight=4;
    private static int nine=4;
    private static int ten=4;
    private static int ace=4;
    private static int q=4;
    private static int k=4;
    private static int j=4;

    public int[] playerCardsInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of card you have: ");
        int n=sc.nextInt();
        while (n<0 || n>52){
            System.out.println("Enter the correct number of cards you have: ");
            n=sc.nextInt();
        }

        if (n==0){
            System.out.println("You don't have any card.");
            System.exit(2);
        }

        int[] cards=new int[n];

      for (int i = 0;i<cards.length;i++){
          System.out.println("Enter a card: ");
          cards[i]=sc.nextInt();
          correctInput(cards[i]);
          if (cards[i]>14||cards[i]<2){
              System.out.println("Input correct cards-> values are in range from 2-14.");
              System.exit(1);
          }
      }
      return cards;
    }
    public int sumPoints(int []playerCards){
        int sumOfPoints=0;
        if (playerCards.length<=0){
            System.out.println("Input correct cards.");
            System.exit(3);
        }else {
            for (int i =0;i<playerCards.length;i++){
                if (playerCards[i]>=10){
                    sumOfPoints++;
                }
            }
        }
        return sumOfPoints;
    }
    public String whoIsTheWinner(int []player1Cards,int []player2Cards){
        String s ="";
        int player1= sumPoints(player1Cards);
        int player2= sumPoints(player2Cards);
        if (player1==player2){
            s = "It's a tie.";
        }
        if (player1>player2){
           s = "Player 1 wins.";
        }
       if(player1<player2){ s ="Player 2 wins.";}
        return s;
    }
    public void whoIsTheWinner(int player1, int player2){
        if (player1==player2){
            System.out.println("It's a tie.");
        }
        if (player1>player2){
            System.out.println("Player 1 wins.");
        }
        if(player1<player2) System.out.println("Player 2 wins.");
    }
    public boolean correctInput(int card){
        boolean isCorrect = true;
        int sumPoints =0;
            switch (card){
                case 2:
                    two--;
                    break;
                case 3:
                   three--;
                    break;
                case 4:
                    four--;
                    break;
                case 5:
                   five--;
                    break;
                case 6:
                    six--;
                    break;
                case 7:
                    seven--;
                    break;
                case 8:
                    eight--;
                    break;
                case 9:
                   nine--;
                    break;
                case 10:
                    ten--;
                    break;
                 case 11:
                    ace--;
                    break;
                case 12:
                    j--;
                    break;
                case 13:
                    q--;
                    break;
                case 14:
                   k--;
                    break;
            }

        if (two<0||three<0||four<0||five<0||six<0||
                seven<0||eight<0||nine<0||ten<0||ace<0||j<0||k<0||q<0){
            isCorrect = false;
            System.out.println("Something went wrong.");
            System.exit(5);
        }
        return isCorrect;
        }
    }

