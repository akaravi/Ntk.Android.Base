package ntk.android.base.utill;

import java.text.NumberFormat;
import java.util.Locale;

class NumberUnit {
    private String getFormattedAmount(int amount) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault());
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setMinimumFractionDigits(0);
        return numberInstance.format(amount);
    }
}
