package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: androidx.leanback.widget.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295h0 extends Z {

    /* renamed from: b  reason: collision with root package name */
    public final C0297i0 f6591b;

    public C0295h0(C0289e0 c0289e0, C0297i0 c0297i0) {
        super(c0289e0);
        c0289e0.addView(c0297i0.f6572a);
        C0291f0 c0291f0 = c0297i0.f6593c;
        if (c0291f0 != null) {
            View view = c0291f0.f6572a;
            ViewGroup viewGroup = c0289e0.f6577q;
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view, 0);
            }
        }
        this.f6591b = c0297i0;
        c0297i0.f6592b = this;
    }
}
