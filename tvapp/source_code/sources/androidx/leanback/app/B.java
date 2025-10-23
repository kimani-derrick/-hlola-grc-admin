package androidx.leanback.app;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.leanback.widget.Q0;
/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6153q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f6154r;

    public /* synthetic */ B(int i7, Object obj) {
        this.f6153q = i7;
        this.f6154r = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6153q) {
            case 0:
                C c5 = (C) this.f6154r;
                if (c5.f6155q && ((ViewGroup) c5.f6157s) != null && c5.f6156r && ((ProgressBar) c5.f6158t) == null) {
                    c5.f6158t = new ProgressBar(((ViewGroup) c5.f6157s).getContext(), null, 16842874);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    ((ViewGroup) c5.f6157s).addView((ProgressBar) c5.f6158t, layoutParams);
                    return;
                }
                return;
            default:
                H h7 = (H) this.f6154r;
                A1.b bVar = h7.f6183K0;
                Q0 q02 = h7.f6184L0;
                bVar.getClass();
                q02.f6466c.setChildrenVisibility(0);
                return;
        }
    }
}
