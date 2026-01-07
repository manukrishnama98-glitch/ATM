public class Main {
    public static void main(String[] args) {
        ConversationService service = new EnglishConversationService();
          ATM atm = new ATM(service);
        atm.start();
    }
}
