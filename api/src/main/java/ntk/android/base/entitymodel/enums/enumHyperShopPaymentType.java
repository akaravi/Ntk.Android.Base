package ntk.android.base.entitymodel.enums;

public enum enumHyperShopPaymentType {
    none(0),
    Online(1),
    OnPLace(2),
    OnlineAndOnPlace(3);
    private final int index;

    enumHyperShopPaymentType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
