package Z2;

import android.content.SharedPreferences;
import android.os.SystemClock;
import e2.q0;
import s3.T;
/* loaded from: classes.dex */
public final class A implements q {

    /* renamed from: q  reason: collision with root package name */
    public long f4589q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4590r;

    /* renamed from: s  reason: collision with root package name */
    public long f4591s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f4592t;

    /* renamed from: u  reason: collision with root package name */
    public Object f4593u;

    public A(B b7) {
        this.f4592t = b7;
        this.f4593u = q0.f10062t;
    }

    @Override // Z2.q
    public q0 a() {
        return (q0) this.f4593u;
    }

    @Override // Z2.q
    public void b(q0 q0Var) {
        if (this.f4590r) {
            c(d());
        }
        this.f4593u = q0Var;
    }

    public void c(long j7) {
        this.f4589q = j7;
        if (this.f4590r) {
            ((B) this.f4592t).getClass();
            this.f4591s = SystemClock.elapsedRealtime();
        }
    }

    @Override // Z2.q
    public long d() {
        long j7;
        long j8 = this.f4589q;
        if (this.f4590r) {
            ((B) this.f4592t).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4591s;
            q0 q0Var = (q0) this.f4593u;
            if (q0Var.f10063q == 1.0f) {
                j7 = H.J(elapsedRealtime);
            } else {
                j7 = elapsedRealtime * q0Var.f10065s;
            }
            return j8 + j7;
        }
        return j8;
    }

    public void e() {
        if (!this.f4590r) {
            ((B) this.f4592t).getClass();
            this.f4591s = SystemClock.elapsedRealtime();
            this.f4590r = true;
        }
    }

    public long f() {
        if (!this.f4590r) {
            this.f4590r = true;
            this.f4591s = ((T) this.f4593u).N().getLong((String) this.f4592t, this.f4589q);
        }
        return this.f4591s;
    }

    public void g(long j7) {
        SharedPreferences.Editor edit = ((T) this.f4593u).N().edit();
        edit.putLong((String) this.f4592t, j7);
        edit.apply();
        this.f4591s = j7;
    }

    public A(T t5, String str, long j7) {
        this.f4593u = t5;
        g3.n.c(str);
        this.f4592t = str;
        this.f4589q = j7;
    }
}
