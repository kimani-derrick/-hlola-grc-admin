package h5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import d5.EnumC0557c;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public c f11026a;

    /* renamed from: b  reason: collision with root package name */
    public b f11027b;

    /* renamed from: c  reason: collision with root package name */
    public b f11028c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f11029e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11030g;

    /* renamed from: h  reason: collision with root package name */
    public int f11031h;

    /* renamed from: i  reason: collision with root package name */
    public int f11032i;

    /* renamed from: j  reason: collision with root package name */
    public int f11033j;

    /* renamed from: k  reason: collision with root package name */
    public int f11034k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11035l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11036m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public EnumC0557c f11037o;

    /* renamed from: p  reason: collision with root package name */
    public int f11038p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11039q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11040r;

    public final void a() {
        this.f11029e = -1;
        this.f11032i = 0;
        this.f11031h = 0;
        this.d = 0;
        this.f11033j = 0;
    }

    public final boolean b() {
        if (this.f11026a == c.f11015s) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i7 = this.f11029e + this.f11028c.f11013q;
        this.f11029e = i7;
        EnumC0557c enumC0557c = this.f11037o;
        if (enumC0557c != EnumC0557c.f9258q && this.f11039q) {
            int i8 = this.f11038p;
            if (i7 == i8) {
                this.f11029e = 0;
            } else if (i7 != -1) {
            } else {
                if (enumC0557c == EnumC0557c.f9259r) {
                    this.f11029e = i8 - 1;
                } else if (this.f11040r) {
                    this.f11029e = i8 - 1;
                    this.f11040r = false;
                }
            }
        }
    }

    public final void d(int i7) {
        this.d = Math.max(0, i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutRequest(direction=");
        sb.append(this.f11026a);
        sb.append(", fillSpace=");
        sb.append(this.d);
        sb.append(", currentPosition=");
        sb.append(this.f11029e);
        sb.append(", checkpoint=");
        return AbstractC0515y1.n(sb, this.f11033j, ", ");
    }
}
