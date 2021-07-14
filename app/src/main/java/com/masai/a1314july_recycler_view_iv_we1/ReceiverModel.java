package com.masai.a1314july_recycler_view_iv_we1;

public class ReceiverModel extends BaseModel {
    private String receiverMessage;

    public ReceiverModel(String message) {
        this.receiverMessage = message;
    }

    public String getReceiverModel() {
        return receiverMessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
