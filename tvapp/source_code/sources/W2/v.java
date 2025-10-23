package W2;

import O3.C;
import O3.E;
import O3.U;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class v {

    /* renamed from: e  reason: collision with root package name */
    public int f3887e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f3888g;

    /* renamed from: h  reason: collision with root package name */
    public int f3889h;

    /* renamed from: l  reason: collision with root package name */
    public E f3893l;

    /* renamed from: m  reason: collision with root package name */
    public int f3894m;
    public E n;

    /* renamed from: o  reason: collision with root package name */
    public int f3895o;

    /* renamed from: p  reason: collision with root package name */
    public int f3896p;

    /* renamed from: q  reason: collision with root package name */
    public int f3897q;

    /* renamed from: r  reason: collision with root package name */
    public E f3898r;

    /* renamed from: s  reason: collision with root package name */
    public E f3899s;

    /* renamed from: t  reason: collision with root package name */
    public int f3900t;

    /* renamed from: u  reason: collision with root package name */
    public int f3901u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3902v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3903w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3904x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap f3905y;

    /* renamed from: z  reason: collision with root package name */
    public HashSet f3906z;

    /* renamed from: a  reason: collision with root package name */
    public int f3884a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f3885b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f3886c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public int f3890i = Integer.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f3891j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3892k = true;

    public v() {
        C c5 = E.f2597r;
        U u7 = U.f2621u;
        this.f3893l = u7;
        this.f3894m = 0;
        this.n = u7;
        this.f3895o = 0;
        this.f3896p = Integer.MAX_VALUE;
        this.f3897q = Integer.MAX_VALUE;
        this.f3898r = u7;
        this.f3899s = u7;
        this.f3900t = 0;
        this.f3901u = 0;
        this.f3902v = false;
        this.f3903w = false;
        this.f3904x = false;
        this.f3905y = new HashMap();
        this.f3906z = new HashSet();
    }

    public void a(int i7) {
        Iterator it = this.f3905y.values().iterator();
        while (it.hasNext()) {
            if (((u) it.next()).f3882q.f1135s == i7) {
                it.remove();
            }
        }
    }

    public final void b(w wVar) {
        this.f3884a = wVar.f3922q;
        this.f3885b = wVar.f3923r;
        this.f3886c = wVar.f3924s;
        this.d = wVar.f3925t;
        this.f3887e = wVar.f3926u;
        this.f = wVar.f3927v;
        this.f3888g = wVar.f3928w;
        this.f3889h = wVar.f3929x;
        this.f3890i = wVar.f3930y;
        this.f3891j = wVar.f3931z;
        this.f3892k = wVar.f3907A;
        this.f3893l = wVar.f3908B;
        this.f3894m = wVar.f3909C;
        this.n = wVar.f3910D;
        this.f3895o = wVar.f3911E;
        this.f3896p = wVar.F;
        this.f3897q = wVar.f3912G;
        this.f3898r = wVar.f3913H;
        this.f3899s = wVar.f3914I;
        this.f3900t = wVar.f3915J;
        this.f3901u = wVar.f3916K;
        this.f3902v = wVar.f3917L;
        this.f3903w = wVar.f3918M;
        this.f3904x = wVar.f3919N;
        this.f3906z = new HashSet(wVar.f3921P);
        this.f3905y = new HashMap(wVar.f3920O);
    }

    public v c(int i7, int i8) {
        this.f3890i = i7;
        this.f3891j = i8;
        this.f3892k = true;
        return this;
    }
}
