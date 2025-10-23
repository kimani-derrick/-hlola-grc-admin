package s3;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class C0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13758q = 0;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ long f13759r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f13760s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f13761t;

    public /* synthetic */ C0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13758q) {
            case 0:
                C1212z0 c1212z0 = (C1212z0) this.f13760s;
                if (TextUtils.isEmpty(((C1175g0) c1212z0.f2765q).o().L())) {
                    c1212z0.M((Bundle) this.f13761t, 0, this.f13759r);
                    return;
                } else {
                    c1212z0.b().f13800A.d("Using developer consent only; google app id found");
                    return;
                }
            default:
                long j7 = this.f13759r;
                N0 n02 = (N0) this.f13761t;
                n02.P((O0) this.f13760s, false, j7);
                n02.f13840u = null;
                R0 r3 = ((C1175g0) n02.f2765q).r();
                r3.D();
                r3.H();
                r3.K(new R3.a(r3, null, 22, false));
                return;
        }
    }

    public C0(N0 n02, O0 o02, long j7) {
        this.f13760s = o02;
        this.f13759r = j7;
        this.f13761t = n02;
    }
}
