package ntk.android.base.entitymodel.enums;

public enum EnumHyperShopOrderType {
    Open(0),
    Payment(1),
    StartDelivery(2),
    InDelivery(3),
    EndDelivery(4),
    Close(10),
    Deleted(11);
    private final int index;

    EnumHyperShopOrderType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
