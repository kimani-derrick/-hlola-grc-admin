package androidx.fragment.app;

import android.view.View;
import r0.AbstractC1111a;
/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0250d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6028q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0259m f6029r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ e0 f6030s;

    public /* synthetic */ RunnableC0250d(C0259m c0259m, e0 e0Var, int i7) {
        this.f6028q = i7;
        this.f6029r = c0259m;
        this.f6030s = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6028q) {
            case 0:
                C0259m c0259m = this.f6029r;
                M5.g.f(c0259m, "this$0");
                e0 e0Var = this.f6030s;
                M5.g.f(e0Var, "$operation");
                c0259m.a(e0Var);
                return;
            case 1:
                C0259m c0259m2 = this.f6029r;
                M5.g.f(c0259m2, "this$0");
                e0 e0Var2 = this.f6030s;
                M5.g.f(e0Var2, "$operation");
                if (c0259m2.f6059b.contains(e0Var2)) {
                    int i7 = e0Var2.f6036a;
                    View view = e0Var2.f6038c.W;
                    M5.g.e(view, "operation.fragment.mView");
                    AbstractC1111a.c(i7, view, c0259m2.f6058a);
                    return;
                }
                return;
            default:
                C0259m c0259m3 = this.f6029r;
                M5.g.f(c0259m3, "this$0");
                e0 e0Var3 = this.f6030s;
                M5.g.f(e0Var3, "$operation");
                c0259m3.f6059b.remove(e0Var3);
                c0259m3.f6060c.remove(e0Var3);
                return;
        }
    }
}
