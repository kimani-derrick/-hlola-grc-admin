package androidx.emoji2.text;

import Z2.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.AbstractC0958a;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5857a;

    /* renamed from: b  reason: collision with root package name */
    public final H.e f5858b;

    /* renamed from: c  reason: collision with root package name */
    public final J3.e f5859c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f5860e;
    public Executor f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f5861g;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC0958a f5862h;

    public o(Context context, H.e eVar) {
        J3.e eVar2 = p.d;
        this.d = new Object();
        android.support.v4.media.session.b.j(context, "Context cannot be null");
        this.f5857a = context.getApplicationContext();
        this.f5858b = eVar;
        this.f5859c = eVar2;
    }

    @Override // androidx.emoji2.text.i
    public final void a(AbstractC0958a abstractC0958a) {
        synchronized (this.d) {
            this.f5862h = abstractC0958a;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.f5862h = null;
                Handler handler = this.f5860e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5860e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5861g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f5861g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.f5862h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new F("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5861g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new E1.b(9, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k d() {
        try {
            J3.e eVar = this.f5859c;
            Context context = this.f5857a;
            H.e eVar2 = this.f5858b;
            eVar.getClass();
            H.j a7 = H.d.a(context, eVar2);
            int i7 = a7.f793q;
            if (i7 == 0) {
                H.k[] kVarArr = (H.k[]) a7.f794r;
                if (kVarArr != null && kVarArr.length != 0) {
                    return kVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(AbstractC1111a.n(i7, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}
