package B3;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;
/* loaded from: classes.dex */
public final class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChipGroup f253a;

    public g(ChipGroup chipGroup) {
        this.f253a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
        ChipGroup chipGroup = this.f253a;
        if (chipGroup.f8834B) {
            return;
        }
        if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.f8838x) {
            chipGroup.c(compoundButton.getId(), true);
            chipGroup.f8833A = compoundButton.getId();
            return;
        }
        int id = compoundButton.getId();
        if (z7) {
            int i7 = chipGroup.f8833A;
            if (i7 != -1 && i7 != id && chipGroup.f8837w) {
                chipGroup.c(i7, false);
            }
            chipGroup.setCheckedId(id);
        } else if (chipGroup.f8833A == id) {
            chipGroup.setCheckedId(-1);
        }
    }
}
