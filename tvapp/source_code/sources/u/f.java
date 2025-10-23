package u;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f implements d {
    public final m d;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f14623g;

    /* renamed from: a  reason: collision with root package name */
    public m f14619a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14620b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14621c = false;

    /* renamed from: e  reason: collision with root package name */
    public int f14622e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f14624h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f14625i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14626j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f14627k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f14628l = new ArrayList();

    public f(m mVar) {
        this.d = mVar;
    }

    @Override // u.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f14628l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f14626j) {
                return;
            }
        }
        this.f14621c = true;
        m mVar = this.f14619a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f14620b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i7 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.f14626j) {
            g gVar = this.f14625i;
            if (gVar != null) {
                if (gVar.f14626j) {
                    this.f = this.f14624h * gVar.f14623g;
                } else {
                    return;
                }
            }
            d(fVar.f14623g + this.f);
        }
        m mVar2 = this.f14619a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f14627k.add(dVar);
        if (this.f14626j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f14628l.clear();
        this.f14627k.clear();
        this.f14626j = false;
        this.f14623g = 0;
        this.f14621c = false;
        this.f14620b = false;
    }

    public void d(int i7) {
        if (this.f14626j) {
            return;
        }
        this.f14626j = true;
        this.f14623g = i7;
        Iterator it = this.f14627k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f14636b.W);
        sb.append(":");
        sb.append(AbstractC0515y1.B(this.f14622e));
        sb.append("(");
        if (this.f14626j) {
            obj = Integer.valueOf(this.f14623g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f14628l.size());
        sb.append(":d=");
        sb.append(this.f14627k.size());
        sb.append(">");
        return sb.toString();
    }
}
