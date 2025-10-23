package j;

import android.widget.PopupWindow;
import e5.C0658c;
/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0658c f11491q;

    public m(C0658c c0658c) {
        this.f11491q = c0658c;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f11491q.h();
    }
}
