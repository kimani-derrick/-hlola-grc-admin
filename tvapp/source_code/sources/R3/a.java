package R3;

import H2.C0002c;
import android.content.ServiceConnection;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.K1;
import g3.n;
import l4.ExecutorC0976d;
import p4.j;
import s3.W;
import t3.AbstractC1245i;
import t3.C1242f;
import t3.C1247k;
import t3.C1248l;
import t3.C1251o;
import t3.InterfaceC1239c;
import t3.InterfaceC1240d;
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2918q;

    /* renamed from: r  reason: collision with root package name */
    public Object f2919r;

    /* renamed from: s  reason: collision with root package name */
    public Object f2920s;

    public /* synthetic */ a(int i7) {
        this.f2918q = i7;
    }

    private final void a() {
        try {
            e();
        } catch (Error e3) {
            synchronized (((j) this.f2920s).f13164r) {
                ((j) this.f2920s).f13165s = 1;
                throw e3;
            }
        }
    }

    private final void b() {
        C1247k c1247k = (C1247k) this.f2920s;
        try {
            C1251o c1251o = (C1251o) c1247k.f14586s.d((C1251o) this.f2919r);
            if (c1251o == null) {
                c1247k.c(new NullPointerException("Continuation returned null"));
                return;
            }
            ExecutorC0976d executorC0976d = AbstractC1245i.f14575b;
            c1251o.c(executorC0976d, c1247k);
            c1251o.b(executorC0976d, c1247k);
            c1251o.a(executorC0976d, c1247k);
        } catch (C1242f e3) {
            if (e3.getCause() instanceof Exception) {
                c1247k.f14587t.k((Exception) e3.getCause());
            } else {
                c1247k.f14587t.k(e3);
            }
        } catch (Exception e7) {
            c1247k.f14587t.k(e7);
        }
    }

    private final void c() {
        synchronized (((C1248l) this.f2920s).f14590s) {
            try {
                InterfaceC1239c interfaceC1239c = (InterfaceC1239c) ((C1248l) this.f2920s).f14591t;
                if (interfaceC1239c != null) {
                    interfaceC1239c.a((C1251o) this.f2919r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (((C1248l) this.f2920s).f14590s) {
            try {
                InterfaceC1240d interfaceC1240d = (InterfaceC1240d) ((C1248l) this.f2920s).f14591t;
                if (interfaceC1240d != null) {
                    Exception f = ((C1251o) this.f2919r).f();
                    n.g(f);
                    interfaceC1240d.c(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        ((java.lang.Runnable) r10.f2919r).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        p4.j.f13162v.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f2919r), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f2920s     // Catch: java.lang.Throwable -> L5e
            p4.j r2 = (p4.j) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.f13164r     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f2920s     // Catch: java.lang.Throwable -> L20
            p4.j r0 = (p4.j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f13165s     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L83
        L22:
            long r6 = r0.f13166t     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f13166t = r6     // Catch: java.lang.Throwable -> L20
            r0.f13165s = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f2920s     // Catch: java.lang.Throwable -> L20
            p4.j r4 = (p4.j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f13164r     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f2919r = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.f2920s     // Catch: java.lang.Throwable -> L20
            p4.j r0 = (p4.j) r0     // Catch: java.lang.Throwable -> L20
            r0.f13165s = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f2919r     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.f2919r = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = p4.j.f13162v     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.f2919r     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.f2919r = r2     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5e
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.a.e():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:259|(2:261|(12:263|264|(1:266)|267|268|269|270|(2:272|(1:274))|275|(1:279)(2:283|(1:287))|(1:281)|282))|292|(5:294|(1:296)(1:301)|297|(1:299)|300)|302|264|(0)|267|268|269|270|(0)|275|(4:277|279|(0)|282)|283|(1:285)|287|(0)|282) */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0545, code lost:
        if (r1.r() != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05b3, code lost:
        if (r1.r() != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x091c, code lost:
        r2 = r10.f13889M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0926, code lost:
        if (android.text.TextUtils.isEmpty(r2.i()) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0928, code lost:
        s3.C1175g0.i(r9);
        r9.f13810y.d("Remote config removed with active feature rollouts");
        r2.j(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266  */
    /* JADX WARN: Type inference failed for: r1v69, types: [s3.D0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [s3.q0, s3.p] */
    /* JADX WARN: Type inference failed for: r2v39, types: [s3.E, s3.L] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.a.run():void");
    }

    public String toString() {
        switch (this.f2918q) {
            case 0:
                C0002c c0002c = new C0002c(a.class.getSimpleName());
                K1 k12 = new K1(12, false);
                ((K1) c0002c.f1019t).f8368s = k12;
                c0002c.f1019t = k12;
                k12.f8367r = (D) this.f2920s;
                return c0002c.toString();
            case 11:
                Runnable runnable = (Runnable) this.f2919r;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + AbstractC0515y1.A(((j) this.f2920s).f13165s) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, int i7, Object obj2) {
        this.f2918q = i7;
        this.f2919r = obj;
        this.f2920s = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i7, boolean z7) {
        this.f2918q = i7;
        this.f2920s = obj;
        this.f2919r = obj2;
    }

    public a(j jVar) {
        this.f2918q = 11;
        this.f2920s = jVar;
    }

    public a(W w7, K k5, ServiceConnection serviceConnection) {
        this.f2918q = 13;
        this.f2919r = k5;
        this.f2920s = w7;
    }
}
