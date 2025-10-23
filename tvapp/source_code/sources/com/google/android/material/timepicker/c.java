package com.google.android.material.timepicker;

import K.C0026b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class c extends C0026b {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // K.C0026b
    public final void d(View view, L.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1466a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.f9020L.get(intValue - 1));
        }
        iVar.k(L.h.a(view.isSelected(), 0, 1, intValue, 1));
    }
}
