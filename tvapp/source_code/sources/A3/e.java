package A3;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f85q;

    public e(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f85q = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f8795D).compareTo(Boolean.valueOf(materialButton2.f8795D));
        if (compareTo == 0) {
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 == 0) {
                MaterialButtonToggleGroup materialButtonToggleGroup = this.f85q;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            }
            return compareTo2;
        }
        return compareTo;
    }
}
