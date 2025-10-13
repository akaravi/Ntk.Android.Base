package ntk.android.base.entitymodel.enums;

public enum EnumRecordStatus {
    Available(0), Disable(1), Deleted(2), Pending(3), DeniedConfirmed(4), Archive(5);
    private final int index;

    EnumRecordStatus(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
