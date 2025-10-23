package k4;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.android.gms.internal.measurement.C0445k0;
import com.google.android.gms.internal.measurement.C0450l0;
import com.google.android.gms.internal.measurement.C0465o0;
import com.google.android.gms.internal.measurement.C0470p0;
import com.google.android.gms.internal.measurement.C0484s0;
import com.google.android.gms.internal.measurement.T;
import java.util.List;
import java.util.Map;
import java.util.Random;
import s3.K0;
/* renamed from: k4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960a implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f12211a;

    public C0960a(C0430h0 c0430h0) {
        this.f12211a = c0430h0;
    }

    @Override // s3.K0
    public final long a() {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        T t5 = new T();
        c0430h0.e(new C0470p0(c0430h0, t5, 1));
        Long l7 = (Long) T.A(t5.z(500L), Long.class);
        if (l7 == null) {
            long nanoTime = System.nanoTime();
            c0430h0.f8567b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i7 = c0430h0.f + 1;
            c0430h0.f = i7;
            return nextLong + i7;
        }
        return l7.longValue();
    }

    @Override // s3.K0
    public final int b(String str) {
        return this.f12211a.a(str);
    }

    @Override // s3.K0
    public final void c(String str, String str2, Bundle bundle) {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        c0430h0.e(new C0445k0(c0430h0, str, str2, bundle, 0));
    }

    @Override // s3.K0
    public final void d(Bundle bundle) {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        c0430h0.e(new C0450l0(c0430h0, bundle, 0));
    }

    @Override // s3.K0
    public final void e(String str, String str2, Bundle bundle) {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        c0430h0.e(new C0484s0(c0430h0, str, str2, bundle));
    }

    @Override // s3.K0
    public final void f(String str) {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        c0430h0.e(new C0465o0(c0430h0, str, 1));
    }

    @Override // s3.K0
    public final String g() {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        T t5 = new T();
        c0430h0.e(new C0470p0(c0430h0, t5, 2));
        return (String) T.A(t5.z(50L), String.class);
    }

    @Override // s3.K0
    public final String h() {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        T t5 = new T();
        c0430h0.e(new C0470p0(c0430h0, t5, 4));
        return (String) T.A(t5.z(500L), String.class);
    }

    @Override // s3.K0
    public final List i(String str, String str2) {
        return this.f12211a.c(str, str2);
    }

    @Override // s3.K0
    public final void j(String str) {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        c0430h0.e(new C0465o0(c0430h0, str, 0));
    }

    @Override // s3.K0
    public final Map k(String str, String str2, boolean z7) {
        return this.f12211a.d(str, str2, z7);
    }

    @Override // s3.K0
    public final String l() {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        T t5 = new T();
        c0430h0.e(new C0470p0(c0430h0, t5, 3));
        return (String) T.A(t5.z(500L), String.class);
    }

    @Override // s3.K0
    public final String m() {
        C0430h0 c0430h0 = this.f12211a;
        c0430h0.getClass();
        T t5 = new T();
        c0430h0.e(new C0470p0(c0430h0, t5, 0));
        return (String) T.A(t5.z(500L), String.class);
    }
}
