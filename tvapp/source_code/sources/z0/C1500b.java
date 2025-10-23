package z0;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: z0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16386a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16387b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16388c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final List f16389e;

    public C1500b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f16386a = str;
        this.f16387b = str2;
        this.f16388c = str3;
        this.d = arrayList;
        this.f16389e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1500b)) {
            return false;
        }
        C1500b c1500b = (C1500b) obj;
        if (!g.a(this.f16386a, c1500b.f16386a) || !g.a(this.f16387b, c1500b.f16387b) || !g.a(this.f16388c, c1500b.f16388c) || !g.a(this.d, c1500b.d)) {
            return false;
        }
        return g.a(this.f16389e, c1500b.f16389e);
    }

    public final int hashCode() {
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(this.f16386a.hashCode() * 31, 31, this.f16387b), 31, this.f16388c);
        return this.f16389e.hashCode() + ((this.d.hashCode() + i7) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f16386a + "', onDelete='" + this.f16387b + " +', onUpdate='" + this.f16388c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f16389e + '}';
    }
}
