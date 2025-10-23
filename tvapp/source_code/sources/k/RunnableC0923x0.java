package k;

import androidx.appcompat.widget.SearchView;
/* renamed from: k.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0923x0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12112q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ SearchView f12113r;

    public /* synthetic */ RunnableC0923x0(SearchView searchView, int i7) {
        this.f12112q = i7;
        this.f12113r = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12112q) {
            case 0:
                this.f12113r.r();
                return;
            default:
                Q.c cVar = this.f12113r.f5503h0;
                if (cVar instanceof View$OnClickListenerC0855G0) {
                    cVar.b(null);
                    return;
                }
                return;
        }
    }
}
