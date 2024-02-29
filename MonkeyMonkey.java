import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MonkeyMonkey {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    //BELOW THIS IS MY HELPER FUNCTION IN THE CARD GAME

    //FUNCTION FOR DECK OF CARD
    public static List<String> deckFunction() {
        String[] titleOfCard = {"Club", "Heart", "Diamond", "Spade"};
        String[] lowerToHigher = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();
        for (String lth : lowerToHigher) {
            for (String toc : titleOfCard) {
                deck.add(lth + " of " + toc);
            }
        }
        return deck;
    }

    //DISPLAY THE DECK WITHOUT SHUFFLE
    public static void printTheDeck(List<String> deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    //DISPLAY THE DECK WITH SHUFFLE
    public static void displayShuffleDeck(List<String> deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    //DEFINE FOR HEAD OR TAILS
    public static boolean headOrTails() {
        return random.nextBoolean();
    }

    //RANDOMIZE PICKED CARD / HIDE CARD IN DECK
    public static String randomizedOneCard(List<String> deck) {
        return deck.remove(random.nextInt(deck.size()));
    }

    //DISPLAY PAIRED CARDS
    public static void displayAndEliminatedCard(List<String> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + cards.get(i));
        }
    }

    //ELIMANATED THE PAIRED CARDS
    public static void eliminatePairCards(List<String> cards) {
        int i = 0;
        while (i < cards.size() - 1) {
            int j = i + 1;
            while (j < cards.size()) {
                if (cards.get(i).charAt(0) == cards.get(j).charAt(0)) {
                    cards.remove(i);
                    cards.remove(j - 1);
                    break;
                }
                j++;
            }
            if (j == cards.size()) {
                i++;
            }
        }
    }

    //SELECTION CARD TO GIVE
    public static int SelectByCount(List<String> cards) {
        while (true) {
            try {
                System.out.print("Enter the index of the card to take (1-" + cards.size() + "): ");
                int choice = Integer.parseInt(scanner.nextLine()) - 1;
                if (choice >= 0 && choice < cards.size()) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please select again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    //FOUND FUNCTION ELSE NOT FOUND
    public static boolean checkIfFound(List<String> cards) {
        for (String card : cards) {
            if (card != null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //DISPLAY DECK CARDS
        System.out.println("Before: ");
        List<String> deckStraight = deckFunction();
        System.out.println("Display Deck without shuffle: ");
        printTheDeck(deckStraight);
        System.out.println("=================================================================================");
        
        //SHUFFLE CARDS
        System.out.println("After:");
        List<String> deck = deckFunction();
        Collections.shuffle(deck);
        System.out.println("\nShuffled Deck:");
        displayShuffleDeck(deck);
        System.out.println("=================================================================================");

        // DETERMINE WHO PLAY FIRST
        boolean flippedCoin = headOrTails();

        // DISPLAY RANDOM WHO DEAL FIRST
        if (flippedCoin) {
            System.out.println("\nHeads! You start first.");
        } else {
            System.out.println("\nTails! Computer starts first.");
        }

        // GAME STARTED HERE
        String pickedCard = randomizedOneCard(deck);
        System.out.println("Randomly picked card: " + pickedCard);

        List<String> computerCards = new ArrayList<>(deck.subList(0, deck.size() / 2));
        List<String> playerCards = new ArrayList<>(deck.subList(deck.size() / 2, deck.size()));

        //DISPLAY THE ELIMINATED CARDS
        System.out.println("\nBefore eliminating pairs:");
        System.out.println("Player Cards:");
        displayShuffleDeck(playerCards);
        System.out.println("Computer Cards:");
        displayShuffleDeck(computerCards);
        System.out.println("=================================================================================");
        eliminatePairCards(computerCards);
        eliminatePairCards(playerCards);

        //DISPLAY AFTER ELIMINATED CARDS AND REMAINING CARDS
        System.out.println("\nAfter eliminating pairs:");
        System.out.println("Player Cards:");
        displayAndEliminatedCard(playerCards);
        System.out.println("Computer Cards:");
        displayAndEliminatedCard(computerCards);
        System.out.println("=================================================================================");
        // DETERMINE WHO START TO DRAW/GIVE A CARD
        if (flippedCoin) {
            System.out.println("\nHuman start to give a card!");
        } else {
            System.out.println("\nComputer start to draw a card!");
        }

        // FUNCTION FOR SELECTING CARDS
        String selectedCard;
        System.out.println("\nChoose a card what you want to give:");
        if (flippedCoin) {
            System.out.println("\n < Your cards > \n");
            displayAndEliminatedCard(playerCards);
            int selectedCardIndex = SelectByCount(playerCards);
            selectedCard = playerCards.remove(selectedCardIndex);
            computerCards.add(selectedCard);
            System.out.println("=================================================================================");
        } else {
            System.out.println("\n < Computer's cards > \n");
            displayAndEliminatedCard(computerCards);
            int selectedCardIndex = SelectByCount(computerCards);
            selectedCard = computerCards.remove(selectedCardIndex);
            playerCards.add(selectedCard);
            System.out.println("=================================================================================");
        }
        System.out.println("Selected card: " + selectedCard);

        // FUCNTION WHO START TO PLAY
        if (flippedCoin) {
            System.out.println("\nFlipped Coin\nHuman starts first.");
            playGame(playerCards, computerCards, pickedCard, deck);
            System.out.println("=================================================================================");
        } else {
            System.out.println("\nFlipped Coin\nComputer starts first.");
            playGame(computerCards, playerCards, pickedCard, deck);
            System.out.println("=================================================================================");
        }
        

    }
    //GENERATE THE GAME FOR CARD MONKEY MONKEY REMAINING
    public static void playGame(List<String> playerCards, List<String> computerCards, String pickedCard, List<String> deck) {
        while (!playerCards.isEmpty() && !computerCards.isEmpty()) {
            
            
            System.out.println("\n < Human Turn > \n");
            System.out.println("Your Cards:");
            displayAndEliminatedCard(playerCards);
            if (!playerCards.isEmpty()) {
                int index = SelectByCount(playerCards);
                String cardTaken = playerCards.remove(index);
                displayAndEliminatedCard(playerCards);
                if (cardTaken.equals(pickedCard)) {
                    System.out.println(playerCards.contains(pickedCard) ? "Got it, Found pair ★" : "No match found. Try next turn.");
                    System.out.println("=================================================================================");
                }
            }
            System.out.println("\n< Computer's Turn >\n");
            boolean matched = checkIfFound(computerCards);
            if (matched) {
                System.out.println("Got it, Found pair ★");
                System.out.println("=================================================================================");
            } else {
                System.out.println("No match found. Try next turn.");
                System.out.println("=================================================================================");
            }
        }
    
        // DETERMINE WHO THE WINNER IN GAME
        if (computerCards.isEmpty()) {
            System.out.println("\nYou lose in the pair Game");
        } else {
            System.out.println("\nYou Win the Game");
        }

        // DISPLAYING FIRST AND LAST CARD IN BOTH
        System.out.println("\n< Human Cards >");
        if (!playerCards.isEmpty()) {
            System.out.println("First Card: " + pickedCard);
            System.out.println("Last Card: " + playerCards.get(playerCards.size() - 1));
        } else {
            System.out.println("No cards remaining.");
        }

        System.out.println("\n < Computer's Cards >");
        if (!computerCards.isEmpty()) {
            System.out.println("First Card: " + pickedCard);
            System.out.println("Last Card: " + computerCards.get(computerCards.size() - 1));
        } else {
            System.out.println("No cards remaining.");
        }

    }
    
    
}        