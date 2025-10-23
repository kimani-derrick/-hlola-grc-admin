package f1;

import W5.InterfaceC0116x;
import android.database.Cursor;
import b1.C0355b;
import b1.C0356c;
import c1.C0387a;
import com.boxhdo.android.data.local.AppDatabase;
import k3.AbstractC0958a;
import w4.l0;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678f extends F5.i implements L5.p {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f10253A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f10254B;

    /* renamed from: C  reason: collision with root package name */
    public final /* synthetic */ String f10255C;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ String f10256D;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ float f10257E;
    public final /* synthetic */ Long F;

    /* renamed from: G  reason: collision with root package name */
    public final /* synthetic */ Long f10258G;

    /* renamed from: H  reason: collision with root package name */
    public final /* synthetic */ long f10259H;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0694v f10260u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f10261v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Long f10262w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f10263x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f10264y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10265z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0678f(C0694v c0694v, long j7, Long l7, int i7, long j8, String str, String str2, String str3, String str4, String str5, float f, Long l8, Long l9, long j9, D5.d dVar) {
        super(2, dVar);
        this.f10260u = c0694v;
        this.f10261v = j7;
        this.f10262w = l7;
        this.f10263x = i7;
        this.f10264y = j8;
        this.f10265z = str;
        this.f10253A = str2;
        this.f10254B = str3;
        this.f10255C = str4;
        this.f10256D = str5;
        this.f10257E = f;
        this.F = l8;
        this.f10258G = l9;
        this.f10259H = j9;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0678f(this.f10260u, this.f10261v, this.f10262w, this.f10263x, this.f10264y, this.f10265z, this.f10253A, this.f10254B, this.f10255C, this.f10256D, this.f10257E, this.F, this.f10258G, this.f10259H, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0678f) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        long j7;
        int i7;
        Y0.b bVar;
        Y0.b bVar2;
        AbstractC0958a.H(obj);
        C0694v c0694v = this.f10260u;
        C0356c c0356c = c0694v.f10325e;
        long j8 = 0;
        Long l7 = this.f10262w;
        if (l7 != null) {
            j7 = l7.longValue();
        } else {
            j7 = 0;
        }
        c0356c.getClass();
        C1458n a7 = C1458n.a("SELECT COUNT(movie_id) FROM tbl_continue_watch WHERE movie_id = ? AND episode_id = ?", 2);
        long j9 = this.f10261v;
        a7.P(j9, 1);
        a7.P(j7, 2);
        AppDatabase appDatabase = c0356c.f7045a;
        appDatabase.b();
        Cursor H6 = l0.H(appDatabase, a7);
        try {
            boolean z7 = false;
            if (H6.moveToFirst()) {
                i7 = H6.getInt(0);
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                z7 = true;
            }
            C0356c c0356c2 = c0694v.f10325e;
            long j10 = this.f10264y;
            int i8 = this.f10263x;
            if (z7) {
                if (l7 != null) {
                    j8 = l7.longValue();
                }
                AppDatabase appDatabase2 = c0356c2.f7045a;
                appDatabase2.b();
                C0355b c0355b = c0356c2.f7047c;
                D0.k a8 = c0355b.a();
                long j11 = i8;
                a8.P(j11, 1);
                a8.P(j10, 2);
                a8.P(j9, 3);
                a8.P(j8, 4);
                a8.P(j11, 5);
                appDatabase2.a();
                appDatabase2.a();
                D0.c K6 = appDatabase2.g().K();
                appDatabase2.f7287e.c(K6);
                if (K6.r()) {
                    K6.b();
                } else {
                    K6.a();
                }
                try {
                    a8.b();
                    appDatabase2.g().K().V();
                    appDatabase2.k();
                    c0355b.j(a8);
                    bVar2 = bVar;
                } catch (Throwable th) {
                    appDatabase2.k();
                    c0355b.j(a8);
                    throw th;
                }
            } else {
                Float f = new Float(this.f10257E);
                if (l7 != null) {
                    j8 = l7.longValue();
                }
                bVar2 = bVar;
                C0387a c0387a = new C0387a(this.f10261v, this.f10265z, this.f10253A, this.f10254B, this.f10255C, this.f10256D, f, j8, this.F, this.f10258G, new Long(j10), new Float(i8), new Long(this.f10259H));
                AppDatabase appDatabase3 = c0356c2.f7045a;
                appDatabase3.b();
                appDatabase3.a();
                appDatabase3.a();
                D0.c K7 = appDatabase3.g().K();
                appDatabase3.f7287e.c(K7);
                if (K7.r()) {
                    K7.b();
                } else {
                    K7.a();
                }
                try {
                    c0356c2.f7046b.m(c0387a);
                    appDatabase3.g().K().V();
                } finally {
                    appDatabase3.k();
                }
            }
            return new Y0.b(C1530l.f16479a);
        } finally {
            H6.close();
            a7.h();
        }
    }
}
