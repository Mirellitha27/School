package mireya.com.school.domain.chat_mine.interactor;

import mireya.com.school.domain.chat_mine.preseter.ChatMinePresenter;

public class ChatMineInteractorImpl implements ChatMineInteractor {
    private ChatMinePresenter presenter;

    public ChatMineInteractorImpl(ChatMinePresenter presenter) {
        this.presenter = presenter;
    }
}
