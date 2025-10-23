package androidx.leanback.app;

import androidx.leanback.widget.VerticalGridView;
import w0.M;
/* renamed from: androidx.leanback.app.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273b extends M {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6194a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0274c f6195b;

    public C0273b(AbstractC0274c abstractC0274c) {
        this.f6195b = abstractC0274c;
    }

    @Override // w0.M
    public final void a() {
        boolean z7 = this.f6194a;
        AbstractC0274c abstractC0274c = this.f6195b;
        if (z7) {
            this.f6194a = false;
            abstractC0274c.f6199q0.f15466a.unregisterObserver(this);
        }
        VerticalGridView verticalGridView = abstractC0274c.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setSelectedPosition(abstractC0274c.f6200r0);
        }
    }

    @Override // w0.M
    public final void c(int i7, int i8) {
        boolean z7 = this.f6194a;
        AbstractC0274c abstractC0274c = this.f6195b;
        if (z7) {
            this.f6194a = false;
            abstractC0274c.f6199q0.f15466a.unregisterObserver(this);
        }
        VerticalGridView verticalGridView = abstractC0274c.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setSelectedPosition(abstractC0274c.f6200r0);
        }
    }
}
