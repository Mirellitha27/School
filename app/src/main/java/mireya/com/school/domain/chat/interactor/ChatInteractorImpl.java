package mireya.com.school.domain.chat.interactor;

import mireya.com.school.domain.chat.presenter.ChatPresenter;

public class ChatInteractorImpl implements ChatInteractor {
    private ChatPresenter presenter;
    public ChatInteractorImpl(ChatPresenter presenter){this.presenter = presenter;}

}
