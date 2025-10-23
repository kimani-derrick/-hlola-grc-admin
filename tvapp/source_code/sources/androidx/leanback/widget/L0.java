package androidx.leanback.widget;

import android.view.View;
import k.V0;
/* loaded from: classes.dex */
public final class L0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6420q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ V0 f6421r;

    public /* synthetic */ L0(V0 v02, int i7) {
        this.f6420q = i7;
        this.f6421r = v02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6420q) {
            case 0:
                ((View) this.f6421r.f11961b).setVisibility(0);
                return;
            default:
                ((View) this.f6421r.f11961b).setVisibility(4);
                return;
        }
    }
}
