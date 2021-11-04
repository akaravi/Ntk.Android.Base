package ntk.android.base.entitymodel.enums;

public enum EnumInputDataType {
    String(0),
    Int(1),
    Boolean(2),
    Float(3),
    Date(4),
    TextArea(5);
    private final int index;

    EnumInputDataType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
