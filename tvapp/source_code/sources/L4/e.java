package L4;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import t3.C1251o;
/* loaded from: classes.dex */
public final class e implements g, h {

    /* renamed from: a  reason: collision with root package name */
    public final M4.b f2138a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2139b;

    /* renamed from: c  reason: collision with root package name */
    public final M4.b f2140c;
    public final Set d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2141e;

    public e(Context context, String str, Set set, M4.b bVar, Executor executor) {
        this.f2138a = new c(context, 0, str);
        this.d = set;
        this.f2141e = executor;
        this.f2140c = bVar;
        this.f2139b = context;
    }

    public final C1251o a() {
        boolean z7;
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = G.f.a(this.f2139b);
        } else {
            z7 = true;
        }
        if (!z7) {
            return m3.g.m("");
        }
        return m3.g.e(this.f2141e, new d(this, 0));
    }

    public final void b() {
        boolean z7;
        if (this.d.size() <= 0) {
            m3.g.m(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = G.f.a(this.f2139b);
        } else {
            z7 = true;
        }
        if (!z7) {
            m3.g.m(null);
            return;
        }
        m3.g.e(this.f2141e, new d(this, 1));
    }
}
