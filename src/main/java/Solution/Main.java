package Solution;

import org.telegram.telegrambots.*;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.xml.bind.annotation.XmlType;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            //telegramBotsApi.registerBot(new Bot());
            String botToken = System.getenv("BOT_TOKEN");
            String botUserName = System.getenv("BOT_USERNAME");
            String adminChat = System.getenv("ADMIN_CHAT");
            System.out.println(botToken + "\n" + botUserName + "\n" + adminChat);
            telegramBotsApi.registerBot(new Bot(System.getenv("BOT_TOKEN"), System.getenv("BOT_USERNAME"), System.getenv("ADMIN_CHAT")));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
