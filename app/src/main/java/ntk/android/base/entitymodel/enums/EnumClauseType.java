package ntk.android.base.entitymodel.enums;

public enum  EnumClauseType {
    Or ( 1),
    And ( 2);

    private final int index;

    EnumClauseType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
