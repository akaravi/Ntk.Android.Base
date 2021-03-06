package ntk.android.base.entitymodel.enums;

public enum EnumTransactionBankStatus {
    None(0),
    Error(1),
    Paid(2),
    Pending(3),
    Confirmed(4),
    DeniedConfirmed(5);
    private final int index;

    EnumTransactionBankStatus(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

  public static EnumTransactionBankStatus get(int v) {
        if (v == None.index)
            return None;
        if (v == Error.index)
            return Error;
        if (v == Paid.index)
            return Paid;
        if (v == Pending.index)
            return Pending;
        if (v == Confirmed.index)
            return Confirmed;
        if (v == DeniedConfirmed.index)
            return DeniedConfirmed;
        return None;
    }
}
