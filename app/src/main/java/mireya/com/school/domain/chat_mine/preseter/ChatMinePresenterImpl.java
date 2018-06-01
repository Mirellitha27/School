package mireya.com.school.domain.chat_mine.preseter;

import mireya.com.school.domain.chat_mine.interactor.ChatMineInteractor;
import mireya.com.school.domain.chat_mine.interactor.ChatMineInteractorImpl;
import mireya.com.school.domain.chat_mine.view.ChatMineView;

public class ChatMinePresenterImpl implements ChatMinePresenter {
    private ChatMineView view;
    private ChatMineInteractor interactor;

    public ChatMinePresenterImpl(ChatMineView view) {
        this.view = view;
        interactor = new ChatMineInteractorImpl(this);
    }

    @Override
    public void enableButton() {
        view.enableButton();
    }

    @Override
    public void disableButton() {
        view.disableButton();
    }

    @Override
    public void goMain() {
        view.goMain();
    }
}
