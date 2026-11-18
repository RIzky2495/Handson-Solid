interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    public void send(String message) { System.out.println("Mengirim Email: " + message); }
}
class SMSNotifier implements Notifier {
    public void send(String message) { System.out.println("Mengirim SMS: " + message); }
}
class WhatsAppNotifier implements Notifier {
    public void send(String message) { System.out.println("Mengirim WhatsApp: " + message); }
}
// Kanal baru: tidak ada kode lama yang diubah
class TelegramNotifier implements Notifier {
    public void send(String message) { System.out.println("Mengirim Telegram: " + message); }
}
class PushNotifier implements Notifier {
    public void send(String message) { System.out.println("Mengirim Push Notification: " + message); }
}

class NotificationService {
    private final Notifier notifier;
    public NotificationService(Notifier notifier) { this.notifier = notifier; }
    public void notify(String message) { notifier.send(message); }
}

class Main {
    public static void main(String[] args) {
        new NotificationService(new EmailNotifier()).notify("Halo, ini email test!");
        new NotificationService(new SMSNotifier()).notify("Ini SMS test!");
        new NotificationService(new WhatsAppNotifier()).notify("Ini pesan WhatsApp test!");
        new NotificationService(new TelegramNotifier()).notify("Ini pesan Telegram test!");
    }
}
