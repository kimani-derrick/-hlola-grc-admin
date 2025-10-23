package s3;

import android.os.Bundle;
/* renamed from: s3.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1185l0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14110q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f14111r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f14112s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f14113t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f14114u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14115v;

    public /* synthetic */ RunnableC1185l0(Object obj, Object obj2, Object obj3, Object obj4, long j7, int i7) {
        this.f14110q = i7;
        this.f14111r = obj2;
        this.f14112s = obj3;
        this.f14114u = obj4;
        this.f14113t = j7;
        this.f14115v = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14110q) {
            case 0:
                String str = (String) this.f14112s;
                BinderC1181j0 binderC1181j0 = (BinderC1181j0) this.f14115v;
                String str2 = (String) this.f14111r;
                if (str2 == null) {
                    q1 q1Var = binderC1181j0.d;
                    q1Var.d().D();
                    String str3 = q1Var.f14204V;
                    if (str3 == null || str3.equals(str)) {
                        q1Var.f14204V = str;
                        q1Var.f14203U = null;
                        return;
                    }
                    return;
                }
                O0 o02 = new O0(this.f14113t, (String) this.f14114u, str2);
                q1 q1Var2 = binderC1181j0.d;
                q1Var2.d().D();
                String str4 = q1Var2.f14204V;
                if (str4 != null) {
                    str4.equals(str);
                }
                q1Var2.f14204V = str;
                q1Var2.f14203U = o02;
                return;
            case 1:
                Object obj = this.f14114u;
                ((C1212z0) this.f14115v).L(this.f14113t, obj, (String) this.f14111r, (String) this.f14112s);
                return;
            default:
                Bundle bundle = (Bundle) this.f14111r;
                if (bundle != null) {
                    bundle.remove("screen_name");
                    bundle.remove("screen_class");
                }
                N0 n02 = (N0) this.f14115v;
                Bundle O5 = n02.C().O("screen_view", bundle, null, false);
                n02.O((O0) this.f14112s, (O0) this.f14114u, this.f14113t, true, O5);
                return;
        }
    }
}
