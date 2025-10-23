package b1;

import D0.k;
import android.os.Bundle;
import com.boxhdo.android.data.local.AppDatabase;
import java.util.concurrent.Callable;
import u4.C1292p;
import z5.C1530l;
/* renamed from: b1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0359f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7054b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7055c;

    public /* synthetic */ CallableC0359f(int i7, long j7, Object obj) {
        this.f7053a = i7;
        this.f7055c = obj;
        this.f7054b = j7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7053a) {
            case 0:
                C0361h c0361h = (C0361h) this.f7055c;
                C0355b c0355b = c0361h.f7061c;
                k a7 = c0355b.a();
                a7.P(this.f7054b, 1);
                AppDatabase appDatabase = c0361h.f7059a;
                appDatabase.a();
                appDatabase.a();
                D0.c K6 = appDatabase.g().K();
                appDatabase.f7287e.c(K6);
                if (K6.r()) {
                    K6.b();
                } else {
                    K6.a();
                }
                try {
                    a7.b();
                    appDatabase.g().K().V();
                    appDatabase.k();
                    c0355b.j(a7);
                    return C1530l.f16479a;
                } catch (Throwable th) {
                    appDatabase.k();
                    c0355b.j(a7);
                    throw th;
                }
            default:
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", this.f7054b);
                ((C1292p) this.f7055c).f15029k.n(bundle);
                return null;
        }
    }
}
