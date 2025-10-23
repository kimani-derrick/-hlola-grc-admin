package s3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
/* loaded from: classes.dex */
public final class T extends AbstractC1195q0 {

    /* renamed from: Q  reason: collision with root package name */
    public static final Pair f13877Q = new Pair("", 0L);

    /* renamed from: A  reason: collision with root package name */
    public long f13878A;

    /* renamed from: B  reason: collision with root package name */
    public final Z2.A f13879B;

    /* renamed from: C  reason: collision with root package name */
    public final S f13880C;

    /* renamed from: D  reason: collision with root package name */
    public final L0.b f13881D;

    /* renamed from: E  reason: collision with root package name */
    public final C4.b f13882E;
    public final S F;

    /* renamed from: G  reason: collision with root package name */
    public final Z2.A f13883G;

    /* renamed from: H  reason: collision with root package name */
    public final Z2.A f13884H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f13885I;

    /* renamed from: J  reason: collision with root package name */
    public final S f13886J;

    /* renamed from: K  reason: collision with root package name */
    public final S f13887K;

    /* renamed from: L  reason: collision with root package name */
    public final Z2.A f13888L;

    /* renamed from: M  reason: collision with root package name */
    public final L0.b f13889M;

    /* renamed from: N  reason: collision with root package name */
    public final L0.b f13890N;

    /* renamed from: O  reason: collision with root package name */
    public final Z2.A f13891O;

    /* renamed from: P  reason: collision with root package name */
    public final C4.b f13892P;

    /* renamed from: s  reason: collision with root package name */
    public SharedPreferences f13893s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f13894t;

    /* renamed from: u  reason: collision with root package name */
    public SharedPreferences f13895u;

    /* renamed from: v  reason: collision with root package name */
    public U f13896v;

    /* renamed from: w  reason: collision with root package name */
    public final Z2.A f13897w;

    /* renamed from: x  reason: collision with root package name */
    public final L0.b f13898x;

    /* renamed from: y  reason: collision with root package name */
    public String f13899y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13900z;

    public T(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13894t = new Object();
        this.f13879B = new Z2.A(this, "session_timeout", 1800000L);
        this.f13880C = new S(this, "start_new_session", true);
        this.f13883G = new Z2.A(this, "last_pause_time", 0L);
        this.f13884H = new Z2.A(this, "session_id", 0L);
        this.f13881D = new L0.b(this, "non_personalized_ads");
        this.f13882E = new C4.b(this, "last_received_uri_timestamps_by_source");
        this.F = new S(this, "allow_remote_dynamite", false);
        this.f13897w = new Z2.A(this, "first_open_time", 0L);
        g3.n.c("app_install_time");
        this.f13898x = new L0.b(this, "app_instance_id");
        this.f13886J = new S(this, "app_backgrounded", false);
        this.f13887K = new S(this, "deep_link_retrieval_complete", false);
        this.f13888L = new Z2.A(this, "deep_link_retrieval_attempts", 0L);
        this.f13889M = new L0.b(this, "firebase_feature_rollouts");
        this.f13890N = new L0.b(this, "deferred_attribution_cache");
        this.f13891O = new Z2.A(this, "deferred_attribution_cache_timestamp", 0L);
        this.f13892P = new C4.b(this, "default_event_parameters");
    }

    @Override // s3.AbstractC1195q0
    public final boolean G() {
        return true;
    }

    public final void H(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            iArr[i7] = sparseArray.keyAt(i7);
            jArr[i7] = ((Long) sparseArray.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f13882E.f0(bundle);
    }

    public final boolean I(int i7) {
        return C1198s0.h(i7, N().getInt("consent_source", 100));
    }

    public final boolean J(long j7) {
        if (j7 - this.f13879B.f() > this.f13883G.f()) {
            return true;
        }
        return false;
    }

    public final void K() {
        SharedPreferences sharedPreferences = ((C1175g0) this.f2765q).f14056q.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f13893s = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f13885I = z7;
        if (!z7) {
            SharedPreferences.Editor edit = this.f13893s.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f13896v = new U(this, Math.max(0L, ((Long) AbstractC1203v.d.a(null)).longValue()));
    }

    public final void L(boolean z7) {
        D();
        C1154I b7 = b();
        b7.f13803D.c(Boolean.valueOf(z7), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = N().edit();
        edit.putBoolean("deferred_analytics_collection", z7);
        edit.apply();
    }

    public final SharedPreferences M() {
        D();
        E();
        if (this.f13895u == null) {
            synchronized (this.f13894t) {
                try {
                    if (this.f13895u == null) {
                        String str = ((C1175g0) this.f2765q).f14056q.getPackageName() + "_preferences";
                        b().f13803D.c(str, "Default prefs file");
                        this.f13895u = ((C1175g0) this.f2765q).f14056q.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f13895u;
    }

    public final SharedPreferences N() {
        D();
        E();
        g3.n.g(this.f13893s);
        return this.f13893s;
    }

    public final SparseArray O() {
        Bundle a02 = this.f13882E.a0();
        if (a02 == null) {
            return new SparseArray();
        }
        int[] intArray = a02.getIntArray("uriSources");
        long[] longArray = a02.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                b().f13807v.d("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i7 = 0; i7 < intArray.length; i7++) {
                sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final C1198s0 P() {
        D();
        return C1198s0.d(N().getString("consent_settings", "G1"), N().getInt("consent_source", 100));
    }
}
