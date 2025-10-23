package k;

import android.os.Handler;
import android.widget.AbsListView;
/* renamed from: k.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893i0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0897k0 f12030a;

    public C0893i0(AbstractC0897k0 abstractC0897k0) {
        this.f12030a = abstractC0897k0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            AbstractC0897k0 abstractC0897k0 = this.f12030a;
            if (abstractC0897k0.f12049L.getInputMethodMode() != 2 && abstractC0897k0.f12049L.getContentView() != null) {
                Handler handler = abstractC0897k0.f12045H;
                RunnableC0891h0 runnableC0891h0 = abstractC0897k0.f12042D;
                handler.removeCallbacks(runnableC0891h0);
                runnableC0891h0.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }
}
