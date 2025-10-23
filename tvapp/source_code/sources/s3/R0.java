package s3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.C0408c3;
import g3.AbstractC0733b;
import i3.C0771a;
import j3.C0837a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class R0 extends AbstractC1157L {

    /* renamed from: s  reason: collision with root package name */
    public final X0 f13865s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC1149D f13866t;

    /* renamed from: u  reason: collision with root package name */
    public volatile Boolean f13867u;

    /* renamed from: v  reason: collision with root package name */
    public final S0 f13868v;

    /* renamed from: w  reason: collision with root package name */
    public final M2.e f13869w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f13870x;

    /* renamed from: y  reason: collision with root package name */
    public final S0 f13871y;

    public R0(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13870x = new ArrayList();
        this.f13869w = new M2.e(c1175g0.f14037D);
        this.f13865s = new X0(this);
        this.f13868v = new S0(this, c1175g0, 0);
        this.f13871y = new S0(this, c1175g0, 1);
    }

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return false;
    }

    public final void K(Runnable runnable) {
        D();
        if (R()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f13870x;
        if (arrayList.size() >= 1000) {
            b().f13807v.d("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f13871y.b(60000L);
        P();
    }

    public final void L(AtomicReference atomicReference) {
        D();
        H();
        K(new A4.e(this, atomicReference, W(false), 8));
    }

    public final void M(C1168d c1168d) {
        boolean L6;
        D();
        H();
        C1152G p3 = ((C1175g0) this.f2765q).p();
        p3.C();
        byte[] t02 = x1.t0(c1168d);
        if (t02.length > 131072) {
            p3.b().f13808w.d("Conditional user property too long for local database. Sending directly to service");
            L6 = false;
        } else {
            L6 = p3.L(2, t02);
        }
        boolean z7 = L6;
        K(new U0(this, W(true), z7, new C1168d(c1168d), c1168d, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173 A[Catch: all -> 0x00e2, SQLiteFullException -> 0x00ed, SQLiteException -> 0x0159, SQLiteDatabaseLockedException -> 0x01d6, TryCatch #1 {all -> 0x00e2, blocks: (B:34:0x00af, B:36:0x00b5, B:38:0x00bf, B:40:0x00c5, B:42:0x00d9, B:44:0x00de, B:58:0x0105, B:59:0x0108, B:57:0x0101, B:62:0x010c, B:64:0x0120, B:71:0x0137, B:72:0x013b, B:73:0x013e, B:69:0x0131, B:75:0x0141, B:79:0x0155, B:91:0x0173, B:121:0x01e9, B:123:0x01ef, B:124:0x01f2, B:132:0x020e, B:92:0x0177, B:93:0x017a, B:89:0x016d, B:98:0x0183, B:99:0x018b, B:100:0x018f, B:140:0x0222, B:107:0x01a6, B:109:0x01bd, B:110:0x01c8), top: B:186:0x00af }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(s3.InterfaceC1149D r28, h3.AbstractC0748a r29, s3.m1 r30) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.R0.N(s3.D, h3.a, s3.m1):void");
    }

    public final void O(boolean z7) {
        D();
        H();
        C0408c3.a();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!c1175g0.f14062w.O(null, AbstractC1203v.f14310a1) && z7) {
            c1175g0.p().M();
        }
        if (S()) {
            K(new V0(this, W(false), 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [s3.J, g3.b] */
    public final void P() {
        D();
        H();
        if (R()) {
            return;
        }
        if (T()) {
            X0 x02 = this.f13865s;
            x02.f13930c.D();
            Context context = ((C1175g0) x02.f13930c.f2765q).f14056q;
            synchronized (x02) {
                try {
                    if (x02.f13928a) {
                        x02.f13930c.b().f13803D.d("Connection attempt already in progress");
                    } else if (x02.f13929b != null && (x02.f13929b.d() || x02.f13929b.c())) {
                        x02.f13930c.b().f13803D.d("Already awaiting connection attempt");
                    } else {
                        x02.f13929b = new AbstractC0733b(context, Looper.getMainLooper(), x02, x02);
                        x02.f13930c.b().f13803D.d("Connecting to remote service");
                        x02.f13928a = true;
                        g3.n.g(x02.f13929b);
                        x02.f13929b.a();
                    }
                } finally {
                }
            }
        } else if (!((C1175g0) this.f2765q).f14062w.S()) {
            List<ResolveInfo> queryIntentServices = ((C1175g0) this.f2765q).f14056q.getPackageManager().queryIntentServices(new Intent().setClassName(((C1175g0) this.f2765q).f14056q, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(((C1175g0) this.f2765q).f14056q, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f13865s.b(intent);
                return;
            }
            b().f13807v.d("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    public final void Q() {
        D();
        H();
        X0 x02 = this.f13865s;
        if (x02.f13929b != null && (x02.f13929b.c() || x02.f13929b.d())) {
            C1155J c1155j = x02.f13929b;
            c1155j.f10775t.incrementAndGet();
            synchronized (c1155j.f10767k) {
                try {
                    int size = c1155j.f10767k.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((g3.h) c1155j.f10767k.get(i7)).d();
                    }
                    c1155j.f10767k.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (c1155j.f10763g) {
                c1155j.f10764h = null;
            }
            c1155j.g(1, null);
        }
        x02.f13929b = null;
        try {
            C0771a.a().b(((C1175g0) this.f2765q).f14056q, this.f13865s);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f13866t = null;
    }

    public final boolean R() {
        D();
        H();
        if (this.f13866t != null) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        D();
        H();
        if (!T() || C().J0() >= ((Integer) AbstractC1203v.f14339p0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.R0.T():boolean");
    }

    public final void U() {
        D();
        C1154I b7 = b();
        ArrayList arrayList = this.f13870x;
        b7.f13803D.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e3) {
                b().f13807v.c(e3, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f13871y.a();
    }

    public final void V() {
        D();
        M2.e eVar = this.f13869w;
        ((C0837a) eVar.f2261s).getClass();
        eVar.f2260r = SystemClock.elapsedRealtime();
        this.f13868v.b(((Long) AbstractC1203v.f14278K.a(null)).longValue());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:47:0x014f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final s3.m1 W(boolean r47) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.R0.W(boolean):s3.m1");
    }
}
