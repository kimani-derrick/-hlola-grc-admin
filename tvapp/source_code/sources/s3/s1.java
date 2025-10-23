package s3;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class s1 implements w1 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14236q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q1 f14237r;

    public /* synthetic */ s1(q1 q1Var, int i7) {
        this.f14236q = i7;
        this.f14237r = q1Var;
    }

    public void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        switch (this.f14236q) {
            case 0:
                this.f14237r.B(true, i7, th, bArr);
                return;
            default:
                this.f14237r.q(str, i7, th, bArr, map);
                return;
        }
    }

    @Override // s3.w1
    public void c(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        q1 q1Var = this.f14237r;
        if (isEmpty) {
            C1175g0 c1175g0 = q1Var.f14185B;
            if (c1175g0 != null) {
                C1154I c1154i = c1175g0.f14064y;
                C1175g0.i(c1154i);
                c1154i.f13807v.c(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        q1Var.d().M(new j.d(this, str, str2, bundle, 6));
    }

    public s1(q1 q1Var, String str) {
        this.f14236q = 0;
        this.f14237r = q1Var;
    }
}
