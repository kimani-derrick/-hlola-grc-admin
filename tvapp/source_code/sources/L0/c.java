package L0;

import java.io.IOException;
import java.util.ArrayList;
import v6.w;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f1865a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1866b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1867c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1868e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public b f1869g;

    /* renamed from: h  reason: collision with root package name */
    public int f1870h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f1871i;

    public c(g gVar, String str) {
        this.f1871i = gVar;
        this.f1865a = str;
        gVar.getClass();
        this.f1866b = new long[2];
        gVar.getClass();
        this.f1867c = new ArrayList(2);
        gVar.getClass();
        this.d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        gVar.getClass();
        for (int i7 = 0; i7 < 2; i7++) {
            sb.append(i7);
            this.f1867c.add(this.f1871i.f1883q.c(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.f1871i.f1883q.c(sb.toString()));
            sb.setLength(length);
        }
    }

    public final d a() {
        if (!this.f1868e || this.f1869g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.f1867c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            g gVar = this.f1871i;
            if (i7 < size) {
                if (!gVar.F.f((w) arrayList.get(i7))) {
                    try {
                        gVar.V(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i7++;
            } else {
                this.f1870h++;
                return new d(gVar, this);
            }
        }
    }
}
