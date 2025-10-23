package s3;

import java.util.concurrent.Callable;
/* renamed from: s3.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1187m0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14119b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f14120c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BinderC1181j0 f14121e;

    public /* synthetic */ CallableC1187m0(BinderC1181j0 binderC1181j0, String str, String str2, String str3, int i7) {
        this.f14118a = i7;
        this.f14119b = str;
        this.f14120c = str2;
        this.d = str3;
        this.f14121e = binderC1181j0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14118a) {
            case 0:
                BinderC1181j0 binderC1181j0 = this.f14121e;
                binderC1181j0.d.a0();
                C1178i c1178i = binderC1181j0.d.f14207s;
                q1.z(c1178i);
                return c1178i.n0(this.f14119b, this.f14120c, this.d);
            case 1:
                BinderC1181j0 binderC1181j02 = this.f14121e;
                binderC1181j02.d.a0();
                C1178i c1178i2 = binderC1181j02.d.f14207s;
                q1.z(c1178i2);
                return c1178i2.n0(this.f14119b, this.f14120c, this.d);
            case 2:
                BinderC1181j0 binderC1181j03 = this.f14121e;
                binderC1181j03.d.a0();
                C1178i c1178i3 = binderC1181j03.d.f14207s;
                q1.z(c1178i3);
                return c1178i3.T(this.f14119b, this.f14120c, this.d);
            default:
                BinderC1181j0 binderC1181j04 = this.f14121e;
                binderC1181j04.d.a0();
                C1178i c1178i4 = binderC1181j04.d.f14207s;
                q1.z(c1178i4);
                return c1178i4.T(this.f14119b, this.f14120c, this.d);
        }
    }
}
