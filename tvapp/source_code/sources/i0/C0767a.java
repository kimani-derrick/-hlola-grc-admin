package i0;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
/* renamed from: i0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0767a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11311a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11312b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11313c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f11314e;
    public ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f11315g;

    public C0767a(String str) {
        this(str, false, true);
    }

    public final void a(C0768b c0768b) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(c0768b);
    }

    public final void b(C0768b c0768b) {
        if (this.f11315g == null) {
            this.f11315g = new ArrayList();
        }
        this.f11315g.add(c0768b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f11311a);
        sb.append(" ");
        return AbstractC0515y1.n(sb, this.d, "]");
    }

    public C0767a(String str, boolean z7, boolean z8) {
        this.d = 0;
        this.f11314e = 0;
        this.f11311a = str;
        this.f11312b = z7;
        this.f11313c = z8;
    }

    public void c() {
    }
}
