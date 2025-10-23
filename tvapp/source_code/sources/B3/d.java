package B3;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.boxhdo.android.tv.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d extends T.b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f193q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f193q = chip;
    }

    @Override // T.b
    public final void l(ArrayList arrayList) {
        boolean z7 = false;
        arrayList.add(0);
        Rect rect = Chip.f8815K;
        Chip chip = this.f193q;
        if (chip.d()) {
            f fVar = chip.f8827u;
            if (fVar != null && fVar.f228a0) {
                z7 = true;
            }
            if (z7 && chip.f8830x != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // T.b
    public final void o(int i7, L.i iVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
        String str = "";
        if (i7 == 1) {
            Chip chip = this.f193q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, str).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            iVar.b(L.d.f1840e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f8815K);
    }
}
