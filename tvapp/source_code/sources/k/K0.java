package k;

import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final /* synthetic */ class K0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11909q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Toolbar f11910r;

    public /* synthetic */ K0(Toolbar toolbar, int i7) {
        this.f11909q = i7;
        this.f11910r = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.k kVar;
        switch (this.f11909q) {
            case 0:
                N0 n02 = this.f11910r.f5546d0;
                if (n02 == null) {
                    kVar = null;
                } else {
                    kVar = n02.f11913r;
                }
                if (kVar != null) {
                    kVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f11910r.m();
                return;
        }
    }
}
