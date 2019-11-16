package com.Erag0.ReversoContextBot.TelegramBotCore.Commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public class EmptyCommand implements Command{
    private TelegramBot bot;
    private Update update;
    public static final String NAME = "/empty";
    public EmptyCommand(TelegramBot bot, Update update) {
        this.bot = bot;
        this.update = update;
    }
    public void execute() {
        bot.execute(new SendMessage(update.message().chat().id(), "default command"));
    }
}
