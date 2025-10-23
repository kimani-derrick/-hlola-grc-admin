package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
/* renamed from: androidx.fragment.app.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262p extends p6.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ p6.l f6064r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0263q f6065s;

    public C0262p(DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q, C0265t c0265t) {
        this.f6065s = dialogInterface$OnCancelListenerC0263q;
        this.f6064r = c0265t;
    }

    @Override // p6.l
    public final View A(int i7) {
        p6.l lVar = this.f6064r;
        if (lVar.B()) {
            return lVar.A(i7);
        }
        Dialog dialog = this.f6065s.y0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // p6.l
    public final boolean B() {
        if (!this.f6064r.B() && !this.f6065s.f6068C0) {
            return false;
        }
        return true;
    }
}
