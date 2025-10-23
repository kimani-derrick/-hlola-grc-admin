package s3;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.C0416e1;
import com.google.android.gms.internal.measurement.C0456m1;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public long f13907a;

    /* renamed from: b  reason: collision with root package name */
    public Object f13908b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f13909c;
    public Serializable d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193p0 f13910e;

    public U(T t5, long j7) {
        this.f13910e = t5;
        g3.n.c("health_monitor");
        g3.n.a(j7 > 0);
        this.f13908b = "health_monitor:start";
        this.f13909c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.f13907a = j7;
    }

    public void a(C0456m1 c0456m1) {
        this.f13908b = c0456m1;
    }

    public boolean b(long j7, C0416e1 c0416e1) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.f13909c) == null) {
            this.f13909c = new ArrayList();
        }
        if (!((ArrayList) this.d).isEmpty() && ((((C0416e1) ((ArrayList) this.d).get(0)).D() / 1000) / 60) / 60 != ((c0416e1.D() / 1000) / 60) / 60) {
            return false;
        }
        long a7 = this.f13907a + c0416e1.a(null);
        q1 q1Var = (q1) this.f13910e;
        q1Var.R();
        if (a7 >= Math.max(0, ((Integer) AbstractC1203v.f14327j.a(null)).intValue())) {
            return false;
        }
        this.f13907a = a7;
        ((ArrayList) this.d).add(c0416e1);
        ((ArrayList) this.f13909c).add(Long.valueOf(j7));
        int size = ((ArrayList) this.d).size();
        q1Var.R();
        if (size >= Math.max(1, ((Integer) AbstractC1203v.f14329k.a(null)).intValue())) {
            return false;
        }
        return true;
    }

    public void c() {
        T t5 = (T) this.f13910e;
        t5.D();
        ((C1175g0) t5.f2765q).f14037D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = t5.N().edit();
        edit.remove((String) this.f13909c);
        edit.remove((String) this.d);
        edit.putLong((String) this.f13908b, currentTimeMillis);
        edit.apply();
    }

    public U(q1 q1Var) {
        this.f13910e = q1Var;
    }
}
