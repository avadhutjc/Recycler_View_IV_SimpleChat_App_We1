package com.masai.a1314july_recycler_view_iv_we1;

public class SenderModel extends BaseModel{
    private final String SenderMessage;

    public SenderModel(String message) {
        this.SenderMessage = message;
    }

    public String getSenderModel() {
        return SenderMessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
