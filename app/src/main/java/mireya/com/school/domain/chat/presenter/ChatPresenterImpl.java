package mireya.com.school.domain.chat.presenter;

import mireya.com.school.domain.chat.interactor.ChatInteractor;
import mireya.com.school.domain.chat.interactor.ChatInteractorImpl;
import mireya.com.school.domain.chat.view.ChatFragmentView;

public class ChatPresenterImpl implements ChatPresenter {

    private ChatFragmentView view;
    private ChatInteractor interactor;

    public ChatPresenterImpl(ChatFragmentView view) {
        this.view = view;
        interactor = new ChatInteractorImpl(this);
    }

    @Override
    public void ChatMineActivity() {
        view.ChatMineActivity();
    }
}
